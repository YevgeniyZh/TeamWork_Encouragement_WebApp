
package getAndSet;

import java.io.Serializable;
import java.util.Random;


public class User implements Serializable {
   
    private String password;
    private String email;
    private String username;
    private String fullname;
    private String group;
    
    private String userID;
    
    private String instructor;
    
    public User(){
        
        password=null;
        email=null;
        username=null;
        fullname=null;
        group=null;
        userID=null;
        instructor="n";
        

        
        
        
        
        
    }
    
////////////////////////////////////////////////////    
    public void setPassword(String password){
        this.password=password;
       
    }
    
    public String getPassword(){
        return password;
    }
////////////////////////////////////////////////////    
    public void setEmail(String email){
        this.email=email;
       
    }
    
    public String getEmail(){
        return email;
    }
////////////////////////////////////////////////////   
    public void setUsername(String username){
        this.username=username;
       
    }
    
    public String getUsername(){
        return username;
    }
    
////////////////////////////////////////////////////   
    public void setFullname(String fullname){
        this.fullname=fullname;
       
    }
    
    public String getFullname(){
        return fullname;
    }
    
 ////////////////////////////////////////////////////   
    
    public void setGroup(String group){
        this.group=group;
       
    }
    
    public String getGroup(){
        return group;
    }
    
 ////////////////////////////////////////////////////   
    
   public String createUserId(){
        int randomInt=0;
        String userIDstring;
        
        Random randomGenerator = new Random();
    for (int idx = 1; idx <= 10; ++idx){
      randomInt = randomGenerator.nextInt(100000);
        
    }
    
    userIDstring=Integer.toString(randomInt);
       
        return userIDstring;
    }
    
    
    
    public void setUserID(String userID){
        this.userID=userID;
       
    }
    
    public String getUserID(){
        return userID;
    }
    
////////////////////////////////////////////////////    
    
    public void setInstructor(String instructor){
        this.instructor=instructor;
       
    }
    
    public String getInstructor(){
        return instructor;
    }
////////////////////////////////////////////////////    
    
}
