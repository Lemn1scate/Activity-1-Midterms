
package grade_system;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class Admin_Frame extends javax.swing.JFrame {

    public Admin_Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin_Username_Input = new javax.swing.JTextField();
        Admin_Password_Input = new javax.swing.JPasswordField();
        Username_Label = new javax.swing.JLabel();
        Password_Label = new javax.swing.JLabel();
        Create_Admin_Label = new javax.swing.JLabel();
        Create_Account_Button = new javax.swing.JButton();
        Login_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Admin_Login_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin_Username_Input.setBackground(new java.awt.Color(204, 204, 204));
        Admin_Username_Input.setFont(new java.awt.Font("Lucida Fax", 2, 18)); // NOI18N
        Admin_Username_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Admin_Username_Input.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        Admin_Username_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_Username_InputActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_Username_Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 370, 50));

        Admin_Password_Input.setBackground(new java.awt.Color(204, 204, 204));
        Admin_Password_Input.setFont(new java.awt.Font("Lucida Fax", 2, 14)); // NOI18N
        Admin_Password_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Admin_Password_Input.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        Admin_Password_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_Password_InputActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_Password_Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 370, 50));

        Username_Label.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Username_Label.setForeground(new java.awt.Color(255, 255, 255));
        Username_Label.setText("USERNAME");
        getContentPane().add(Username_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 110, 30));

        Password_Label.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Password_Label.setForeground(new java.awt.Color(255, 255, 255));
        Password_Label.setText("PASSWORD");
        getContentPane().add(Password_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 110, 30));

        Create_Admin_Label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        Create_Admin_Label.setForeground(new java.awt.Color(255, 255, 255));
        Create_Admin_Label.setText("Don't have an account yet?");
        getContentPane().add(Create_Admin_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, 20));

        Create_Account_Button.setBackground(new java.awt.Color(102, 102, 102));
        Create_Account_Button.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        Create_Account_Button.setForeground(new java.awt.Color(255, 255, 255));
        Create_Account_Button.setText("Click Here to Create an Account");
        Create_Account_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Create_Account_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Create_Account_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_Account_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Create_Account_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 200, 20));

        Login_Button.setBackground(new java.awt.Color(153, 153, 153));
        Login_Button.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Login_Button.setText("LOG IN");
        Login_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Login_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 130, 40));

        Back_Button.setBackground(new java.awt.Color(153, 153, 153));
        Back_Button.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        Back_Button.setText("BACK");
        Back_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, 130, 40));

        Admin_Login_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grade_system/Admin_Login (1).png"))); // NOI18N
        getContentPane().add(Admin_Login_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        Admin_Login_Background.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Admin_Username_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_Username_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_Username_InputActionPerformed

    private void Create_Account_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_Account_ButtonActionPerformed
        
        Admin_Create_Account_Frame Create = new Admin_Create_Account_Frame();
        setVisible(false);
        Create.setVisible(true);
        
    }//GEN-LAST:event_Create_Account_ButtonActionPerformed

    private void Admin_Password_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_Password_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_Password_InputActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        
        //Get the Username and Password of Admin
        String Admin_Username = Admin_Username_Input.getText();
        String Admin_Password = Admin_Password_Input.getText();
        
        //Log in Projection
        FileReader File_Reader;
        BufferedReader Buffered_Reader;
        String SearchString = Admin_Username+"|"+Admin_Password;
        boolean Found = false;
        
        try {
            File_Reader = new FileReader("AdminAccounts.txt");
            Buffered_Reader = new BufferedReader(File_Reader);
            String Line;
            while ((Line = Buffered_Reader.readLine()) != null){
                if(Line.contains(SearchString)){
                    Found = true;
                }
            }
            Buffered_Reader.close();
            if((Admin_Username.length()==0)&&(Admin_Password.length()==0)){
                Found = false;
            }
            
            if (Found){
                Admin_Dashboard_Frame Dashboard = new Admin_Dashboard_Frame();
                setVisible(false);
                Dashboard.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Enter a Correct Account.","ACCOUNT NOT FOUND", JOptionPane.ERROR_MESSAGE);
            }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "ACCOUNT NOT FOUND", "Error in Searching Account", JOptionPane.ERROR_MESSAGE);
            }  
    }//GEN-LAST:event_Login_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        
        Grade_System_Main_Frame Main = new Grade_System_Main_Frame();
        setVisible(false);
        Main.setVisible(true);
        
    }//GEN-LAST:event_Back_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin_Login_Background;
    private javax.swing.JPasswordField Admin_Password_Input;
    private javax.swing.JTextField Admin_Username_Input;
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Create_Account_Button;
    private javax.swing.JLabel Create_Admin_Label;
    private javax.swing.JButton Login_Button;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JLabel Username_Label;
    // End of variables declaration//GEN-END:variables
}
