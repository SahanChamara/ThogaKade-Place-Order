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
import thogakade.Model.Orders;

/**
 *
 * @author Sahan Chamara
 */
public class OrderController {

    public static String getLastOrderId() throws ClassNotFoundException, SQLException {
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery("SELECT id FROM orders ORDER BY id DESC LIMIT 1");
        if (rst.next()) {
            String lastOrderId = rst.getString("id");
            return lastOrderId;
        }
        return null;
    }

    // Adding the order ID , Date and customer id to the Orders Table
    public static boolean placeOrder(Orders order) throws ClassNotFoundException, SQLException {
        PreparedStatement prepareStm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO orders VALUES(?,?,?)");
        prepareStm.setObject(1, order.getId());
        prepareStm.setObject(2, order.getDate());
        prepareStm.setObject(3, order.getCustomerId());

        boolean isAdded = prepareStm.executeUpdate() > 0;
        if (isAdded) {
            boolean orderDetailAdded = OrderDetailController.addOrderDetail(order.getOrderDetailList());
            if (orderDetailAdded) {
                boolean isUpdateStock = ItemController.updateStock(order.getOrderDetailList());
                if (isUpdateStock) {
                    return true;
                }
            }
        }
        return false;
    }
}
