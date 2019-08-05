<%-- 
    Document   : factjsp
    Created on : Sep 19, 2018, 10:39:50 PM
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
            int fact,i;
        fact=1;
        int num= Integer.parseInt(request.getParameter("number"));
        for (i=num; i>0;i--)
        fact = fact * i;
        out.println("The factorial of a " + num + " is : " + fact);
        
        %>
    </body>
</html>
