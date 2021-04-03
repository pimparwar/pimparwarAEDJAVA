/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prasanna
 */
public class CreateRestaurantJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    /**
     * Creates new form CreateRetaurantJPanel
     */
    public CreateRestaurantJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtManagerName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_back.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 181, 204));
        jLabel1.setText("Create Restaurant");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(109, 109, 109));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Restaurant Name*:");

        txtRestaurantName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(109, 109, 109));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Manager Name*:");

        txtManagerName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 109, 109));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Phone Number*:");

        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 109, 109));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Address*:");

        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_create.png"))); // NOI18N
        btnCreate.setBorderPainted(false);
        btnCreate.setContentAreaFilled(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(109, 109, 109));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Username*:");

        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(109, 109, 109));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Password*:");

        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 181, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(118, 118, 118)))
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnCreate)
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRestaurantJPanel mrjp = (ManageRestaurantJPanel) component;
        mrjp.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(txtRestaurantName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtPhoneNumber.getText().isEmpty() || 
                txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() || txtManagerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        String restaurantName = txtRestaurantName.getText();
        String managerName = txtManagerName.getText();

        boolean flag ;

        flag = restaurantName.matches("^[a-zA-Z]+$");

        if(flag == false) {
            JOptionPane.showMessageDialog(null, "First name cannot have integer values");
            return;
        }

        flag = managerName.matches("^[a-zA-Z]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Last name cannot have integer values");
            return;
        }

        String phoneNumber = txtPhoneNumber.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        
        for(Restaurant restaurant : restaurantDirectory.getRestaurantDirectory()) {
            if(restaurant.getPhoneNumber().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
                return;
            }
        }


        String address = txtAddress.getText();
        String userName = txtUsername.getText();
        String password = txtPassword.getText();

        for(UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                return;
            }
        }

        //Restaurant restaurant = restaurantDirectory.newRestaurant(restaurantName, address, managerName, phoneNumber);
        //System.out.println(restaurant.getRestaurantName() + " + ");
        System.out.println("Eco" + ecoSystem.getRestaurantDirectory().getRestaurantDirectory().size());
        ecoSystem.getRestaurantDirectory().newRestaurant(restaurantName, address, managerName, phoneNumber);
        
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(restaurantName);
        UserAccount userAccount = ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new AdminRole());

        JOptionPane.showMessageDialog(null, "Restaurant Created");

    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}