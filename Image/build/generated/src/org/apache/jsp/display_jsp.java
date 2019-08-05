package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;
import java.io.*;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


 String connectionURL="jdbc:derby://localhost:1527/image";
    Connection connection =null;
    PreparedStatement ps=null;
    ResultSet rs= null;
    
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"displayImage.jsp\">\n");
      out.write("            ");

                try
                {
           Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
          connection=DriverManager.getConnection(connectionURL,"image","image");
          String sql= "select photoName from image";
          ps=connection.prepareStatement(sql);  
          rs=ps.executeQuery();
          
                
                
      out.write("\n");
      out.write("                <p>Select image for dispay\n");
      out.write("                    <select name=\"Listofimg\">\n");
      out.write("                        ");
while(rs.next())
                        {
                            String name= rs.getString("photoName");
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print( name );
      out.write("\"> ");
      out.print(name );
      out.write(" </option>\n");
      out.write("                            ");
}

      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </p>\n");
      out.write("                ");
 
                    }
catch(SQLException sq)
{
out.print(sq);

}

      out.write("\n");
      out.write("<input type=\"submit\" value=\"display\">\n");
      out.write("        </form>    </body>\n");
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
