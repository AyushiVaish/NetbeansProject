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
public class ServiceLogic {
    public static int save(FormBean pObject){
        int flag=0;
        try{
            Connection con=DBConnection.getConnection();
            String sql="insert into userinfo values(?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,pObject.getUserName());
            ps.setString(2,pObject.getPass());
            flag=ps.executeUpdate();
            con.close();
            
        }
        catch(Exception e)
        {
            System.out.println("Unable to insert");
            
        }
        return flag;
    }
    
}
