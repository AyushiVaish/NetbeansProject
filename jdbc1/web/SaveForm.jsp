<%-- 
    Document   : SaveForm
    Created on : Oct 15, 2018, 9:18:03 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<%! String connectionURL="jdbc:derby://localhost:1527/emp";
Connection connection=null;
PreparedStatement statement=null;
ResultSet rs=null;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <% 
         try {
             Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
              int value1=Integer.parseInt(request.getParameter("id"));
              String value2=request.getParameter("name");
              String value3=request.getParameter("email");
              String sql = "insert into emp values(?,?,?)" ;
                connection = DriverManager.getConnection(connectionURL,"emp","emp");
                statement=connection.prepareStatement(sql);
                statement.setInt(1,value1);
                 statement.setString(2,value2);
                  statement.setString(3,value3);
                  statement.executeUpdate();
                  out.print("The data has been successfully updated to database");
                               
         }
         catch (SQLException e)
         {
             e.printStackTrace();
         }
         %>
    </body>
</html>
