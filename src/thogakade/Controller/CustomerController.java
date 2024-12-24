/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakade.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import thogakade.DBConnection.DBConnection;
import thogakade.Model.Customer;

/**
 *
 * @author Sahan Chamara
 */
public class CustomerController {
    // Get Last Customer ID
    public static String getLastCustomerId() throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT id FROM customer ORDER BY id DESC LIMIT 1");
        if(rst.next()){
            String lastCusId = rst.getString("id");
            return lastCusId;
        }
        return null;
    }
    
    // Add new customer
    public static boolean addNewCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        PreparedStatement prepareStm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO customer VALUES (?,?,?,?)");
        prepareStm.setObject(1, customer.getId());
        prepareStm.setObject(2, customer.getName());
        prepareStm.setObject(3, customer.getAddress());
        prepareStm.setObject(4, customer.getSalary());
        
        return prepareStm.executeUpdate() > 0;       
    }
    
}
