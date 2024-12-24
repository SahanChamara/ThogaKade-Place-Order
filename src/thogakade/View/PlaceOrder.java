/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thogakade.View;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import thogakade.Controller.OrderController;
import thogakade.Controller.PlaceOrderController;
import thogakade.Model.Customer;
import thogakade.Model.Item;
import thogakade.Model.OrderDetail;

/**
 *
 * @author Sahan Chamara
 */
public class PlaceOrder extends javax.swing.JFrame {
    private double totalPrice;
    private int quantity;
    private int qtyOnHand;

    /**
     * Creates new form PlaceOrder
     */
    public PlaceOrder() {
        setLocationRelativeTo(null);
        initComponents();

        //Addint the Date
        showDate();

        // Last Order ID
        setLastOrderId();        

        //Updating Customer ID Combo BOx
        cusIdComboBox();

        //Updating Item ID Combo BOx
        itemIdComboBox();
    }

    // Order Date
    private  void showDate() {
        String date = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
        lblDate.setText(date);
    }
    
    // Adding the Last Order ID
    private void setLastOrderId(){
        try {
            String lastOrderId = OrderController.getLastOrderId();
            if(lastOrderId==null){
                lblOrderId.setText("D001");
            }else{
                int newId = Integer.parseInt(lastOrderId.substring(1));
                lblOrderId.setText(String.format("D%03d",newId+1));
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not FOunt Exception " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }

    //Updating combo Box in Customers ID
    private void cusIdComboBox() {
        try {
            ArrayList<Customer> customerId = PlaceOrderController.getCustomerId();
            for (Customer customer : customerId) {
                comboCusId.addItem(customer.getId());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not FOunt Exception " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }

    //Updating Combo Box in Item Code
    private void itemIdComboBox() {
        try {
            ArrayList<Item> itemCode = PlaceOrderController.getItemCode();
            for (Item item : itemCode) {
                comboItemCode.addItem(item.getCode());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not FOunt Exception " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblOrderId = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCusName = new javax.swing.JLabel();
        comboCusId = new javax.swing.JComboBox<>();
        btnAddCustomer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        comboItemCode = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtQtyOnHand = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        btnRemoveItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnPlaceOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(920, 650));
        setMinimumSize(new java.awt.Dimension(920, 650));
        setPreferredSize(new java.awt.Dimension(920, 650));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(44, 88, 110));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Order");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 6, 920, 57);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Order ID :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 81, 83, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Order Date : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 80, 109, 25);

        lblOrderId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOrderId.setText("generated id");
        getContentPane().add(lblOrderId);
        lblOrderId.setBounds(121, 81, 108, 25);

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDate.setText("date");
        getContentPane().add(lblDate);
        lblDate.setBounds(720, 80, 180, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Customer ID : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(24, 124, 120, 25);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Customer Name  : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(600, 120, 156, 25);

        lblCusName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCusName.setText("name");
        getContentPane().add(lblCusName);
        lblCusName.setBounds(770, 120, 130, 25);

        comboCusId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboCusId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCusIdItemStateChanged(evt);
            }
        });
        getContentPane().add(comboCusId);
        comboCusId.setBounds(150, 126, 116, 25);

        btnAddCustomer.setText("Add New Customer");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddCustomer);
        btnAddCustomer.setBounds(284, 128, 134, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Code : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 169, 58, 25);

        comboItemCode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboItemCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemCodeItemStateChanged(evt);
            }
        });
        comboItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboItemCodeActionPerformed(evt);
            }
        });
        getContentPane().add(comboItemCode);
        comboItemCode.setBounds(20, 221, 116, 25);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Description :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(181, 169, 107, 25);

        txtDesc.setEditable(false);
        txtDesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDesc.setText("desc");
        getContentPane().add(txtDesc);
        txtDesc.setBounds(181, 220, 199, 26);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Unit Price :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(419, 169, 93, 25);

        txtUnitPrice.setEditable(false);
        txtUnitPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUnitPrice.setText("unit price");
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtUnitPrice);
        txtUnitPrice.setBounds(419, 220, 126, 26);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Qty on Hand :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(590, 169, 119, 25);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Quantity");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(770, 169, 75, 25);

        txtQtyOnHand.setEditable(false);
        txtQtyOnHand.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQtyOnHand.setText("qty on hand");
        txtQtyOnHand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyOnHandActionPerformed(evt);
            }
        });
        getContentPane().add(txtQtyOnHand);
        txtQtyOnHand.setBounds(590, 220, 126, 26);

        txtQty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQty.setText("qty");
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        getContentPane().add(txtQty);
        txtQty.setBounds(770, 220, 91, 26);

        btnAddItem.setBackground(new java.awt.Color(233, 213, 39));
        btnAddItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddItem.setText("ADD");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddItem);
        btnAddItem.setBounds(312, 264, 106, 26);

        btnRemoveItem.setBackground(new java.awt.Color(233, 213, 39));
        btnRemoveItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRemoveItem.setText("REMOVE");
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoveItem);
        btnRemoveItem.setBounds(474, 264, 110, 26);

        tblItems.setBackground(new java.awt.Color(124, 180, 242));
        tblItems.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description", "Qty", "Unit Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblItems.setAlignmentY(2.0F);
        tblItems.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tblItems);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(49, 318, 829, 226);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(196, 32, 36));
        jLabel14.setText("Total : ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 574, 68, 25);

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setText("tot");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(94, 574, 68, 25);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void comboItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboItemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboItemCodeActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtQtyOnHandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyOnHandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyOnHandActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        String code = comboItemCode.getSelectedItem().toString();
        String description = txtDesc.getText();
        int qty = Integer.parseInt(txtQty.getText());
        double unitPrice = Double.parseDouble(txtUnitPrice.getText());
        
        
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveItemActionPerformed

    private void comboCusIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCusIdItemStateChanged
        String selecCusId = comboCusId.getSelectedItem().toString();
        try {
            String customerName = PlaceOrderController.getCustomerName(selecCusId);
            lblCusName.setText(customerName);

        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found Exception " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }//GEN-LAST:event_comboCusIdItemStateChanged

    private void comboItemCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemCodeItemStateChanged
        String selectItemCode = comboItemCode.getSelectedItem().toString();
        try {
            ArrayList<Item> itemDetails = PlaceOrderController.getItemDetails(selectItemCode);
            for (Item itemDetail : itemDetails) {
                txtDesc.setText(itemDetail.getDescription());
                txtUnitPrice.setText(String.valueOf(itemDetail.getUnitPrice()));
                txtQtyOnHand.setText(String.valueOf(itemDetail.getQtyOnHand()));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found Exception " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }//GEN-LAST:event_comboItemCodeItemStateChanged

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        try {
            // Updating the Order Table
            boolean tableIsUpdate = PlaceOrderController.updateOrderTable(lblOrderId.getText(),lblDate.getText(),comboCusId.getSelectedItem().toString());            
            
            if(tableIsUpdate){
                System.out.println("Order Table Updated");
            }
            
            // Updating the Item Table QtyonHand
            boolean qtyOnHandUpdate = PlaceOrderController.updateItemTalbeQty(comboItemCode.getSelectedItem().toString(),quantity,qtyOnHand);
            if(qtyOnHandUpdate){
                System.out.println("qty on hand updated");
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found Exception " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JComboBox<String> comboCusId;
    private javax.swing.JComboBox<String> comboItemCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCusName;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblOrderId;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblItems;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtQtyOnHand;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
