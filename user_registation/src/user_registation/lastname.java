/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_registation;
        import javax.swing.InputVerifier;
        import javax.swing.JComponent;
        import javax.swing.JOptionPane;
        import javax.swing.JTextField;

public class lastname extends InputVerifier{
   
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
        if(jtf.getText().matches("[[a-zA-z]+([ '-] [a-zA-Z]+)*"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"Kindly enter your last name","Last name missing",JOptionPane.ERROR_MESSAGE);
                    return false;
}
        

    
}
}
