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
public class AddCustomerForm extends javax.swing.JFrame {

    /**
     * Creates new form PlaceOrder
     */
    public AddCustomerForm() {
        setLocationRelativeTo(null);
        initComponents();
        
        // set Last ID
        setLastCustomerId();
    }
    
    // set the last customer id 
    private void setLastCustomerId(){
        try {
            String lastCustomerId = CustomerController.getLastCustomerId();
            if(lastCustomerId==null){
                lblCusId.setText("C001");
            }else{
                int newCusId = Integer.parseInt(lastCustomerId.substring(1));
                lblCusId.setText(String.format("C%03d", newCusId+1));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found Exception "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception "+ex.getMessage());
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCusId = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        txtCusSalary = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCusName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCusAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        txtCusSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusSalaryActionPerformed(evt);
            }
        });
        getContentPane().add(txtCusSalary);
        txtCusSalary.setBounds(190, 220, 110, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Customer Name : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 120, 170, 25);

        txtCusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtCusName);
        txtCusName.setBounds(190, 120, 130, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Customer Name : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 120, 170, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Customer Address : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 170, 170, 25);

        txtCusAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtCusAddress);
        txtCusAddress.setBounds(190, 170, 190, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        try {
            boolean isAdded = CustomerController.addNewCustomer(new Customer(lblCusId.getText(), txtCusName.getText(), txtCusAddress.getText(), Double.parseDouble(txtCusSalary.getText())));
            if(isAdded){
                JOptionPane.showMessageDialog(this, "Customer Added Succesfull");
            }else{
                JOptionPane.showMessageDialog(this, "Customer Added Failed");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found Exception "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception "+ex.getMessage());
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void txtCusSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusSalaryActionPerformed

    private void txtCusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusNameActionPerformed

    private void txtCusAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusAddressActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCusId;
    private javax.swing.JTextField txtCusAddress;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtCusSalary;
    // End of variables declaration//GEN-END:variables
}
