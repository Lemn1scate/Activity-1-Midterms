
package grade_system;
import javax.swing.JOptionPane;
public class Student_Dashboard_Frame extends javax.swing.JFrame {

    public Student_Dashboard_Frame() {
        initComponents();
        
        Student_DesktopPane.removeAll();
        Student_DashboardMain Logo = new Student_DashboardMain();
        Student_DesktopPane.add(Logo).setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Student_MainPanel = new javax.swing.JPanel();
        Student_ButtonPanel = new javax.swing.JPanel();
        MyProfile_Button = new javax.swing.JButton();
        MyGrades_Button = new javax.swing.JButton();
        GradingSystem_Button = new javax.swing.JButton();
        LogOut_Button = new javax.swing.JButton();
        Student_DesktopPane = new javax.swing.JDesktopPane();
        Student_Label1 = new javax.swing.JLabel();
        Student_Label = new javax.swing.JLabel();
        Student_Dashboard_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student_MainPanel.setBackground(new java.awt.Color(153, 153, 153));
        Student_MainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        Student_ButtonPanel.setBackground(new java.awt.Color(102, 102, 102));
        Student_ButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MyProfile_Button.setBackground(new java.awt.Color(0, 153, 153));
        MyProfile_Button.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        MyProfile_Button.setText("MY PROFILE");
        MyProfile_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MyProfile_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyProfile_ButtonActionPerformed(evt);
            }
        });

        MyGrades_Button.setBackground(new java.awt.Color(0, 153, 153));
        MyGrades_Button.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        MyGrades_Button.setText("MY GRADES");
        MyGrades_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MyGrades_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyGrades_ButtonActionPerformed(evt);
            }
        });

        GradingSystem_Button.setBackground(new java.awt.Color(0, 153, 153));
        GradingSystem_Button.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        GradingSystem_Button.setText("GRADING SYSTEM");
        GradingSystem_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GradingSystem_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradingSystem_ButtonActionPerformed(evt);
            }
        });

        LogOut_Button.setBackground(new java.awt.Color(204, 0, 0));
        LogOut_Button.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LogOut_Button.setText("LOG OUT");
        LogOut_Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogOut_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Student_ButtonPanelLayout = new javax.swing.GroupLayout(Student_ButtonPanel);
        Student_ButtonPanel.setLayout(Student_ButtonPanelLayout);
        Student_ButtonPanelLayout.setHorizontalGroup(
            Student_ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MyProfile_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MyGrades_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            .addComponent(GradingSystem_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            .addComponent(LogOut_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );
        Student_ButtonPanelLayout.setVerticalGroup(
            Student_ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Student_ButtonPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(MyProfile_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(MyGrades_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(GradingSystem_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(LogOut_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Student_DesktopPane.setBackground(new java.awt.Color(204, 204, 204));
        Student_DesktopPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout Student_DesktopPaneLayout = new javax.swing.GroupLayout(Student_DesktopPane);
        Student_DesktopPane.setLayout(Student_DesktopPaneLayout);
        Student_DesktopPaneLayout.setHorizontalGroup(
            Student_DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        Student_DesktopPaneLayout.setVerticalGroup(
            Student_DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Student_MainPanelLayout = new javax.swing.GroupLayout(Student_MainPanel);
        Student_MainPanel.setLayout(Student_MainPanelLayout);
        Student_MainPanelLayout.setHorizontalGroup(
            Student_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Student_MainPanelLayout.createSequentialGroup()
                .addComponent(Student_ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Student_DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Student_MainPanelLayout.setVerticalGroup(
            Student_MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Student_ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Student_DesktopPane)
        );

        getContentPane().add(Student_MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 1010, 410));

        Student_Label1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Student_Label1.setForeground(new java.awt.Color(255, 255, 255));
        Student_Label1.setText("STUDENT");
        getContentPane().add(Student_Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 400, -1, 40));

        Student_Label.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Student_Label.setForeground(new java.awt.Color(255, 255, 255));
        Student_Label.setText("STUDENT");
        getContentPane().add(Student_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 80, 40));

        Student_Dashboard_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grade_system/Admin_Dashboard (1).png"))); // NOI18N
        Student_Dashboard_Background.setToolTipText("");
        getContentPane().add(Student_Dashboard_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MyGrades_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyGrades_ButtonActionPerformed
        
        Student_DesktopPane.removeAll();
        Student_MyGrades_Internal MyGrades = new Student_MyGrades_Internal();
        Student_DesktopPane.add(MyGrades).setVisible(true);
        
    }//GEN-LAST:event_MyGrades_ButtonActionPerformed

    private void GradingSystem_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradingSystem_ButtonActionPerformed
        
        Student_DesktopPane.removeAll();
        Student_GradingSystem_Internal GradingSystem = new Student_GradingSystem_Internal();
        Student_DesktopPane.add(GradingSystem).setVisible(true);
    }//GEN-LAST:event_GradingSystem_ButtonActionPerformed

    private void LogOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut_ButtonActionPerformed
        
        Student_Frame Student = new Student_Frame();
        
        Object[] Options = {"Yes","No","Cancel"};
        
        int choice = JOptionPane.showOptionDialog(null,"Are you sure you want to Log Out?", "Logging Out as Admin", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, Options, Options[2]);
        
        if (choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Logged Out!");
            setVisible(false);
            Student.setVisible(true);
        }
        else if (choice == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Okay, Returning to Dashboard.");
            Student_DesktopPane.removeAll();
            Student_DashboardMain LogOut = new Student_DashboardMain();
            Student_DesktopPane.add(LogOut).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Logging Out Cancelled. Returning to Last Page."); 
        }
        
    }//GEN-LAST:event_LogOut_ButtonActionPerformed

    private void MyProfile_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyProfile_ButtonActionPerformed
        
        Student_DesktopPane.removeAll();
        Student_MyProfile_Internal MyProfile = new Student_MyProfile_Internal();
        Student_DesktopPane.add(MyProfile).setVisible(true);
        
    }//GEN-LAST:event_MyProfile_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Dashboard_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Dashboard_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GradingSystem_Button;
    private javax.swing.JButton LogOut_Button;
    private javax.swing.JButton MyGrades_Button;
    private javax.swing.JButton MyProfile_Button;
    private javax.swing.JPanel Student_ButtonPanel;
    private javax.swing.JLabel Student_Dashboard_Background;
    private javax.swing.JDesktopPane Student_DesktopPane;
    private javax.swing.JLabel Student_Label;
    private javax.swing.JLabel Student_Label1;
    private javax.swing.JPanel Student_MainPanel;
    // End of variables declaration//GEN-END:variables
}
