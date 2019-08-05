<%-- 
    Document   : multiply
    Created on : Sep 30, 2018, 8:41:01 PM
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
            int num1 =Integer.parseInt(request.getParameter("num1"));
            int num2 =Integer.parseInt(request.getParameter("num2"));
            int mul = num1 * num2;
            out.print("The multiply of " + num1 + " and " + num2 + " is: " + mul);
                    %>
    </body>
</html>
