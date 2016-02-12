
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" type="text/css" href="Styles/style.css">
        <script type="text/javascript" src="Includes/javascript.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <%@ include file="Includes\header.jsp" %>
        
        
        
        <h1>Register</h1>
        
        
        
        
                                  <fieldset>
                <div id="forms">
                    
                    <form class="register" action="login" method="post">
            <input name="action" type="hidden" value="register">
 
                        
                        
  
                   <span class="register-title">Enter information below:</span>
                    
                    <legend class="register-invalid"> <output id="result"/></legend> 
                    
                    
                    
               
                      
                           
                     <label class="pad_top">Full Name </label>
                        <input class="register-input" type="text" id="f" name="fullName" required> 
                    <br>
                           
                        <label class="pad_top">Email</label>
                        <input class="register-input" type="email" id="e" name="email" required><br>
             
                        <label class="pad_top">Username</label>
                        <input class="register-input" type="text" id="n" name="username" required ><br>
                        
                        <label class="pad_top">Group</label>
                        <input class="register-input" type="text" id="n" name="group" required ><br>
                        
                        <label class="pad_top">Instructor</label>
                        <input class="register-input" type="text" id="n" name="instructor" required ><br>
                        
                        
                   <label class="pad_top">Password</label>
                   <input class="register-input" type="password" name="password" pattern=".{7,}" required>
                    
                       
                       
                    <br>   
                    
                <br><br>
            

            
               <button class="register-button" type="submit" value="register" > Register </button>
         </form>
        
</fieldset>
   
            

            
            
        <br>
            <br>
            <br>
<a onmouseover="alerter()">HOVER TO TEST JAVASCRIPT</a>

                    
                      
         
                           
                           

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        <%@ include file="Includes\footer.jsp" %>
    </body>
</html>
