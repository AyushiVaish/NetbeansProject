<%-- 
    Document   : displayAnyData
    Created on : Oct 25, 2018, 3:11:46 PM
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
        <table border="2" padding="4" align="center">
            <th>ROLL NO</th><th>NAME</th><th>EMAIL ID</th>
            <%
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                    int value1=Integer.parseInt(request.getParameter("ListOfRollNo"));
                    connection = DriverManager.getConnection(connectionURL,"emp","emp");
                    
                    String sql="select ID,NAME,EMAIL_ID from emp where id=?";
                    statement=connection.prepareStatement(sql);
                    statement.setInt(1,value1);
                    rs=statement.executeQuery();
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
