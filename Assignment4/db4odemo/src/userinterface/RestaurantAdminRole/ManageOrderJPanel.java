/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prasanna
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;
    /**
     * Creates new form ManageOrderJPanel
     */
    public ManageOrderJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.account = account;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.menuDirectory = ecoSystem.getMenuDirectory();
        this.orderDirectory = ecoSystem.getOrderDirectory();
        populateTable();
        populateRestaurantCombo();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);
        
        for(Order order : ecoSystem.getOrderDirectory().getOrderDirectory()) {
            System.out.println(" Rest  " + account.getEmployee().getName() + "  " + order.getRestaurant().getRestaurantName());
            if(account.getEmployee().getName().equals(order.getRestaurant().getRestaurantName())) {
              Object [] row = new Object[5];
                row[0] = order;
                row[1] = order.getMessage();
                row[2] = order.getCustomer().getName();
                row[3] = order.getQuantity();
                row[4] = order.getOrderStatus();
                dtm.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCompleted = new javax.swing.JButton();
        btnAccepted = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        boxdel = new javax.swing.JComboBox<>();
        assigndelman = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        deny = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        btnCompleted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_completed.png"))); // NOI18N
        btnCompleted.setBorderPainted(false);
        btnCompleted.setContentAreaFilled(false);
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });

        btnAccepted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_accept.png"))); // NOI18N
        btnAccepted.setBorderPainted(false);
        btnAccepted.setContentAreaFilled(false);
        btnAccepted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 181, 204));
        jLabel1.setText("Manage Orders");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        boxdel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxdel.setOpaque(false);
        boxdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxdelActionPerformed(evt);
            }
        });

        assigndelman.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        assigndelman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_assign (1).png"))); // NOI18N
        assigndelman.setBorderPainted(false);
        assigndelman.setContentAreaFilled(false);
        assigndelman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assigndelmanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("assign delivery man:");

        deny.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_deny.png"))); // NOI18N
        deny.setBorderPainted(false);
        deny.setContentAreaFilled(false);
        deny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyActionPerformed(evt);
            }
        });

        tblOrder.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Message", "Reciever", "Price", "Order Status"
            }
        ));
        jScrollPane1.setViewportView(tblOrder);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(69, 69, 69)
                                        .addComponent(boxdel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAccepted)
                                        .addGap(94, 94, 94)
                                        .addComponent(deny, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(assigndelman)
                                    .addComponent(btnCompleted)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deny, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAccepted, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCompleted, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(boxdel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(assigndelman)))
                .addGap(122, 122, 122))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Accepted")) {
            order.setOrderStatus("Order Ready for Pick up");
            order.setAssign(true);
        }
        
        else if(order.getOrderStatus().equals("Order Placed")) {
            JOptionPane.showMessageDialog(null, "Order is should be accepted first");
            return;
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Order is already ready for pick up");
            return;
        }
        
        populateTable();
        
    }//GEN-LAST:event_btnCompletedActionPerformed

    private void btnAcceptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Placed")) {
            order.setOrderStatus("Order Accepted");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Order is already accepted or Completed");
            return;
        }
        
        populateTable();
        
    }//GEN-LAST:event_btnAcceptedActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void boxdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxdelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxdelActionPerformed

    private void assigndelmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assigndelmanActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblOrder.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }

        Order order = (Order) tblOrder.getValueAt(selectedRow,0);
        String delmanname = boxdel.getSelectedItem().toString();
        if(order.getOrderStatus().equals("Order Ready for Pick up"))
        {
            order.setDeliveryMan(delmanname);
            order.setOrderStatus("Order Assigned");
            JOptionPane.showMessageDialog(null, "Ordered assigned");
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please complete order first");
            

        }
    }//GEN-LAST:event_assigndelmanActionPerformed

    private void denyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);

        //orderDirectory.removeorder(order);
        order.setOrderStatus("Order Cancled");
        order.setAssign(true);

        populateTable();

        JOptionPane.showMessageDialog(null,"Order Cancled");
    }//GEN-LAST:event_denyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assigndelman;
    private javax.swing.JComboBox<String> boxdel;
    private javax.swing.JButton btnAccepted;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton deny;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables

    private void populateRestaurantCombo() {boxdel.removeAllItems();
        boxdel.addItem("  ");
        for(DeliveryMan del : ecoSystem.getDeliveryManDirectory().getDeliveryManDirectory()) {
            //System.out.println("res" + res);
            boxdel.addItem(del.getName());
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}