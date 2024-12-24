/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakade.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import thogakade.DBConnection.DBConnection;

/**
 *
 * @author Sahan Chamara
 */
public class OrderController {
    public static String getLastOrderId() throws ClassNotFoundException, SQLException{
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery("SELECT id FROM orders ORDER BY id DESC LIMIT 1");
        if(rst.next()){
            String lastOrderId = rst.getString("id");
            return lastOrderId;
        }
        return null;
    }
}
