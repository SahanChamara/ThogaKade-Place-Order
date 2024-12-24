/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakade.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import thogakade.DBConnection.DBConnection;
import thogakade.Model.Item;

/**
 *
 * @author Sahan Chamara
 */
public class ItemController {
    // Load All Item Codes to Combo BOX
    public static ArrayList<String> loadItemCodes() throws ClassNotFoundException, SQLException{
        ArrayList<String> allItemCodes = new ArrayList<>();
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT code FROM item");
        while (rst.next()){
            allItemCodes.add(rst.getString("code"));
        }
        return allItemCodes;        
    }
    
    // Search Item using item code
    public static Item searchItem(String itemCode) throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM item WHERE code = '"+itemCode+"'");
        if(rst.next()){
            Item item = new Item();
            item.setDescription(rst.getString(2));
            item.setUnitPrice(rst.getDouble(3));
            item.setQtyOnHand(rst.getInt(4));
            return item;
        }
        return null;
    }
}
