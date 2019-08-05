/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagePackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.sql.*;
import java.io.*;
import javax.servlet.annotation.MultipartConfig;
@MultipartConfig(maxFileSize=16177215)

/**
 *
 * @author USER
 */
public class JDBCServlet extends HttpServlet {
    String connectionURL="jdbc:derby://localhost:1527/image";
    Connection connection =null;
    PreparedStatement ps=null;
    ResultSet rs= null;
    String message= null;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JDBCServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JDBCServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  processRequest(request, response
      try {
          PrintWriter out= response.getWriter();
          String name=request.getParameter("name");
          Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
          connection=DriverManager.getConnection(connectionURL,"image","image");
          String sql= "insert into image(photo,photoName) values(?,?)";
          ps=connection.prepareStatement(sql);
          InputStream input=null;
          Part filePart = request.getPart("image");
          if(filePart !=null)
          {
              input=filePart.getInputStream();
              if(input !=null)
              {
                  ps.setBlob(1,input);
                  ps.setString(2,name);
              }
          }
                  
                  int row = ps.executeUpdate();
                  if(row>0)
                  {
                      message="file uploaded and saved to database successfully";
                      out.print(message);
                  }
              }
              catch(SQLException se)
                      {
                      se.printStackTrace();
                      
                      }
              catch(Exception e)
                      {
                      e.printStackTrace();
                      }
          
    }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
