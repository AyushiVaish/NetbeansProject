<%-- 
    Document   : setcookies
    Created on : Oct 2, 2018, 10:12:14 PM
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
        <h1>Setting Cookies values</h1>
        First Name : <%=request.getParameter("first_name")%> </br>
        Last Name : <%= request.getParameter ("last_name") %> </br>
        <%
            Cookie firstName = new Cookie("first_name",request.getParameter("first_name"));
            Cookie lastName = new Cookie ("last_name",request.getParameter("last_name"));
            firstName.setMaxAge(60*60*24);
            lastName.setMaxAge(60*60*24);
            response.addCookie(firstName);
            response.addCookie(lastName);
            %>
            <a href="showcookievalue.jsp" > Next page to view the cookies value </a>
    </body>
</html>
