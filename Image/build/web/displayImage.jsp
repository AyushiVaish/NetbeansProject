<%-- 
    Document   : displayImage.jsp
    Created on : Nov 26, 2018, 9:44:16 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<%@page import ="javax.sql.*" %>
<%@page import ="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             String connectionURL="jdbc:derby://localhost:1527/image";
             Blob image=null;
             
    Connection connection =null;
    byte[] imgData=null;
    PreparedStatement ps=null;
    ResultSet rs= null;
    try
    {
        String name=request.getParameter("Listofimg");
         Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
          connection=DriverManager.getConnection(connectionURL,"image","image");
          String sql= "select photo from image where photoName=?";
          ps=connection.prepareStatement(sql);  
          ps.setString(1,name);
          rs=ps.executeQuery();
          if(rs.next())
          {
              image=rs.getBlob(1);
              imgData=image.getBytes(1,(int)image.length());
          }
          else
          {
              out.println("image not found");
              return;
          }
      response.setContentType("image/jpg");
      OutputStream o=response.getOutputStream();
      o.write(imgData);
      o.flush();
      o.close();
    }
    catch(Exception e)
    {
        e.printStackTrace();
        
    }
    %>
    
    </body>
</html>
