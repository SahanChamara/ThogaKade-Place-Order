/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakade.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import thogakade.DBConnection.DBConnection;
import thogakade.Model.Customer;

/**
 *
 * @author Sahan Chamara
 */
public class CustomerController {

    // Get Last Customer ID
    public static String getLastCustomerId() throws ClassNotFoundException, SQLException {
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT id FROM customer ORDER BY id DESC LIMIT 1");
        if (rst.next()) {
            String lastCusId = rst.getString("id");
            return lastCusId;
        }
        return null;
    }

    // Add new customer
    public static boolean addNewCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        PreparedStatement prepareStm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO customer VALUES (?,?,?,?)");
        prepareStm.setObject(1, customer.getId());
        prepareStm.setObject(2, customer.getName());
        prepareStm.setObject(3, customer.getAddress());
        prepareStm.setObject(4, customer.getSalary());

        return prepareStm.executeUpdate() > 0;
    }

    // Search Customer
    public static Customer searchCustomer(String id) throws ClassNotFoundException, SQLException {
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM customer WHERE id  = '" + id + "'");

        if (rst.next()) {
            Customer cus = new Customer(null, rst.getString("name"), rst.getString("address"), rst.getDouble("salary"));
            return cus;
        }
        return null;
    }

    // load Customer IDs for combo Box    
    public static ArrayList<Customer> getCustomerId() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> customerIdList = new ArrayList<>();
        
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery("select id from customer");
        while (rst.next()){
            customerIdList.add(new Customer(rst.getString("id"), null, null, 0));            
        }
        return customerIdList;
        
        // we can use the ArrayList<String> for return this.....
    }
}
