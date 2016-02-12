
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Styles/style.css">
         <script type="text/javascript" src="Includes/javascript.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        
        
            <form class="login" action="home" method="post" >
         <input class="register-input" name="action" type="hidden" value="login">
                <fieldset>
       <span class="register-title"> Login </span>
        <legend class="messageOut"><c:out value="${user.message}" /></legend> 
            <label class="pad_top">Username</label>
            <input class="register-input"  type="username" name="username"  required><br>
            <label class="pad_top">password</label>
            <input class="register-input" type="password" name="password" minlength="7" required><br>
            <button class="register-button" name="submit" type="submit" value="Login"> Login</button>
            <button class="register-button" name="reset"  type="reset" value ="Reset" >Reset</button>
                    
            
     <a href="register.jsp"><input type="button" value="Register" /></a>


                  </fieldset>

     </form>
            <br>
            <br>
            <br>
<a onmouseover="alerter()">HOVER TO TEST JAVASCRIPT</a>
        
        
        
    </body>
</html>
