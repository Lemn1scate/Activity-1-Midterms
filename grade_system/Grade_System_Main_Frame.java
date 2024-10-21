//Group 10 BSCPE-2CPE-A
//Activity 1 - CPP106 - Software Design
//Grading Management System
//Grade System Main Frame

package grade_system;

public class Grade_System_Main_Frame extends javax.swing.JFrame {

    public Grade_System_Main_Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin_Button = new javax.swing.JButton();
        Student_Button = new javax.swing.JButton();
        Design_Label1 = new javax.swing.JLabel();
        Design_Label2 = new javax.swing.JLabel();
        Main_Window_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin_Button.setBackground(new java.awt.Color(153, 153, 153));
        Admin_Button.setFont(new java.awt.Font("Bodoni MT Black", 1, 36)); // NOI18N
        Admin_Button.setText("ADMIN");
        Admin_Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        Admin_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Admin_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Admin_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 240, 70));

        Student_Button.setBackground(new java.awt.Color(153, 153, 153));
        Student_Button.setFont(new java.awt.Font("Bodoni MT Black", 1, 36)); // NOI18N
        Student_Button.setText("STUDENT");
        Student_Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        Student_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Student_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Student_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 240, 70));

        Design_Label1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Design_Label1.setForeground(new java.awt.Color(255, 255, 255));
        Design_Label1.setText("Are you an");
        Design_Label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Design_Label1.setName(""); // NOI18N
        getContentPane().add(Design_Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 100, 20));

        Design_Label2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Design_Label2.setForeground(new java.awt.Color(255, 255, 255));
        Design_Label2.setText("Or a");
        Design_Label2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Design_Label2.setName(""); // NOI18N
        getContentPane().add(Design_Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 40, 20));

        Main_Window_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grade_system/Main_Frame (1).png"))); // NOI18N
        getContentPane().add(Main_Window_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleName("Main_Window");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Admin_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_ButtonActionPerformed
        
        Admin_Frame Admin = new Admin_Frame();
        setVisible(false);
        Admin.setVisible(true);
        
    }//GEN-LAST:event_Admin_ButtonActionPerformed

    private void Student_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_ButtonActionPerformed
        
        Student_Frame Student = new Student_Frame();
        setVisible(false);
        Student.setVisible(true);
        
    }//GEN-LAST:event_Student_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Grade_System_Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grade_System_Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grade_System_Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grade_System_Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grade_System_Main_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_Button;
    private javax.swing.JLabel Design_Label1;
    private javax.swing.JLabel Design_Label2;
    private javax.swing.JLabel Main_Window_Background;
    private javax.swing.JButton Student_Button;
    // End of variables declaration//GEN-END:variables
}
