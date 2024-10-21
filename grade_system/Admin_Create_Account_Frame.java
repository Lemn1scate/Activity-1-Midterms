
package grade_system;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Admin_Create_Account_Frame extends javax.swing.JFrame {

    public Admin_Create_Account_Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Create_Username_Label = new javax.swing.JLabel();
        Create_AdminUsername = new javax.swing.JTextField();
        Create_Password_Label = new javax.swing.JLabel();
        Create_AdminPassword = new javax.swing.JPasswordField();
        Confirm_Password_Label = new javax.swing.JLabel();
        Confirm_AdminPassword = new javax.swing.JPasswordField();
        CreateAccount_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        PasswordError_Label = new javax.swing.JLabel();
        Admin_Create_Account_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Create_Username_Label.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Create_Username_Label.setForeground(new java.awt.Color(255, 255, 255));
        Create_Username_Label.setText("USERNAME");
        getContentPane().add(Create_Username_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 110, 30));

        Create_AdminUsername.setBackground(new java.awt.Color(204, 204, 204));
        Create_AdminUsername.setFont(new java.awt.Font("Lucida Fax", 2, 18)); // NOI18N
        Create_AdminUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Create_AdminUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        Create_AdminUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_AdminUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Create_AdminUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 370, 50));

        Create_Password_Label.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Create_Password_Label.setForeground(new java.awt.Color(255, 255, 255));
        Create_Password_Label.setText("PASSWORD");
        getContentPane().add(Create_Password_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 110, 30));

        Create_AdminPassword.setBackground(new java.awt.Color(204, 204, 204));
        Create_AdminPassword.setFont(new java.awt.Font("Lucida Fax", 2, 14)); // NOI18N
        Create_AdminPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Create_AdminPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        Create_AdminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_AdminPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Create_AdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 370, 50));

        Confirm_Password_Label.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Confirm_Password_Label.setForeground(new java.awt.Color(255, 255, 255));
        Confirm_Password_Label.setText("CONFIRM PASSWORD");
        getContentPane().add(Confirm_Password_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 200, 30));

        Confirm_AdminPassword.setBackground(new java.awt.Color(204, 204, 204));
        Confirm_AdminPassword.setFont(new java.awt.Font("Lucida Fax", 2, 14)); // NOI18N
        Confirm_AdminPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Confirm_AdminPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        Confirm_AdminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_AdminPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm_AdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 370, 50));

        CreateAccount_Button.setBackground(new java.awt.Color(153, 153, 153));
        CreateAccount_Button.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        CreateAccount_Button.setText("Create Account");
        CreateAccount_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CreateAccount_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateAccount_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccount_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAccount_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, 160, 50));

        Back_Button.setBackground(new java.awt.Color(153, 153, 153));
        Back_Button.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Back_Button.setText("Back");
        Back_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 580, 160, 50));

        PasswordError_Label.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        PasswordError_Label.setForeground(new java.awt.Color(255, 51, 51));
        PasswordError_Label.setToolTipText("");
        getContentPane().add(PasswordError_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, -1, 30));

        Admin_Create_Account_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grade_system/Admin_Create_Account (1).png"))); // NOI18N
        getContentPane().add(Admin_Create_Account_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Create_AdminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_AdminUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Create_AdminUsernameActionPerformed

    private void Create_AdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_AdminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Create_AdminPasswordActionPerformed

    private void Confirm_AdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_AdminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Confirm_AdminPasswordActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        
        Admin_Frame Admin = new Admin_Frame();
        setVisible(false);
        Admin.setVisible(true);
        
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void CreateAccount_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccount_ButtonActionPerformed
        
        String AdminUsername = Create_AdminUsername.getText();
        String AdminPassword = Create_AdminPassword.getText();
        String AdminConfirmPass = Confirm_AdminPassword.getText();
        
        if (AdminPassword.equals(AdminConfirmPass)){
            PasswordError_Label.setText(" ");
            FileWriter File_Writer;
            BufferedWriter Buffered_Writer;
            try {
                File_Writer = new FileWriter("AdminAccounts.txt", true);
                Buffered_Writer = new BufferedWriter(File_Writer);
                Buffered_Writer.write("\n"+AdminUsername+"|"+AdminPassword);
                Buffered_Writer.close();
                JOptionPane.showMessageDialog(this, "ACCOUNT CREATED SUCCESSFULLY", "Account Creation", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "ACCOUNT NOT CREATED", "Error Creating Account", JOptionPane.ERROR_MESSAGE);
            }
            Admin_Frame Admin = new Admin_Frame();
            setVisible(false);
            Admin.setVisible(true);  
        }
        else{
            PasswordError_Label.setText("!! Password Do Not Match !!");
        }
    }//GEN-LAST:event_CreateAccount_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Create_Account_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Create_Account_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Create_Account_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Create_Account_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Create_Account_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin_Create_Account_Background;
    private javax.swing.JButton Back_Button;
    private javax.swing.JPasswordField Confirm_AdminPassword;
    private javax.swing.JLabel Confirm_Password_Label;
    private javax.swing.JButton CreateAccount_Button;
    private javax.swing.JPasswordField Create_AdminPassword;
    private javax.swing.JTextField Create_AdminUsername;
    private javax.swing.JLabel Create_Password_Label;
    private javax.swing.JLabel Create_Username_Label;
    private javax.swing.JLabel PasswordError_Label;
    // End of variables declaration//GEN-END:variables
}
