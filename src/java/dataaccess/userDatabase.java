
package dataaccess;

import getAndSet.User;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.*;
import javax.swing.JOptionPane;


public class userDatabase {
    
   
////////////////////////////////////////////////////////////////////////////////
    public static int insert(User user) throws FileNotFoundException, IOException, SQLException {
        
                               // get a connection
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();


            //create insert query and statement
   String query="insert into user(userID,fullname,username,email,groupName,instructor,password) values(?,?,?,?,?,?,?)";
          PreparedStatement pst =(PreparedStatement) connection.prepareStatement(query);//puts query into statement
          
          
          try{

                      //inserts the information into the ?,?,?,? areas for values
         pst.setString(1,user.getUserID());
         pst.setString(2,user.getFullname());
         pst.setString(3,user.getUsername());
         pst.setString(4, user.getEmail()); 
         pst.setString(5,user.getGroup()); 
         pst.setString(6,user.getInstructor());
         pst.setString(7,user.getPassword()); 

            //send the query to mySql
           
         int i = pst.executeUpdate();
          
          
          if(i==1){
              System.out.print("\nInput to SQL Successful\n");
          }else{
              System.out.print("\nInput to SQL failed\n");
          }
             

    }   catch (SQLException e) {
                System.out.print(e);
           return 0;
        }finally{
            databaseUtil.closePreparedStatement(pst);
            pool.freeConnection(connection);
        }
        return 0;

    } 
    
////////////////////////////////////////////////////////////////////////////////    
    
       public static User select(String username) throws SQLException {

        
        User user= new User();
                                // get a connection
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        
                             // create a statement
           Statement statement = connection.createStatement();

                                  
             try{

             ResultSet rs = statement.executeQuery("SELECT * FROM user"+" WHERE username='"+username+"'");
             
            while(rs.next()){

                user.setUserID(rs.getString("UserID"));
                user.setFullname(rs.getString("fullname"));
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
              user.setPassword(rs.getString("password"));
              user.setGroup(rs.getString("groupName"));
              user.setInstructor(rs.getString("instructor"));
              
            }

            }catch(SQLException e ){

              }finally{
         
            databaseUtil.closePreparedStatement(statement);
            pool.freeConnection(connection);
            }
        return user;
   
    } 
    
////////////////////////////////////////////////////////////////////////////////
       
       
       
       
       
       
       
       
       
       
       
}