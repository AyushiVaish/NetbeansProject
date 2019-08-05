<%-- 
    Document   : Vaidation
    Created on : Sep 19, 2018, 10:30:35 PM
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
        String fn,ln,add,zip,state,username,email;
        fn=request.getParameter("firstname");
ln=request.getParameter("lastname");
add=request.getParameter("addr");
state=request.getParameter("state");
email=request.getParameter("email");
username=request.getParameter("username");
zip=request.getParameter("zip");
out.print("<center>");
out.print("<b>");
out.print("******Your Details are as follows*****" + "<br>");
out.print("Full name :" +fn+ " " +ln+ "<br>" );
out.print("Address : " + add + "<br>");
out.print("State : " +state+ "<br>" );
out.print("email id : " +email + "<br>");
out.print("username :" +username + "<br>");    
out.print("zip code : "+zip+ "<br>");
out.print("</b>");    
out.print("</center>");
        %>
        
    </body>
</html>
