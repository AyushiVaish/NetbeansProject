<%-- 
    Document   : displayall
    Created on : Oct 18, 2018, 3:12:03 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<%! String connectionURL="jdbc:derby://localhost:1527/emp";
Connection connection=null;
Statement statement=null;
ResultSet rs=null;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="2" padding="4" align="center">
            <th>ROLL NO</th><th>NAME</th><th>EMAIL ID</th>
            <%
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                    connection = DriverManager.getConnection(connectionURL,"emp","emp");
                    statement=connection.createStatement();
                    String sql="select ID,NAME,EMAIL_ID from emp";
                    rs=statement.executeQuery(sql);
                    
                    while(rs.next())
                    {%>
            <tr><td><%=rs.getInt("id")%></td> 
            <td><%=rs.getString("name")%></td>
            <td><%=rs.getString("email_id")%></td> </tr>
<% } %>
<%rs.close();
}
catch(SQLException se)
{
se.printStackTrace();
}
catch(Exception e)
{
e.printStackTrace();
                    }
                
                %>
        </table>     
    </body>
</html>
