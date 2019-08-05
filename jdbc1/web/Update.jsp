<%-- 
    Document   : Update
    Created on : Oct 29, 2018, 10:15:45 AM
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
              int value1=Integer.parseInt(request.getParameter("t1"));
              String value2=request.getParameter("t2");
              String value3=request.getParameter("t3");
           
                connection = DriverManager.getConnection(connectionURL,"emp","emp");
                   String sql = "update emp set name=?,email_id=? where id=?" ;
                statement=connection.prepareStatement(sql);
              
                 statement.setString(1,value2);
                  statement.setString(2,value3);
                    statement.setInt(3,value1);
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
