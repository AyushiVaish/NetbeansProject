package user_registrartion_form;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class FIRSTNAME extends InputVerifier{
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
        if(jtf.getText().matches("[A-Z] [a-zA-Z]*"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"Kindly enter your first name","Format eg:Ayushi",JOptionPane.ERROR_MESSAGE);
                    return false;
        }
    }
    
}
