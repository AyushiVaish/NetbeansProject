<%-- 
    Document   : showcookievalue
    Created on : Oct 2, 2018, 10:18:16 PM
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
        <h1> Reading Cookies </h1>
        <%
       Cookie cookie = null;
       Cookie[] cookies = null;
       cookies=request.getCookies();
       if(cookies!=null)
       {
           out.println("<h2>Found cookies name and value </h2>");
           for (int i=0 ; i<cookies.length;i++)
           {cookie = cookies[i];
           out.println("Name :" + cookie.getName() + ",");
           out.print("Value : " + cookie.getValue () + "</br>");
           
           }
       }
       
       else
       {
           out.println("No cookies found");
                  
       }
        %>
    </body>
</html>
