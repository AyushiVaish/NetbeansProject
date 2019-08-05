/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.*;
/**
 *
 * @author USER
 */
public class DBConnection {
    public static Connection getConnection() {
        Connection con=null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/emp","emp","emp");
            
        }
        catch(Exception e){
            System.out.println("unable to connect to the database");
        }
        return con;
    }
    
}
