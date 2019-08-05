<%-- 
    Document   : deleteData
    Created on : Oct 29, 2018, 7:47:26 PM
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
                    int value1=Integer.parseInt(request.getParameter("ListOfRollNo"));
                    connection = DriverManager.getConnection(connectionURL,"emp","emp");
                    
                    String sql="delete from emp where id=?";
                    statement=connection.prepareStatement(sql);
                    statement.setInt(1,value1);
                    statement.execute();
                     out.print("The data has been successfully deleted from database");
                               
         }
         catch (SQLException e)
         {
             e.printStackTrace();
         }
           catch(Exception e)
        {
            e.printStackTrace();
        }
                    %>
    </body>
</html>
