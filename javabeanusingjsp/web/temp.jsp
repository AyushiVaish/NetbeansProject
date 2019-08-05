<%-- 
    Document   : temp
    Created on : Oct 15, 2018, 8:52:19 PM
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
        <jsp:useBean id ="temp" class="p1.TempConverterBean">
            <jsp:setProperty name ="temp" property="celsius" value="<%=Integer.parseInt(request.getParameter("celsius")) %>"/>;
           
        </jsp:useBean>
            Equivalent Temperature in Fahrenheit :
            <input type ="text" name="fah" value="<jsp:getProperty name="temp" property="fahreinheit" />   </body>
</html>
