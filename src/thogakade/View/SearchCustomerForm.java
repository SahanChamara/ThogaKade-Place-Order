/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thogakade.View;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import thogakade.Controller.CustomerController;
import thogakade.Model.Customer;

/**
 *
 * @author Sahan Chamara
 */
public class SearchCustomerForm extends javax.swing.JFrame {

    /**
     * Creates new form PlaceOrder
     */
    public SearchCustomerForm() {
        initComponents();

    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        lblCusSalary = new javax.swing.JLabel();
        txtCusId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCusName = new javax.swing.JLabel();
        lblCusAddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(441, 352));
        setMinimumSize(new java.awt.Dimension(441, 352));
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

        btnSearch.setBackground(new java.awt.Color(233, 213, 39));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setText("SEARCH CUSTOMER");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(236, 280, 180, 26);

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

        lblCusSalary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCusSalary.setText("salary");
        getContentPane().add(lblCusSalary);
        lblCusSalary.setBounds(190, 220, 170, 25);

        txtCusId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtCusId);
        txtCusId.setBounds(150, 80, 210, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Customer Name : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 120, 170, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Customer Address : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 170, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Customer Name : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 120, 170, 25);

        lblCusName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCusName.setText("cus name");
        getContentPane().add(lblCusName);
        lblCusName.setBounds(180, 120, 170, 25);

        lblCusAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCusAddress.setText("addres");
        getContentPane().add(lblCusAddress);
        lblCusAddress.setBounds(190, 170, 170, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        txtCusIdActionPerformed(evt);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed

    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void txtCusIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusIdActionPerformed
        try {
            Customer searchCustomer = CustomerController.searchCustomer(txtCusId.getText());
            if (searchCustomer != null) {
                lblCusName.setText(searchCustomer.getName());
                lblCusAddress.setText(searchCustomer.getAddress());
                lblCusSalary.setText(String.valueOf(searchCustomer.getSalary()));
            }else{
                JOptionPane.showMessageDialog(this, "Customer Not Found...");
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Class not Foound Exception " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }//GEN-LAST:event_txtCusIdActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCusAddress;
    private javax.swing.JLabel lblCusName;
    private javax.swing.JLabel lblCusSalary;
    private javax.swing.JTextField txtCusId;
    // End of variables declaration//GEN-END:variables
}
