package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dynamicTable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Dynamic Table</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1> Colorful and Dynamic Table </h1>\n");
      out.write("        <form method =\"POST\" action =\"dynamicTable.jsp\">\n");
      out.write("            Table Width (<16) = <input type =\"text\" name =\"width\"  value =5 size = 2>\n");
      out.write("            Table Height (<16) = <input type =\"text\" name =\"height\"  value =5 size = 2>\n");
      out.write("            <input type =\"submit\" value =\"DO IT\" >\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
      out.write("        ");
 
            String w = request.getParameter("width");
            String h = request.getParameter("height");
            if(w==null) w="5";
            if(h==null) h="15";
            int width = Integer.parseInt(w);
            int height = Integer.parseInt (h);
            if (width >15 ) width = 15;
            if (width <0) width=0;
            if(height >15) height = 15;
            if(height< 0) height =0;
            String[] colorArray = { "00" , "11","22" , "33",
                                    "44" ,"55","66","77", 
                                    "88","99","AA","BB",
                                    "CC","DD","EE","FF" }; 
                                             
            
      out.write("                      \n");
      out.write("            <table border =0 cellpadding =0 cellspacing =0 >\n");
      out.write("                ");

                   for (int x=0; x<=width;x++){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");

                        for (int y=0;y<=height ; y++)
                        {
                            String bgColor = "AA" +colorArray[y] + colorArray[x];  
      out.write("\n");
      out.write("                            <td BGCOLOR=");
      out.print(bgColor);
      out.write(">\n");
      out.write("                            (");
      out.print(x);
      out.write(" , ");
      out.print(y);
      out.write(")\n");
      out.write("                            </td>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <hr>\n");
      out.write("    </center>\n");
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
