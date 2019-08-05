/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.Serializable;

public class FormBean implements Serializable {
    private int id;
    private String username,pass,confirmPass;
    private boolean Valid;
    FormBean()
    {
        
    }
   public int getId()
   {
       return id;
   }
    
   public void setId(int id){
       this.id=id;
   }
   public String getUserName()
   {
       return username;
       
   }
   public void setUserName(String username)
   {
       this.username=username;
   }
   public String getPass()
   {
       return pass;
   }
   public void setPass(String pass)
   {
       this.pass=pass;
   }
   public String getConfirmPass()
   {
       return confirmPass;
   }
   public void setConfirmPass(String confirmPass)
   {
       this.confirmPass=confirmPass;
   }
   public boolean Valid()
   {
       return Valid;
   }
   public void setValid(boolean Valid) {
       this.Valid=Valid;
   }

    boolean valid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
