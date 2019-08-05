package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type =\"text/javascript\" >\n");
      out.write("            window.onload = function() {\n");
      out.write("                var txtPassword = document.getElementById(\"txtPassword\");\n");
      out.write("                var txtConfirmPassword = document.getElementById(\"txtConfirmPassword\");\n");
      out.write("                txtPassword.onchange= ConfirmPassword;\n");
      out.write("                txtConfirmPassword.onkeyup= ConfirmPassword;\n");
      out.write("                function ConfirmPassword() {\n");
      out.write("                    txtConfirmPassword.setCustomValidity(\"\");\n");
      out.write("                    if(txtPassword.value != txtConfirmPassword.value) {\n");
      out.write("                        txtConfirmPassword.setCustomValidity(\"Passwords do not much\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"ControllerServlet\" id=\"form1\">\n");
      out.write("            <center>\n");
      out.write("                <div>\n");
      out.write("                    \n");
      out.write("                    <table border =\"2\" align=\"center\">\n");
      out.write("                                <caption> <h2>\n");
      out.write("                            New User Registration Form \n");
      out.write("                                    </h2></caption>\n");
      out.write("                                    <tr><td><label for =\"txtUsername\">\n");
      out.write("                            Username\n");
      out.write("                                </label></td>\n");
      out.write("                                <td><input name=\"txtUsername\" type=\"email\" id=\"txtUsername\" placeholder=\"Enter your email\" required /></td></tr>\n");
      out.write("                                    </br>\n");
      out.write("                                            <tr><td>\n");
      out.write("                                                    <label for =\"txtPassword\">\n");
      out.write("                                                        Password\n");
      out.write("                                                    </label>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td><input name=\"txtPassword\" type=\"password\" id=\"txtPassword\" title=\"Password must contain :Minimum 9 characters\"\n");
      out.write("                                                   placeholder=\"Enter password\" required pattern=\"^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$\" /></td></tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                                            </br>\n");
      out.write("                                            <tr><td>\n");
      out.write("                                                    <label for =\"txtConfirmPassword\">\n");
      out.write("                                                       Confirm Password\n");
      out.write("                                                    </label>\n");
      out.write("                                                </td>\n");
      out.write("                                           <td><input name=\"txtConfirmPassword\" type=\"password\" id=\"txtPassword\"  placeholder=\"Confirm password\" /></td></tr>\n");
      out.write("                                            </br>\n");
      out.write("                                              <tr>  <td><input name=\"btnSignup\" type=\"submit\"  value=\"Sign Up\" id=\"btnSignup\"/></td>\n");
      out.write("                                                  <td> <i>if already registered,kindly login here <a href=\"login2.html\"> Login</a></i></td></tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("            </center>\n");
      out.write("</div>\n");
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
