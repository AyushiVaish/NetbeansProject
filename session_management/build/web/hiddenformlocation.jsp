<%-- 
    Document   : hiddenformlocation
    Created on : Oct 2, 2018, 9:52:07 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <% 
         String username = request.getParameter("username");
         String password = request.getParameter("password");
         %>
         <form method ="post" action="ShowHiddenForm.jsp">
             Username : <input type ="hidden" name="username" value="<%=username%>"/> <br>
             Password : <input type ="hidden" name="password" value="<%=password%>"/> <br>
             <input type ="submit" value ="Display Hidden Data"/>
         </form>
    </body>
</html>
