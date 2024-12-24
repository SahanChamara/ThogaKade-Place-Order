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
import thogakade.Model.OrderDetail;

/**
 *
 * @author Sahan Chamara
 */
public class PlaceOrderController {
    
    // Add item ID for Combo Box
    
    
  
    // Add selected item for text feilds
  
    
    
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
