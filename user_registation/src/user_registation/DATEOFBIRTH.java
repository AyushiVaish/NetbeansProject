package user_registation;
        import javax.swing.InputVerifier;
        import javax.swing.JComponent;
        import javax.swing.JOptionPane;
        import javax.swing.JTextField;

public class DATEOFBIRTH extends InputVerifier{
   
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
           if (input !=null)
           {
               InputVerifier verifier=input.getInputVerifier();
           }
        if(jtf.getText().matches("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20\\d\\d"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"INVALID DATE FORMAT","KINDLY INPUT DATE IN DD-MM-YYY FORMAT",JOptionPane.ERROR_MESSAGE);
                    return false;
}
        
           }
    
}