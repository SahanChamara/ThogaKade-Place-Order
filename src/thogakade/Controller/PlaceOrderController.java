/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakade.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import thogakade.DBConnection.DBConnection;
import thogakade.Model.Customer;

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
            return String.format("D%03d", id + 1);
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

}
