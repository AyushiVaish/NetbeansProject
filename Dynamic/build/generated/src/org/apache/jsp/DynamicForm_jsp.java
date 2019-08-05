package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DynamicForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dynamic Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <B>form </B>\n");
      out.write("        <form action=\"DynamicForm.jsp\" method =\"POST\">\n");
      out.write("            <table border =0 cellspacing =0 cellpadding =0>\n");
      out.write("                ");
 
                String [] textFields = {"FirstName" ,"LastName" , "Address" ,"City" ,"Zip"};
                for(int j=0;j<textFields.length ; j++) {
                
      out.write("\n");
      out.write("                <tr> <td> ");
      out.print(textFields[j] );
      out.write(":\n");
      out.write("                    <td><input type = text name = ");
      out.print(textFields[j]);
      out.write("></td>\n");
      out.write("           \n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>State </td>\n");
      out.write("                    <td><select name =\" State\" >\n");
      out.write("                        ");
 String[] states = {"AA" ,"CA","NM","MA" ,"..."};
                        for (int s=0;s<states.length;s++) { 
      out.write("\n");
      out.write("                        <option > ");
      out.print(states[s] );
      out.write(" </option>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> <td>Card Number </td>\n");
      out.write("                    <td><select name = CardType>\n");
      out.write("                        ");
 String[] cTypes = {"Amex" , "Master Card", "Discovery" , "..."};
                        for (int t=0; t<cTypes.length;t++) { 
      out.write("\n");
      out.write("                        <option>");
      out.print(cTypes[t] );
      out.write("</option>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                        <input type =\"submit\" value =\"submit\">\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
      out.write("        <b>Form Content </b> <br>\n");
      out.write("        <table>\n");
      out.write("            ");
 java.util.Enumeration parameters = request.getParameterNames();
            while (parameters.hasMoreElements()) {
                String parameterName = (String)parameters.nextElement();
                String parameterValue = request.getParameter(parameterName);
                    
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(parameterName );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(parameterValue );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </table>\n");
      out.write("            \n");
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
