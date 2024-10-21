
package grade_system;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Admin_EnrollStudent_Internal extends javax.swing.JInternalFrame {

    public Admin_EnrollStudent_Internal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Input_Panel = new javax.swing.JPanel();
        Name_Label = new javax.swing.JLabel();
        FirstName_Input = new javax.swing.JTextField();
        LastName_Input = new javax.swing.JTextField();
        YearAndSec_Label = new javax.swing.JLabel();
        Gender_Label = new javax.swing.JLabel();
        StudentNumber_Label = new javax.swing.JLabel();
        StudentNumber_Input = new javax.swing.JTextField();
        Year_Input = new javax.swing.JComboBox<>();
        Section_Input = new javax.swing.JComboBox<>();
        Checker_Label = new javax.swing.JLabel();
        Checker_Button = new javax.swing.JButton();
        Gender_Input = new javax.swing.JTextField();
        Name_Label2 = new javax.swing.JLabel();
        Output_Panel = new javax.swing.JPanel();
        Name_Label1 = new javax.swing.JLabel();
        YearAndSec_Label1 = new javax.swing.JLabel();
        Gender_Label1 = new javax.swing.JLabel();
        StudentNumber_Label1 = new javax.swing.JLabel();
        Check_FullName = new javax.swing.JLabel();
        Check_YearAndSec = new javax.swing.JLabel();
        Check_Gender = new javax.swing.JLabel();
        Check_StudentNumber = new javax.swing.JLabel();
        Enroll_Button = new javax.swing.JButton();
        Admin_EnrollStudent_Background = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Input_Panel.setBackground(new java.awt.Color(204, 204, 204));
        Input_Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        Input_Panel.setForeground(new java.awt.Color(255, 255, 255));

        Name_Label.setText(" FIRST NAME");

        FirstName_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FirstName_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_InputActionPerformed(evt);
            }
        });

        LastName_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LastName_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName_InputActionPerformed(evt);
            }
        });

        YearAndSec_Label.setText("YEAR AND SECTION");

        Gender_Label.setText("GENDER");

        StudentNumber_Label.setText("STUDENT NUMBER");

        StudentNumber_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StudentNumber_Input.setMaximumSize(new java.awt.Dimension(9999999, 9999999));
        StudentNumber_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentNumber_InputActionPerformed(evt);
            }
        });

        Year_Input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));

        Section_Input.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSCPE-A", "BSCPE-B", "BSCPE-C", "BSCPE-D" }));

        Checker_Label.setForeground(new java.awt.Color(51, 0, 255));

        Checker_Button.setBackground(new java.awt.Color(153, 153, 153));
        Checker_Button.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        Checker_Button.setText("CHECK");
        Checker_Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Checker_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checker_ButtonActionPerformed(evt);
            }
        });

        Gender_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Name_Label2.setText("LAST NAME");

        javax.swing.GroupLayout Input_PanelLayout = new javax.swing.GroupLayout(Input_Panel);
        Input_Panel.setLayout(Input_PanelLayout);
        Input_PanelLayout.setHorizontalGroup(
            Input_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Input_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Input_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Input_PanelLayout.createSequentialGroup()
                        .addComponent(Name_Label)
                        .addGap(68, 68, 68)
                        .addComponent(Name_Label2))
                    .addComponent(YearAndSec_Label)
                    .addComponent(Gender_Label)
                    .addComponent(StudentNumber_Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Input_PanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(Input_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Input_PanelLayout.createSequentialGroup()
                                .addComponent(Year_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Section_Input, 0, 119, Short.MAX_VALUE))
                            .addGroup(Input_PanelLayout.createSequentialGroup()
                                .addComponent(Checker_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Checker_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(StudentNumber_Label)
                    .addComponent(Gender_Input)
                    .addGroup(Input_PanelLayout.createSequentialGroup()
                        .addComponent(FirstName_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LastName_Input)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Input_PanelLayout.setVerticalGroup(
            Input_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Input_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Input_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_Label)
                    .addComponent(Name_Label2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Input_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YearAndSec_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Input_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Year_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Section_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gender_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gender_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudentNumber_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudentNumber_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Input_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Checker_Button)
                    .addGroup(Input_PanelLayout.createSequentialGroup()
                        .addComponent(Checker_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addGap(26, 26, 26))
        );

        getContentPane().add(Input_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 290, 260));

        Output_Panel.setBackground(new java.awt.Color(204, 204, 204));
        Output_Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        Output_Panel.setForeground(new java.awt.Color(255, 255, 255));

        Name_Label1.setText("FULL NAME");

        YearAndSec_Label1.setText("YEAR AND SECTION");

        Gender_Label1.setText("GENDER");

        StudentNumber_Label1.setText("STUDENT NUMBER");

        Check_FullName.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        Check_FullName.setForeground(new java.awt.Color(0, 0, 102));
        Check_FullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Check_FullName.setToolTipText("");

        Check_YearAndSec.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        Check_YearAndSec.setForeground(new java.awt.Color(0, 0, 102));
        Check_YearAndSec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Check_YearAndSec.setToolTipText("");

        Check_Gender.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        Check_Gender.setForeground(new java.awt.Color(0, 0, 102));
        Check_Gender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Check_Gender.setToolTipText("");

        Check_StudentNumber.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        Check_StudentNumber.setForeground(new java.awt.Color(0, 0, 102));
        Check_StudentNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Check_StudentNumber.setToolTipText("");

        Enroll_Button.setBackground(new java.awt.Color(153, 153, 153));
        Enroll_Button.setText("INPUT TO ENROLLED STUDENTS");
        Enroll_Button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Enroll_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Enroll_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enroll_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Output_PanelLayout = new javax.swing.GroupLayout(Output_Panel);
        Output_Panel.setLayout(Output_PanelLayout);
        Output_PanelLayout.setHorizontalGroup(
            Output_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Output_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Output_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Check_YearAndSec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Output_PanelLayout.createSequentialGroup()
                        .addGroup(Output_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name_Label1)
                            .addComponent(YearAndSec_Label1)
                            .addComponent(Gender_Label1)
                            .addComponent(StudentNumber_Label1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Check_Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Check_StudentNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Check_FullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Output_PanelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(Enroll_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        Output_PanelLayout.setVerticalGroup(
            Output_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Output_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name_Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Check_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YearAndSec_Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Check_YearAndSec, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gender_Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Check_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StudentNumber_Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Check_StudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Enroll_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Output_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 290, 260));

        Admin_EnrollStudent_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grade_system/Admin_EnrollStudent (1).png"))); // NOI18N
        getContentPane().add(Admin_EnrollStudent_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 700, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstName_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName_InputActionPerformed

    private void StudentNumber_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentNumber_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentNumber_InputActionPerformed

    private void Checker_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checker_ButtonActionPerformed
    
        String FullName = (FirstName_Input.getText()+ " " +LastName_Input.getText()).trim();
        String Year_Section = (Year_Input.getSelectedItem() +", "+ Section_Input.getSelectedItem()).trim();
        String Gender = (Gender_Input.getText()).trim();
        String StudentNumber = (StudentNumber_Input.getText()).trim();
        boolean GoodDetails;
        boolean GoodName = false;
        boolean GoodGender = false;
        boolean GoodStudentNumber = false;
        
        if(FullName.equals(" ")){
            GoodDetails = false;
        }
        else if(Year_Section.length()==0){
            GoodDetails = false;
        }
        else if(Gender.equals("")){
            GoodDetails = false;
        }
        else if(StudentNumber.equals("")){
            GoodDetails = false;
        }
        else{
            GoodDetails = true;
        }
        
        if(GoodDetails){
            Checker_Label.setText("ACCEPTABLE DATA");
            
            for(char NameCharacs : FullName.toCharArray()){
                if(Character.isDigit(NameCharacs)){
                    GoodName = false;
                }
                else if(!Character.isAlphabetic(NameCharacs)){
                    GoodName = false;
                }
                else{
                    GoodName = true;
                }
            }
            if(GoodName){
                Check_FullName.setText(FullName);
            }
            else{
                Check_FullName.setText("NAME NOT GOOD");
            }
            
            Check_YearAndSec.setText(Year_Section);
            
            for(char GenderCharacs : Gender.toCharArray()){
                if(Character.isDigit(GenderCharacs)){
                    GoodGender = false;
                }
                else if(!Character.isAlphabetic(GenderCharacs)){
                    GoodGender = false;
                }
                else{
                    GoodGender = true;
                }
            }
            if(GoodGender){
                Check_Gender.setText(Gender);
            }
            else{
                Check_Gender.setText("GENDER NOT GOOD");
            }
            
            for(char NumberCharacs : StudentNumber.toCharArray()){
                if(Character.isAlphabetic(NumberCharacs)){
                    GoodStudentNumber = false;
                }
                else if(!Character.isDigit(NumberCharacs)){
                    GoodStudentNumber = false;
                }
                else{
                    GoodStudentNumber = true;
                }
            }
            if(GoodStudentNumber){
                Check_StudentNumber.setText(StudentNumber);
            }
            else{
                Check_StudentNumber.setText("STUDENT NUMBER NOT GOOD");
            }
            
            
        }
        else{
            Checker_Label.setText("NOT ACCEPTABLE");
        }
        
    }//GEN-LAST:event_Checker_ButtonActionPerformed

    private void LastName_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastName_InputActionPerformed

    private void Enroll_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enroll_ButtonActionPerformed
        
        if((!(Check_FullName.getText()).equals("NAME NOT GOOD"))&&
           (!(Check_Gender.getText()).equals("GENDER NOT GOOD"))&&
           (!(Check_StudentNumber.getText()).equals("STUDENT NUMBER NOT GOOD"))){
          
            FileWriter File_Writer;
            BufferedWriter Buffered_Writer;
            try{
               File_Writer = new FileWriter("Students.txt",true);
               Buffered_Writer = new BufferedWriter(File_Writer);
               Buffered_Writer.write("\n"+Check_FullName.getText()+"!"+Check_YearAndSec.getText()+"!"+Check_Gender.getText()+"!"+Check_StudentNumber.getText()+"!");
               Buffered_Writer.close();
               JOptionPane.showMessageDialog(this, "STUDENT ENROLLED SUCCESSFULLY", "STUDENT ENROLLMENT", JOptionPane.INFORMATION_MESSAGE);
               
               Check_FullName.setText("");
               Check_Gender.setText("");
               Check_StudentNumber.setText("");
               Check_YearAndSec.setText("");
               Checker_Label.setText("");
               FirstName_Input.setText("");
               LastName_Input.setText("");
               Gender_Input.setText("");
               StudentNumber_Input.setText("");
               Year_Input.setSelectedIndex(0);
               Section_Input.setSelectedIndex(0);
               
            }catch(IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "STUDENT NOT ENROLLED", "Error Enrolling Student", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "STUDENT NOT ENROLLED", "Error Enrolling Student", JOptionPane.ERROR_MESSAGE);
            Check_FullName.setText("");
            Check_Gender.setText("");
            Check_StudentNumber.setText("");
            Check_YearAndSec.setText("");
            Checker_Label.setText("");
            FirstName_Input.setText("");
            LastName_Input.setText("");
            Gender_Input.setText("");
            StudentNumber_Input.setText("");
            Year_Input.setSelectedIndex(0);
            Section_Input.setSelectedIndex(0);
        }
    }//GEN-LAST:event_Enroll_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin_EnrollStudent_Background;
    private javax.swing.JLabel Check_FullName;
    private javax.swing.JLabel Check_Gender;
    private javax.swing.JLabel Check_StudentNumber;
    private javax.swing.JLabel Check_YearAndSec;
    private javax.swing.JButton Checker_Button;
    private javax.swing.JLabel Checker_Label;
    private javax.swing.JButton Enroll_Button;
    private javax.swing.JTextField FirstName_Input;
    private javax.swing.JTextField Gender_Input;
    private javax.swing.JLabel Gender_Label;
    private javax.swing.JLabel Gender_Label1;
    private javax.swing.JPanel Input_Panel;
    private javax.swing.JTextField LastName_Input;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JLabel Name_Label1;
    private javax.swing.JLabel Name_Label2;
    private javax.swing.JPanel Output_Panel;
    private javax.swing.JComboBox<String> Section_Input;
    private javax.swing.JTextField StudentNumber_Input;
    private javax.swing.JLabel StudentNumber_Label;
    private javax.swing.JLabel StudentNumber_Label1;
    private javax.swing.JLabel YearAndSec_Label;
    private javax.swing.JLabel YearAndSec_Label1;
    private javax.swing.JComboBox<String> Year_Input;
    // End of variables declaration//GEN-END:variables
}
