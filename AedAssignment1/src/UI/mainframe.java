/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import personalInformation.CheckingAccount;
import personalInformation.DemographicInformation;
import personalInformation.Adress;
import personalInformation.License;
import personalInformation.MedicalInfo;
import personalInformation.SavingAccount;


/**
 *
 * @author admin
 */
public class mainframe extends javax.swing.JFrame {

    
    DemographicInformation demoinfo ;
    CheckingAccount checkingAccount;
    SavingAccount savingAccount;
    Adress adress;
    License license;
    MedicalInfo medicalInfo;
    
    
    public mainframe() {
        initComponents();
        setExtendedState(mainframe.MAXIMIZED_BOTH);
        
        demoinfo = new DemographicInformation();
        checkingAccount = new CheckingAccount();
        savingAccount = new SavingAccount();
        adress = new Adress();
        license =new License();
        medicalInfo =new MedicalInfo();
        
        CreateDemographicInformation createDI = new CreateDemographicInformation(demoinfo); 
       jSplitPane1.setRightComponent(createDI);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        form = new javax.swing.JPanel();
        btnCreateDI = new javax.swing.JButton();
        btnViewDI = new javax.swing.JButton();
        lblDemographicInfo = new javax.swing.JLabel();
        btnCreateAdress = new javax.swing.JButton();
        btnViewAdress = new javax.swing.JButton();
        btnCreateSaving = new javax.swing.JButton();
        btnViewSaving = new javax.swing.JButton();
        btnCreateChecking = new javax.swing.JButton();
        btnViewChecking = new javax.swing.JButton();
        btnCreateLicense = new javax.swing.JButton();
        btnViewLicense = new javax.swing.JButton();
        btnCreateMedical = new javax.swing.JButton();
        btnViewMedical = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDemographicInfo1 = new javax.swing.JLabel();
        lblDemographicInfo2 = new javax.swing.JLabel();
        lblDemographicInfo3 = new javax.swing.JLabel();
        lblDemographicInfo4 = new javax.swing.JLabel();
        lblDemographicInfo5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setMinimumSize(new java.awt.Dimension(753, 484));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(753, 484));

        form.setBackground(new java.awt.Color(0, 188, 204));
        form.setPreferredSize(new java.awt.Dimension(230, 600));

        btnCreateDI.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateDI.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateDI.setText("create");
        btnCreateDI.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btnCreateDI.setBorderPainted(false);
        btnCreateDI.setContentAreaFilled(false);
        btnCreateDI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateDI.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnCreateDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDIActionPerformed(evt);
            }
        });

        btnViewDI.setBackground(new java.awt.Color(255, 255, 255));
        btnViewDI.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDI.setText("view");
        btnViewDI.setBorderPainted(false);
        btnViewDI.setContentAreaFilled(false);
        btnViewDI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDIActionPerformed(evt);
            }
        });

        lblDemographicInfo.setBackground(new java.awt.Color(204, 204, 255));
        lblDemographicInfo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        lblDemographicInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblDemographicInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDemographicInfo.setText("Demographic Information");

        btnCreateAdress.setBackground(new java.awt.Color(0, 188, 204));
        btnCreateAdress.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAdress.setText("create");
        btnCreateAdress.setBorderPainted(false);
        btnCreateAdress.setContentAreaFilled(false);
        btnCreateAdress.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateAdress.setDefaultCapable(false);
        btnCreateAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAdressActionPerformed(evt);
            }
        });

        btnViewAdress.setBackground(new java.awt.Color(255, 255, 255));
        btnViewAdress.setForeground(new java.awt.Color(255, 255, 255));
        btnViewAdress.setText("view");
        btnViewAdress.setBorderPainted(false);
        btnViewAdress.setContentAreaFilled(false);
        btnViewAdress.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewAdress.setDefaultCapable(false);
        btnViewAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAdressActionPerformed(evt);
            }
        });

        btnCreateSaving.setBackground(new java.awt.Color(0, 188, 204));
        btnCreateSaving.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateSaving.setText("create");
        btnCreateSaving.setBorderPainted(false);
        btnCreateSaving.setContentAreaFilled(false);
        btnCreateSaving.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateSaving.setDefaultCapable(false);
        btnCreateSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSavingActionPerformed(evt);
            }
        });

        btnViewSaving.setBackground(new java.awt.Color(0, 188, 204));
        btnViewSaving.setForeground(new java.awt.Color(255, 255, 255));
        btnViewSaving.setText("view");
        btnViewSaving.setBorderPainted(false);
        btnViewSaving.setContentAreaFilled(false);
        btnViewSaving.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewSaving.setDefaultCapable(false);
        btnViewSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSavingActionPerformed(evt);
            }
        });

        btnCreateChecking.setBackground(new java.awt.Color(0, 188, 204));
        btnCreateChecking.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateChecking.setText("create");
        btnCreateChecking.setBorderPainted(false);
        btnCreateChecking.setContentAreaFilled(false);
        btnCreateChecking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateChecking.setDefaultCapable(false);
        btnCreateChecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCheckingActionPerformed(evt);
            }
        });

        btnViewChecking.setBackground(new java.awt.Color(0, 188, 204));
        btnViewChecking.setForeground(new java.awt.Color(255, 255, 255));
        btnViewChecking.setText("view");
        btnViewChecking.setBorderPainted(false);
        btnViewChecking.setContentAreaFilled(false);
        btnViewChecking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewChecking.setDefaultCapable(false);
        btnViewChecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCheckingActionPerformed(evt);
            }
        });

        btnCreateLicense.setBackground(new java.awt.Color(0, 188, 204));
        btnCreateLicense.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateLicense.setText("create");
        btnCreateLicense.setBorderPainted(false);
        btnCreateLicense.setContentAreaFilled(false);
        btnCreateLicense.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateLicense.setDefaultCapable(false);
        btnCreateLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLicenseActionPerformed(evt);
            }
        });

        btnViewLicense.setBackground(new java.awt.Color(0, 188, 204));
        btnViewLicense.setForeground(new java.awt.Color(255, 255, 255));
        btnViewLicense.setText("view");
        btnViewLicense.setBorderPainted(false);
        btnViewLicense.setContentAreaFilled(false);
        btnViewLicense.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewLicense.setDefaultCapable(false);
        btnViewLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLicenseActionPerformed(evt);
            }
        });

        btnCreateMedical.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateMedical.setText("create");
        btnCreateMedical.setBorderPainted(false);
        btnCreateMedical.setContentAreaFilled(false);
        btnCreateMedical.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateMedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMedicalActionPerformed(evt);
            }
        });

        btnViewMedical.setForeground(new java.awt.Color(255, 255, 255));
        btnViewMedical.setText("view");
        btnViewMedical.setBorderPainted(false);
        btnViewMedical.setContentAreaFilled(false);
        btnViewMedical.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewMedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMedicalActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Information Report");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Control Pannel");

        lblDemographicInfo1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        lblDemographicInfo1.setForeground(new java.awt.Color(255, 255, 255));
        lblDemographicInfo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDemographicInfo1.setText("Address Information");

        lblDemographicInfo2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        lblDemographicInfo2.setForeground(new java.awt.Color(255, 255, 255));
        lblDemographicInfo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDemographicInfo2.setText("Saving Account");

        lblDemographicInfo3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        lblDemographicInfo3.setForeground(new java.awt.Color(255, 255, 255));
        lblDemographicInfo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDemographicInfo3.setText("Checking Account");

        lblDemographicInfo4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        lblDemographicInfo4.setForeground(new java.awt.Color(255, 255, 255));
        lblDemographicInfo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDemographicInfo4.setText("License Information");

        lblDemographicInfo5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        lblDemographicInfo5.setForeground(new java.awt.Color(255, 255, 255));
        lblDemographicInfo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDemographicInfo5.setText("Medical Information");
        lblDemographicInfo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formLayout.createSequentialGroup()
                            .addComponent(btnCreateChecking)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnViewChecking, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formLayout.createSequentialGroup()
                            .addComponent(btnCreateSaving)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnViewSaving, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formLayout.createSequentialGroup()
                            .addComponent(btnCreateAdress)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnViewAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formLayout.createSequentialGroup()
                            .addComponent(btnCreateDI, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnViewDI, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addComponent(btnCreateLicense)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(btnCreateMedical)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewMedical, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
            .addComponent(lblDemographicInfo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDemographicInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDemographicInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDemographicInfo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDemographicInfo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDemographicInfo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(lblDemographicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateDI, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblDemographicInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAdress))
                .addGap(18, 18, 18)
                .addComponent(lblDemographicInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateSaving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewSaving))
                .addGap(18, 18, 18)
                .addComponent(lblDemographicInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateChecking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewChecking))
                .addGap(18, 18, 18)
                .addComponent(lblDemographicInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateLicense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewLicense))
                .addGap(18, 18, 18)
                .addComponent(lblDemographicInfo5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateMedical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewMedical))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(form);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDIActionPerformed
        // TODO add youdr handling code here:
        
       CreateDemographicInformation createDI = new CreateDemographicInformation(demoinfo); 
       jSplitPane1.setRightComponent(createDI);
    }//GEN-LAST:event_btnCreateDIActionPerformed

    private void btnViewDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDIActionPerformed
        // TODO add your handling code here:
       ViewDemographicInformation viewDI = new ViewDemographicInformation(demoinfo);
       jSplitPane1.setRightComponent(viewDI);
    }//GEN-LAST:event_btnViewDIActionPerformed

    private void btnCreateAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAdressActionPerformed
        // TODO add your handling code here:
        CreateAdress createAdress = new CreateAdress(adress);
        jSplitPane1.setRightComponent(createAdress);
    }//GEN-LAST:event_btnCreateAdressActionPerformed

    private void btnViewAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAdressActionPerformed
        // TODO add your handling code here:
        ViewAddress viewAdress = new ViewAddress(adress);
        jSplitPane1.setRightComponent(viewAdress);
        
    }//GEN-LAST:event_btnViewAdressActionPerformed

    private void btnCreateSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateSavingActionPerformed
        // TODO add your handling code here:
        createSavingAccInfo crSavingAccInfo = new createSavingAccInfo(savingAccount);
        jSplitPane1.setRightComponent(crSavingAccInfo);
    }//GEN-LAST:event_btnCreateSavingActionPerformed

    private void btnViewSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSavingActionPerformed
        // TODO add your handling code here:
        viewSavingAccInfo viSavingAccInfo = new viewSavingAccInfo(savingAccount);
        jSplitPane1.setRightComponent(viSavingAccInfo);
    }//GEN-LAST:event_btnViewSavingActionPerformed

    private void btnCreateCheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCheckingActionPerformed
        // TODO add your handling code here:
        CreateCheckingAccInfo crCheckingAccInfo = new CreateCheckingAccInfo(checkingAccount);
        jSplitPane1.setRightComponent(crCheckingAccInfo);
    }//GEN-LAST:event_btnCreateCheckingActionPerformed

    private void btnViewCheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCheckingActionPerformed
        // TODO add your handling code here:
        ViewCheckingAccInfo viCheckingAccInfo = new ViewCheckingAccInfo(checkingAccount);
        jSplitPane1.setRightComponent(viCheckingAccInfo);
    }//GEN-LAST:event_btnViewCheckingActionPerformed

    private void btnCreateLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLicenseActionPerformed
        // TODO add your handling code here:
        CreateLicenseInfo crLicenseInfo = new CreateLicenseInfo(license);
        jSplitPane1.setRightComponent(crLicenseInfo);
        license.setphotonull();
    }//GEN-LAST:event_btnCreateLicenseActionPerformed

    private void btnViewLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLicenseActionPerformed
        // TODO add your handling code here:
        ViewLicenseInfo viLicenseInfo = new ViewLicenseInfo(license);
        jSplitPane1.setRightComponent(viLicenseInfo);
        
        
    }//GEN-LAST:event_btnViewLicenseActionPerformed

    private void btnCreateMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMedicalActionPerformed
        // TODO add your handling code here:
        
       CreateMedicalInfo crMedicalInfo = new CreateMedicalInfo(medicalInfo);
       jSplitPane1.setRightComponent(crMedicalInfo);
    }//GEN-LAST:event_btnCreateMedicalActionPerformed

    private void btnViewMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMedicalActionPerformed
        // TODO add your handling code here:
          ViewMedicalInfo viMedicalInfo = new ViewMedicalInfo(medicalInfo);
       jSplitPane1.setRightComponent(viMedicalInfo);
    }//GEN-LAST:event_btnViewMedicalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling co
        viewReport vr = new viewReport(demoinfo,checkingAccount,savingAccount,adress,license,medicalInfo);
        jSplitPane1.setRightComponent(vr);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAdress;
    private javax.swing.JButton btnCreateChecking;
    private javax.swing.JButton btnCreateDI;
    private javax.swing.JButton btnCreateLicense;
    private javax.swing.JButton btnCreateMedical;
    private javax.swing.JButton btnCreateSaving;
    private javax.swing.JButton btnViewAdress;
    private javax.swing.JButton btnViewChecking;
    private javax.swing.JButton btnViewDI;
    private javax.swing.JButton btnViewLicense;
    private javax.swing.JButton btnViewMedical;
    private javax.swing.JButton btnViewSaving;
    private javax.swing.JPanel form;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblDemographicInfo;
    private javax.swing.JLabel lblDemographicInfo1;
    private javax.swing.JLabel lblDemographicInfo2;
    private javax.swing.JLabel lblDemographicInfo3;
    private javax.swing.JLabel lblDemographicInfo4;
    private javax.swing.JLabel lblDemographicInfo5;
    // End of variables declaration//GEN-END:variables
}
