
package navadhara;
import javax.swing.*;
public class novalidate extends InputVerifier{
    public boolean verify (JComponent input)
    {
     JTextField jtf=(JTextField) input;
     String numToken="^[789][0-9]{9}";
     if (jtf.getText().matches (numToken))
     {
         return true;
         
     }
     else
     {
         JOptionPane.showMessageDialog(input,"Kindly Enter the correct mobile no.Format=8124567380","Invalid Mobile number",JOptionPane.ERROR_MESSAGE);
         return false;
     }
    }

    
}