<%-- 
    Document   : UserLogged
    Created on : Nov 14, 2018, 5:31:28 PM
    Author     : USER
--%>

<%@page import="login.FormBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method ="post" action ="logout.jsp">
            <center>
                <% FormBean currentUser=(FormBean)(session.getAttribute("currentSessionUser")); %>
               " Welcome " + <%= currentUser.getUserName() %>;
         
                <input type ="submit" value="logout" name="logout">
               
                
        </form>
    </body>
</html>
