/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodLeukemia_Centre_Coordinator_Role;
import Business.Enterprise.Enterprise;
import Business.Organization.Leukemia_Centre_Organization;
import Business.Organization.GovernmentOrganization;
import Business.UserAccount.UserAccount;
import Magic.Design.MyJButton;
import Magic.Design.MyJLabel;
import Magic.Design.*;
import java.awt.CardLayout;
import java.util.Date;

/**
 *
 * @author parth
 */
public class ManageCancerCentreCoordinatorProfile extends javax.swing.JPanel {

  

     private UserAccount userAccount;
     private Enterprise enterprise ;
     private GovernmentOrganization govtOrganization;
     private Leukemia_Centre_Organization cancerCentreOrganization;
    


    ManageCancerCentreCoordinatorProfile(UserAccount userAccount, Leukemia_Centre_Organization cancerCentreOrganization, Enterprise enterprise) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         initComponents();
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.cancerCentreOrganization = cancerCentreOrganization;
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        lblDOB = new javax.swing.JLabel();
        lblSpecialization = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtSpecialization = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        lblContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblContact.setForeground(new java.awt.Color(255, 255, 255));
        lblContact.setText("Contact:");
        add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        lblAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address:");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        lblCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setText("City:");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        lblState.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblState.setForeground(new java.awt.Color(255, 255, 255));
        lblState.setText("State:");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        lblGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("Gender:");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        cmbGender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        lblDOB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("DOB:");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        lblSpecialization.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSpecialization.setForeground(new java.awt.Color(255, 255, 255));
        lblSpecialization.setText("Specialization:");
        add(lblSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        txtName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 146, -1));

        txtContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 146, -1));

        txtAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 146, -1));

        txtCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 146, -1));

        txtState.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 146, -1));

        txtSpecialization.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(txtSpecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 146, -1));

        txtDOB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 146, -1));

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 77, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        userAccount.getEmployee().setCity(txtCity.getText());
        userAccount.getEmployee().setContactNumber(Integer.parseInt(txtContact.getText()));
        userAccount.getEmployee().setDateOfBirth(new Date(txtDOB.getText()));
        userAccount.getEmployee().setGender((String) cmbGender.getSelectedItem());
        userAccount.getEmployee().setAddress(txtAddress.getText());
        userAccount.getEmployee().setState(txtCity.getText());
        userAccount.getEmployee().setSpecialization(txtSpecialization.getText());

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSpecialization;
    private javax.swing.JLabel lblState;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
