package user_registation;
        import javax.swing.InputVerifier;
        import javax.swing.JComponent;
        import javax.swing.JOptionPane;
        import javax.swing.JTextField;

public class age extends InputVerifier{
   
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
           String numToken="[\\p{Digit}&&[1234567890]]+";
        if(jtf.getText().matches(numToken))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"Kindly enter your age","Invalid age",JOptionPane.ERROR_MESSAGE);
                    return false;
}
        

    
}
}
