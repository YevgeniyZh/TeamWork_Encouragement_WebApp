
package controller;

import dataaccess.databaseUtil;
import dataaccess.userDatabase;
import getAndSet.User;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;



@WebServlet(name = "mainServlet", urlPatterns = {"/mainServlet"})
@MultipartConfig
public class mainServlet extends HttpServlet {
    
    @Override
@SuppressWarnings("null")
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException, FileNotFoundException {
        
        
        String action = request.getParameter("action");
    
        String url = "/home.jsp";
        
        User user = new User();
        
        ServletContext servletContext = request.getSession().getServletContext();
        
        HttpSession session = request.getSession();
        
 
        
        
        
        
        
////////////////////////////////////////////////////////////////////////////////

//Registration
        if(action.equals("register")){
        
        //Registration Parameters
        String email  = request.getParameter("email");
        String password  = request.getParameter("password");
        String fullName = request.getParameter("fullName");
        String username = request.getParameter("username");
        String instructor = request.getParameter("instructor");
        String group = request.getParameter("group");
        String userID = user.createUserId();
        
        
                //store variables in User object and insert into database
         user.setFullname(fullName);
         user.setEmail(email);
         user.setPassword(password);
         user.setUsername(username);
         user.setInstructor(instructor);
         user.setGroup(group);
         user.setUserID(userID);
         


         
         
            try {
                userDatabase.insert(user);
            } catch (SQLException ex) {
                Logger.getLogger(mainServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        url="/login.jsp";
         }
////////////////////////////////////////////////////////////////////////////////        
        
 //Login Validation      
 if(action.equals("login")){
                   
     String username  = request.getParameter("username");
     String password  = request.getParameter("password");
     
    user.setEmail(username);


    try {
      
      User user2 = userDatabase.select(username); 
      

        if(user2.getUsername().equals(null)){
                    
            url="/signup.jsp";
            String message="That email isn't registered yet! ";
            //user.setMessage(message);
        
        }else if (username.equals(user2.getUsername())&& password.equals(user2.getPassword())){
            
            
            session.setAttribute("login",true);
            session.setAttribute("user",user2);
           
      
            url="/home.jsp";
        }
        
        
        else{
           String message="User or password incorrect. ";
            //user.setMessage(message);
            
            url="/login.jsp";
            
        }
    }       catch (SQLException ex) {
                Logger.getLogger(mainServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
    

}




        
        
 ///////////////////////////////////////////////////////////////////////////////       
        if(action.equals("logout")){// used to log out 
    session.invalidate();
    session = request.getSession(); // so if no session is active no session is created
   
    
    if (session != null)
        session.setMaxInactiveInterval(1); 
    
    //Deletes Cookies
    Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
        cookie.setMaxAge(0); //delete the cookie
        cookie.setPath("/"); //allow the download application to access it
        response.addCookie(cookie);
} 
    
    
    url="/login.jsp";
    }
        
        
 ///////////////////////////////////////////////////////////////////////////////       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // store User object in request
      getServletContext().getRequestDispatcher(url).forward(request, response);
        
        
        
    }//end of do get
    
    
    
    
    
    
    
    
    
    
    
      @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException, FileNotFoundException {
        doGet(request, response);
        

        
        
                }//end of do post 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//end of main servlet
    
    
    
  
