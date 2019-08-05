<%-- 
    Document   : ShowHiddenForm
    Created on : Oct 2, 2018, 9:57:29 PM
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
            String username =request.getParameter("username");
            String password = request.getParameter("password");
            %>
            Here is the data you set : <br>
            Username : <%=username %> <br>
            Password : <%=password %> <br>
    </body>
</html>
