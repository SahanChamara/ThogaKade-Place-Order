/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakade.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import thogakade.DBConnection.DBConnection;
import thogakade.Model.Customer;
import thogakade.Model.Item;
import thogakade.Model.OrderDetails;

/**
 *
 * @author Sahan Chamara
 */
public class PlaceOrderController {

    public static String showDate() {
        return new SimpleDateFormat("yyyy/MM/dd").format(new Date());
    }

    // generating order ID
    public static String generateOrderId() throws ClassNotFoundException, SQLException {
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery("select id from orders");

        String newId = null;
        if (rst.next()) {
            newId = rst.getString("id");
        }
        while (rst.next()) {            
            newId = rst.getString("id");
            rst.next();
        }
        if (newId == null) {
            return "D001";
        } else {
            int id = Integer.parseInt(newId.substring(1, 4));
            return String.format("D%03d", id + 2);
        }
    }

    // Add Customer ID for combo Box
    public static ArrayList<Customer> getCustomerId() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> customerIdList = new ArrayList<>();
        
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery("select id from customer");
        while (rst.next()){
            customerIdList.add(new Customer(rst.getString("id"), null, null, 0));            
        }
        return customerIdList;
    }

    // Add Customer name for selecting combo box id
    public static String getCustomerName(String id) throws ClassNotFoundException, SQLException{
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery("select name from customer where id='"+id+"'");
        if(rst.next()){
            return rst.getString("name");
        }        
        return null;
    }
    
    // Add item ID for Combo Box
    public static ArrayList<Item> getItemCode() throws ClassNotFoundException, SQLException{
        ArrayList<Item> itemCodeList = new ArrayList<>();
        
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery("select code from item");
        while(rst.next()){
            itemCodeList.add(new Item(rst.getString("code"), null, 0, 0));
        }
        return itemCodeList;
    }
    
    // Add selected item for text feilds
    public static ArrayList<Item> getItemDetails(String itemCode) throws ClassNotFoundException, SQLException{
        ArrayList<Item> itemList = new ArrayList<>();
        
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery("select description,unitPrice,qtyOnHand from item where code='"+itemCode+"'");
        if(rst.next()){
            itemList.add(new Item(null, rst.getString("description"), rst.getDouble("unitPrice"), rst.getInt("qtyOnHand")));            
        }
        return itemList;        
    }
    
    // Adding the item for table
    public static ArrayList<OrderDetails> loadTable(String code, String description, int qty, double unitPrice){        
        ArrayList<OrderDetails> tableDetails = new ArrayList();
        
        double tot = qty*unitPrice;
        
        tableDetails.add(new OrderDetails(null,code,description,qty,unitPrice,tot));
        
//        for (int i = 0; i < tableDetails.size(); i++){                
//            OrderDetails od = tableDetails.get(i);
//            if(od.getItemCode().equalsIgnoreCase(code)){                
//                tableDetails.add(new OrderDetails(null, null, null, qty, 0, tot));
//            }else{
//                tableDetails.add(new OrderDetails(null,code,description,qty,unitPrice,tot));
//            }
//        }
        
        return tableDetails;
    }
    
    //Adding order id,Date,customer id to order table
    public static boolean updateOrderTable(String orderId,String date,String cusId) throws ClassNotFoundException, SQLException{
        PreparedStatement prepareStm = DBConnection.getInstance().getConnection().prepareStatement("insert into orders values(?,?,?)");
        prepareStm.setObject(1, orderId);
        prepareStm.setObject(2, date);
        prepareStm.setObject(3, cusId);
        
        return prepareStm.executeUpdate()>0;        
    }

    //Updating the item table  qty on hand
    public static boolean updateItemTalbeQty(String itemCode,int qty,int qtyOnHand) throws ClassNotFoundException, SQLException{
        
        int updatedQtyOnHand = qtyOnHand-qty;
        
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        return stm.executeUpdate("update item set qtyOnHand='"+updatedQtyOnHand+"' where code='"+itemCode+"'") > 0;        
    }
}
