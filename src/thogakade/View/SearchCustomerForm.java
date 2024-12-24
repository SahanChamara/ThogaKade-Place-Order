/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thogakade.View;

/**
 *
 * @author Sahan Chamara
 */
public class SearchCustomerForm extends javax.swing.JFrame {

    /**
     * Creates new form PlaceOrder
     */
    public SearchCustomerForm() {

    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCusId = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        lblCusSalary = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblCusName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCusAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 650));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(44, 88, 110));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Customer");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 6, 440, 57);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Customer ID : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 81, 120, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Customer Salary : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 220, 170, 25);

        lblCusId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCusId.setText("generated id");
        getContentPane().add(lblCusId);
        lblCusId.setBounds(150, 80, 108, 25);

        btnAddItem.setBackground(new java.awt.Color(233, 213, 39));
        btnAddItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddItem.setText("ADD CUSTOMER");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddItem);
        btnAddItem.setBounds(256, 280, 160, 26);

        btnPlaceOrder.setBackground(new java.awt.Color(233, 213, 39));
        btnPlaceOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder);
        btnPlaceOrder.setBounds(757, 570, 121, 37);

        lblCusSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCusSalaryActionPerformed(evt);
            }
        });
        getContentPane().add(lblCusSalary);
        lblCusSalary.setBounds(190, 220, 110, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Customer Name : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 120, 170, 25);

        lblCusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCusNameActionPerformed(evt);
            }
        });
        getContentPane().add(lblCusName);
        lblCusName.setBounds(190, 120, 130, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Customer Name : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 120, 170, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Customer Address : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 170, 25);

        lblCusAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCusAddressActionPerformed(evt);
            }
        });
        getContentPane().add(lblCusAddress);
        lblCusAddress.setBounds(190, 170, 190, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed

    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed

    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void lblCusSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCusSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCusSalaryActionPerformed

    private void lblCusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCusNameActionPerformed

    private void lblCusAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCusAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCusAddressActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lblCusAddress;
    private javax.swing.JLabel lblCusId;
    private javax.swing.JTextField lblCusName;
    private javax.swing.JTextField lblCusSalary;
    // End of variables declaration//GEN-END:variables
}
