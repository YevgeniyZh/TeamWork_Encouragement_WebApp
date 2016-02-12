
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" type="text/css" href="Styles/style.css">
        <script type="text/javascript" src="Includes/javascript.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homepage</title>
    </head>
    <body>
        
         <c:if test="${sessionScope.user == null}">
             <c:redirect url="login.jsp"/>
        </c:if>
        
        <a>WELCOME</a><br>
        <a class="fullname-target">${user.fullname}</a>
        
        
        <h1>Home</h1>
        
        
        
       <form class="logout" action="login" method="post" >
       <input name="action" type="hidden" value="logout"> 
<button name="logout"  type="submit" value ="logout" >Logout</button>
                    </form> 
        
        
        
         <br>
            <br>
            <br>
        <a onmouseover="alerter()">HOVER TO TEST JAVASCRIPT</a>
        
        
        
        
        
        
    </body>
</html>
