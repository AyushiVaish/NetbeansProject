
package navadhara;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class LOGIN extends javax.swing.JFrame {

String connectionURL="jdbc:derby:ayu";
    Connection connection=null;
    PreparedStatement statement=null,ps=null;
        ResultSet rs=null,rv=null;

    public LOGIN() {
        initComponents();
        this.setLocationRelativeTo(null);//center form in the screen
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelUSERNAME = new javax.swing.JLabel();
        jLabelPASSWORD = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelmin = new javax.swing.JLabel();
        jButtonLOGIN = new javax.swing.JButton();
        jLabelclickhere = new javax.swing.JLabel();
        jLabelclose = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\water_drops_dark_background-wallpaper-1600x1200.jpg")); // NOI18N
        jLabel4.setText("nkjkmkmkmkm");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.setForeground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("L");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("O");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 40, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("G");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 44, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("I");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 21, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("N");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("F");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("O");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("R");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("M");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUSERNAME.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelUSERNAME.setForeground(new java.awt.Color(240, 240, 240));
        jLabelUSERNAME.setText("USER NAME:");
        jPanel4.add(jLabelUSERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabelPASSWORD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelPASSWORD.setForeground(new java.awt.Color(240, 240, 240));
        jLabelPASSWORD.setText("PASSWORD:");
        jPanel4.add(jLabelPASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 243, 29));
        jPanel4.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 243, 29));

        jLabelmin.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelmin.setForeground(new java.awt.Color(240, 240, 240));
        jLabelmin.setText("   -");
        jLabelmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelminMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 0, 66, -1));

        jButtonLOGIN.setBackground(new java.awt.Color(0, 153, 153));
        jButtonLOGIN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonLOGIN.setForeground(new java.awt.Color(240, 240, 240));
        jButtonLOGIN.setText("LOGIN");
        jButtonLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLOGINActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonLOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        jLabelclickhere.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelclickhere.setForeground(new java.awt.Color(240, 240, 240));
        jLabelclickhere.setText("click here to create a new account");
        jLabelclickhere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelclickhereMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelclickhere, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 239, -1));

        jLabelclose.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelclose.setForeground(new java.awt.Color(240, 240, 240));
        jLabelclose.setText("x");
        jLabelclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcloseMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 6, 30, 46));
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 455, 53, 114));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("click here for nextnext");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 125, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\login.jpg")); // NOI18N
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 180));
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 263, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 0, -1, 569));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 11, 234, 199));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 569));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        next n=new next();
        n.setVisible(true);
        n.pack();
        n.setLocationRelativeTo(null);
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabelcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelcloseMouseClicked

    private void jLabelclickhereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelclickhereMouseClicked
        Registrationform rgf=new Registrationform();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelclickhereMouseClicked

    private void jButtonLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLOGINActionPerformed
        try
        {
            String value1=jTextField1.getText();
            char[] value2=jPasswordField1.getPassword();
            String v=new String(value2);
            Class. forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            connection=DriverManager.getConnection(connectionURL,"ayu","ayu");
            String sql="select * from login where username=? and password=?";
            statement =connection.prepareStatement(sql);
            statement.setString(1,value1);
            statement.setString(2,v);
            rs=statement.executeQuery();
            if(value1.isEmpty()||v.isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Username and Password cannot be left blank","WARNING",JOptionPane.WARNING_MESSAGE);
            }

            else if(rs.next())
            {
                String sql1="select username from login where username=? ";
                ps=connection.prepareStatement(sql1);
                ps.setString(1,value1);
                rv=ps.executeQuery();
                if(rv.next())
                {
                    if(rs.getString("username").matches(rv.getString("username")))
                    {
                        JOptionPane.showMessageDialog(this,"User ID already Exists","ERRoR",JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    this.setVisible(false);
                    Registrationform o=new Registrationform();
                    o.setVisible(true);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"PLease enter correct username  and passwrd","ERROR",JOptionPane.ERROR_MESSAGE);

            }

        }
        catch(SQLException se)

        {
            se.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonLOGINActionPerformed

    private void jLabelminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelminMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLOGIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPASSWORD;
    private javax.swing.JLabel jLabelUSERNAME;
    private javax.swing.JLabel jLabelclickhere;
    private javax.swing.JLabel jLabelclose;
    private javax.swing.JLabel jLabelmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
