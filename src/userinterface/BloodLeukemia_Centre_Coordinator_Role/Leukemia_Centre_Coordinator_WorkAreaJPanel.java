/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodLeukemia_Centre_Coordinator_Role;

import static java.time.Clock.system;
import javax.swing.JFrame;
import Magic.Design.MyJLabel;
import Magic.Design.*;
import static javax.swing.SwingUtilities.getWindowAncestor;

import Business.DB4OUtil.DB4OUtil;
import userinterface.SystemCoordinatorRole.*;
import Business.EcoSystem;
import userinterface.DoctorRole.*;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Leukemia_Centre_Organization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.People.PatientDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;


/**
 *
 * @author parth
 */
public class Leukemia_Centre_Coordinator_WorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Leukemia_Centre_Coordinator_WorkAreaJPanel
     * 
     */
    boolean a = true;
    private UserAccount userAccount;
    Leukemia_Centre_Organization cancerCentreOrganization;
    Enterprise enterprise;
    EcoSystem system;
    PatientDirectory patientDirectory;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Network network;
    
    
    public Leukemia_Centre_Coordinator_WorkAreaJPanel(UserAccount account,Leukemia_Centre_Organization cancerCentreOrganization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = account;
        this.cancerCentreOrganization = cancerCentreOrganization;
        this.enterprise = enterprise;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEditProfile = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAddPatient = new javax.swing.JLabel();
        btnVolunteerReceiverRequest = new javax.swing.JLabel();
        btnCheckPatientStatus = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(0, 0, 0));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btnEditProfile.setBackground(new java.awt.Color(0, 0, 0));
        btnEditProfile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnEditProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditProfile.setText("Edit Profile");
        btnEditProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditProfileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Header.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btnAddPatient.setBackground(new java.awt.Color(0, 0, 0));
        btnAddPatient.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddPatient.setText("Add Patient");
        btnAddPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPatientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAddPatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Header.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 160, 50));

        btnVolunteerReceiverRequest.setBackground(new java.awt.Color(0, 0, 0));
        btnVolunteerReceiverRequest.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVolunteerReceiverRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnVolunteerReceiverRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolunteerReceiverRequest.setText("Volunteer Receiver Request");
        btnVolunteerReceiverRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolunteerReceiverRequestMouseClicked(evt);
            }
        });
        Header.add(btnVolunteerReceiverRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 280, 50));

        btnCheckPatientStatus.setBackground(new java.awt.Color(0, 0, 0));
        btnCheckPatientStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCheckPatientStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckPatientStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCheckPatientStatus.setText("Check Patient Status");
        btnCheckPatientStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckPatientStatusMouseClicked(evt);
            }
        });
        Header.add(btnCheckPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 230, 50));

        add(Header, java.awt.BorderLayout.PAGE_START);

        userProcessContainer.setBackground(new java.awt.Color(0, 51, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditProfileMouseClicked
        // TODO add your handling code here:
        ManageCancerCentreCoordinatorProfile manageCancerCoordinatorWorkAreaJPanel = new ManageCancerCentreCoordinatorProfile(userAccount,cancerCentreOrganization,enterprise);
        userProcessContainer.add("ManageCancerCentreCoordinatorProfile",manageCancerCoordinatorWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnEditProfileMouseClicked

    private void btnAddPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatientMouseClicked
        // TODO add your handling code here:
        
        CreatePatientJPanel panel = new CreatePatientJPanel(system, userAccount, network);
        userProcessContainer.add("AddPatientJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddPatientMouseClicked

    private void btnCheckPatientStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckPatientStatusMouseClicked
        // TODO add your handling code here:
        PatientStatusJPanel panel = new PatientStatusJPanel(system);
        userProcessContainer.add("PatientStatusJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnCheckPatientStatusMouseClicked

    private void btnVolunteerReceiverRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolunteerReceiverRequestMouseClicked
        // TODO add your handling code here:
        
        VolunteerReceiverRequestJPanel panel = new VolunteerReceiverRequestJPanel(system, userAccount, network);
        userProcessContainer.add("VolunteerReceiverRequestJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnVolunteerReceiverRequestMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel btnAddPatient;
    private javax.swing.JLabel btnCheckPatientStatus;
    private javax.swing.JLabel btnEditProfile;
    private javax.swing.JLabel btnVolunteerReceiverRequest;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
