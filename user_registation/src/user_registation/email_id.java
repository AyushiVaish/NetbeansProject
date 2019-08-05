package user_registation;
        import javax.swing.InputVerifier;
        import javax.swing.JComponent;
        import javax.swing.JOptionPane;
        import javax.swing.JTextField;

public class email_id extends InputVerifier{
   
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
           
        if(jtf.getText().matches("*[A-Za-z0-9-]+(\\.[A-Za-zo-9-]+*[A-Za-z0-9-]+(\\.[A-Za-z0-9-])*(\\.[A-Za-z0-9-]+)"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"INVALID EMAIL ID","KINDLY ENTER VALID",JOptionPane.ERROR_MESSAGE);
                    return false;
}
        

    } 
}
