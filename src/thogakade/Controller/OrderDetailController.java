/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakade.Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import thogakade.DBConnection.DBConnection;
import thogakade.Model.OrderDetail;

/**
 *
 * @author Sahan Chamara
 */
public class OrderDetailController {
    public static boolean addOrderDetail(ArrayList<OrderDetail> orderDetailList) throws ClassNotFoundException, SQLException{
        for (OrderDetail orderDetail : orderDetailList){
            boolean isAdded = addOrderDetail(orderDetail);
            if(!isAdded){
                return false;
            }
        }
        return !orderDetailList.isEmpty();
    }
    
    public static boolean addOrderDetail(OrderDetail orderDetail) throws ClassNotFoundException, SQLException{
        PreparedStatement prepareStm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO orderdetail VALUES(?,?,?,?)");
        prepareStm.setObject(1, orderDetail.getOrderId());
        prepareStm.setObject(2, orderDetail.getItemCode());
        prepareStm.setObject(3, orderDetail.getQty());
        prepareStm.setObject(4, orderDetail.getUnitPrice());
        
        return prepareStm.executeUpdate() > 0;
    }
}
