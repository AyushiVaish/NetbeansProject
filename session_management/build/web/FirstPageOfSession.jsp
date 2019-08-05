<%-- 
    Document   : FirstPageOfSession
    Created on : Oct 2, 2018, 10:37:23 PM
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
            String password = request.getParameter("password");
            if(name.equals("Ayushi")&& password.equals("dbit"))
            {
                session.setAttribute("username", name);
                response.sendRedirect("NextPageAfterFirst.jsp");
            }
            else
            {
                out.println("<h1> Sorry dear you are not good enough for JSP</h1>");
            }
            
            %>
    </body>
</html>
