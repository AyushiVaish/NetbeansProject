<%-- 
    Document   : a.jsp
    Created on : Dec 31, 2018, 5:33:45 PM
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
      String name=request.getParameter("category");
      if(name.equals("a"))
      {
          response.sendRedirect("b.jsp");
      }
      else
          if(name.equals("b"))
              {
                  response.sendRedirect("c.jsp");
              }
      %>
    </body>
</html>
