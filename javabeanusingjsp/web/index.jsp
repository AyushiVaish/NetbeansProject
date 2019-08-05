<%-- 
    Document   : index
    Created on : Oct 15, 2018, 8:31:38 PM
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
        <jsp:useBean id ="Student" class="p1.StudentBean">
            <jsp:setProperty name = "Student" property="firstName" value="<%=request.getParameter("fn")%>"/>
            <jsp:setProperty name = "Student" property="lastName" value="<%=request.getParameter("ln")%>"/>
            <jsp:setProperty name = "Student" property="age" value="<%=Integer.parseInt(request.getParameter("age"))%>"/>
        </jsp:useBean>
    <center>
        <p>
            Student FirstName : 
            <jsp:getProperty name ="Student" property="firstName" />
        </p>
        <p>
           Student LastName : 
           <jsp:getProperty name ="Student" property="lastName" />
            </p>
            <p>
              Student Age : 
            <jsp:getProperty name ="Student" property="age" />
            </p>
    </center>
    </body>
</html>
