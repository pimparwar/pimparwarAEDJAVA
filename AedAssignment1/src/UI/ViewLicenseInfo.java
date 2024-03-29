/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Image;
import personalInformation.License;

/**
 *
 * @author admin
 */
public class ViewLicenseInfo extends javax.swing.JPanel {

    License license;
    Image uploadedImage;
    /**
     * Creates new form viewDemographicInformation
     */
    public ViewLicenseInfo(License license) {
        initComponents();
        this.license=license;
        
    
        displayDemoInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        txtIssuedDate = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtdateOfExpiration = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtBloodType = new javax.swing.JTextField();
        lblZipcode = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(536, 484));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 181, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LICENSE INFORMATION");

        lblStreet.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblStreet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStreet.setText("LIicense Number");

        txtLicenseNumber.setEditable(false);
        txtLicenseNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtLicenseNumber.setMargin(new java.awt.Insets(0, 0, 2, 0));
        txtLicenseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseNumberActionPerformed(evt);
            }
        });

        txtIssuedDate.setEditable(false);
        txtIssuedDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtIssuedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIssuedDateActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity.setText("Date Issued");

        txtdateOfExpiration.setEditable(false);
        txtdateOfExpiration.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtdateOfExpiration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateOfExpirationActionPerformed(evt);
            }
        });

        lblState.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblState.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblState.setText("Date of Expiration ");

        txtBloodType.setEditable(false);
        txtBloodType.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));
        txtBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodTypeActionPerformed(evt);
            }
        });

        lblZipcode.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        lblZipcode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblZipcode.setText("Blood Type");

        lblImage.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        lblImage.setForeground(new java.awt.Color(153, 153, 153));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("photo");
        lblImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 204, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtLicenseNumber)
                        .addComponent(txtIssuedDate)
                        .addComponent(txtdateOfExpiration)
                        .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblState))
                    .addComponent(lblStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblStreet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIssuedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdateOfExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblZipcode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLicenseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseNumberActionPerformed

    private void txtIssuedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIssuedDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIssuedDateActionPerformed

    private void txtdateOfExpirationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateOfExpirationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateOfExpirationActionPerformed

    private void txtBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodTypeActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JTextField txtBloodType;
    private javax.swing.JTextField txtIssuedDate;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtdateOfExpiration;
    // End of variables declaration//GEN-END:variables

    private void displayDemoInfo(){
    
    txtLicenseNumber.setText(license.getLicenseNumber());
    txtIssuedDate.setText(license.getIssuedDate());
    txtdateOfExpiration.setText(license.getDateOfExpiration());
    txtBloodType.setText(license.getBloodType());
  
      // license.imageIcon.setImage(license.imageIcon.getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
    lblImage.setIcon(license.imageIcon);
}
}
