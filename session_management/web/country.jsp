<%-- 
    Document   : country
    Created on : Oct 4, 2018, 3:59:26 PM
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
        String Capital=request.getParameter("capital");
        
        %>
        <br>The capital of the country you selected is : <%= Capital %>
        
    </body>
</html>
