
package grade_system;
import javax.swing.JOptionPane;
public class Admin_Dashboard_Frame extends javax.swing.JFrame {

    public Admin_Dashboard_Frame() {
        initComponents();
        
        Admin_DesktopPane.removeAll();
        Admin_DashboardMain Logo = new Admin_DashboardMain();
        Admin_DesktopPane.add(Logo).setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin_MainPanel = new javax.swing.JPanel();
        Admin_ButtonPanel = new javax.swing.JPanel();
        Enroll_Student_Button = new javax.swing.JButton();
        Student_Profile_Button = new javax.swing.JButton();
        Student_Grades_Button = new javax.swing.JButton();
        Admin_LogOut_Button = new javax.swing.JButton();
        Admin_DesktopPane = new javax.swing.JDesktopPane();
        Admin_Label = new javax.swing.JLabel();
        Admin_Label1 = new javax.swing.JLabel();
        Admin_Dashboard_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin_MainPanel.setBackground(new java.awt.Color(153, 153, 153));
        Admin_MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        Admin_ButtonPanel.setBackground(new java.awt.Color(102, 102, 102));
        Admin_ButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Enroll_Student_Button.setBackground(new java.awt.Color(0, 204, 204));
        Enroll_Student_Button.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Enroll_Student_Button.setText("ENROLL STUDENT");
        Enroll_Student_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Enroll_Student_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enroll_Student_ButtonActionPerformed(evt);
            }
        });

        Student_Profile_Button.setBackground(new java.awt.Color(0, 204, 204));
        Student_Profile_Button.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Student_Profile_Button.setText("STUDENT PROFILE");
        Student_Profile_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Student_Profile_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Profile_ButtonActionPerformed(evt);
            }
        });

        Student_Grades_Button.setBackground(new java.awt.Color(0, 204, 204));
        Student_Grades_Button.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Student_Grades_Button.setText("STUDENT GRADES");
        Student_Grades_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Student_Grades_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_Grades_ButtonActionPerformed(evt);
            }
        });

        Admin_LogOut_Button.setBackground(new java.awt.Color(153, 0, 0));
        Admin_LogOut_Button.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Admin_LogOut_Button.setText("LOG OUT");
        Admin_LogOut_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Admin_LogOut_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_LogOut_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Admin_ButtonPanelLayout = new javax.swing.GroupLayout(Admin_ButtonPanel);
        Admin_ButtonPanel.setLayout(Admin_ButtonPanelLayout);
        Admin_ButtonPanelLayout.setHorizontalGroup(
            Admin_ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Enroll_Student_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Student_Grades_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Student_Profile_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
            .addComponent(Admin_LogOut_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Admin_ButtonPanelLayout.setVerticalGroup(
            Admin_ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Admin_ButtonPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Enroll_Student_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Student_Profile_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Student_Grades_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Admin_LogOut_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Admin_DesktopPane.setBackground(new java.awt.Color(204, 204, 204));
        Admin_DesktopPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout Admin_DesktopPaneLayout = new javax.swing.GroupLayout(Admin_DesktopPane);
        Admin_DesktopPane.setLayout(Admin_DesktopPaneLayout);
        Admin_DesktopPaneLayout.setHorizontalGroup(
            Admin_DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        Admin_DesktopPaneLayout.setVerticalGroup(
            Admin_DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Admin_MainPanelLayout = new javax.swing.GroupLayout(Admin_MainPanel);
        Admin_MainPanel.setLayout(Admin_MainPanelLayout);
        Admin_MainPanelLayout.setHorizontalGroup(
            Admin_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Admin_MainPanelLayout.createSequentialGroup()
                .addComponent(Admin_ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Admin_DesktopPane))
        );
        Admin_MainPanelLayout.setVerticalGroup(
            Admin_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Admin_ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Admin_DesktopPane)
        );

        getContentPane().add(Admin_MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 1010, 410));

        Admin_Label.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        Admin_Label.setForeground(new java.awt.Color(255, 255, 255));
        Admin_Label.setText("ADMIN");
        getContentPane().add(Admin_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 400, -1, 40));

        Admin_Label1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        Admin_Label1.setForeground(new java.awt.Color(255, 255, 255));
        Admin_Label1.setText("ADMIN");
        getContentPane().add(Admin_Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 40));

        Admin_Dashboard_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grade_system/Admin_Dashboard (1).png"))); // NOI18N
        Admin_Dashboard_Background.setToolTipText("");
        getContentPane().add(Admin_Dashboard_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Enroll_Student_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enroll_Student_ButtonActionPerformed
        
        Admin_DesktopPane.removeAll();
        Admin_EnrollStudent_Internal EnrollStudent = new Admin_EnrollStudent_Internal();
        Admin_DesktopPane.add(EnrollStudent).setVisible(true);
        
    }//GEN-LAST:event_Enroll_Student_ButtonActionPerformed

    private void Student_Profile_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_Profile_ButtonActionPerformed
        
        Admin_DesktopPane.removeAll();
        Admin_StudentProfile_Internal StudentProfile = new Admin_StudentProfile_Internal();
        Admin_DesktopPane.add(StudentProfile).setVisible(true);
        
    }//GEN-LAST:event_Student_Profile_ButtonActionPerformed

    private void Student_Grades_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_Grades_ButtonActionPerformed
        
        Admin_DesktopPane.removeAll();
        Admin_StudentGrades_Internal StudentGrades = new Admin_StudentGrades_Internal();
        Admin_DesktopPane.add(StudentGrades).setVisible(true);
        
    }//GEN-LAST:event_Student_Grades_ButtonActionPerformed

    private void Admin_LogOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_LogOut_ButtonActionPerformed
        
        Admin_Frame Admin = new Admin_Frame();
        
        Object[] Options = {"Yes","No","Cancel"};
        
        int choice = JOptionPane.showOptionDialog(null,"Are you sure you want to Log Out?", "Logging Out as Admin", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, Options, Options[2]);
        
        if (choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Logged Out!");
            setVisible(false);
            Admin.setVisible(true);
        }
        else if (choice == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Okay, Returning to Dashboard.");
            Admin_DesktopPane.removeAll();
            Admin_DashboardMain LogOut = new Admin_DashboardMain();
            Admin_DesktopPane.add(LogOut).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Logging Out Cancelled. Returning to Last Page."); 
        }
        
    }//GEN-LAST:event_Admin_LogOut_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dashboard_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin_ButtonPanel;
    private javax.swing.JLabel Admin_Dashboard_Background;
    private javax.swing.JDesktopPane Admin_DesktopPane;
    private javax.swing.JLabel Admin_Label;
    private javax.swing.JLabel Admin_Label1;
    private javax.swing.JButton Admin_LogOut_Button;
    private javax.swing.JPanel Admin_MainPanel;
    private javax.swing.JButton Enroll_Student_Button;
    private javax.swing.JButton Student_Grades_Button;
    private javax.swing.JButton Student_Profile_Button;
    // End of variables declaration//GEN-END:variables
}
