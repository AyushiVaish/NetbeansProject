package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class updateAnyData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String connectionURL="jdbc:derby://localhost:1527/emp";
Connection connection=null;
PreparedStatement statement=null;
ResultSet rs=null;

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Update.jsp\" method=\"post\">\n");
      out.write("        <table border=\"2\" padding=\"4\" align=\"center\">\n");
      out.write("            <th>ROLL NO</th><th>NAME</th><th>EMAIL ID</th>\n");
      out.write("            ");
 

                   try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                    int value1=Integer.parseInt(request.getParameter("ListOfRollNo"));
                    connection = DriverManager.getConnection(connectionURL,"emp","emp");
                    
                    String sql="select ID,NAME,EMAIL_ID from emp where id=?";
                    statement=connection.prepareStatement(sql);
                    statement.setInt(1,value1);
                    rs=statement.executeQuery();
                         while(rs.next())
                    {
      out.write("\n");
      out.write("            <tr><td><input type=\"text\" value=\"");
      out.print(rs.getInt("id"));
      out.write("\" readonly=\"true\" name=\"t1\"</td> \n");
      out.write("            <td><input type=\"text\" value=\"");
      out.print(rs.getString("name"));
      out.write("\" name=\"t2\"</td>\n");
      out.write("            <td><input type=\"text\" value=\"");
      out.print(rs.getString("email_id"));
      out.write("\" name=\"t3\"</td> </tr>\n");
      out.write("            <tr><td>  <input type=\"submit\" value=\"Save Changes\"></td></tr>\n");
 } 
      out.write('\n');
rs.close();
}
catch(SQLException se)
{
se.printStackTrace();
}
catch(Exception e)
{
e.printStackTrace();
                    }
                
                
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
