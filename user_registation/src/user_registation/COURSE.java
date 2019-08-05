package user_registation;
        import javax.swing.InputVerifier;
        import javax.swing.JComponent;
        import javax.swing.JOptionPane;
        import javax.swing.JComboBox;

public class COURSE extends InputVerifier{
   
    public boolean verify(JComponent input)
    {
        JComboBox jcf=(JComboBox)input;
           
        if(jcf.getSelectedIndex()==0)
        {
      
        
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"Choose any course","Kindly make a choice",JOptionPane.ERROR_MESSAGE);
                    return false;
}
        

    
    }
}

