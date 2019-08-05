<%-- 
    Document   : getmoreinfo
    Created on : Oct 4, 2018, 3:24:12 PM
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
            String name =request.getParameter("name");
            String color = request.getParameter("color");
            
            %>
            <body bgcolor="<%=color%>">
                Hello <%=name%>
    </body>
</html>
