/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thogakade;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import thogakade.Controller.PlaceOrderController;
import thogakade.DBConnection.DBConnection;
import thogakade.View.PlaceOrder;



/**
 *
 * @author Sahan Chamara
 */
public class ThogaKade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        new PlaceOrder().setVisible(true);
        try {
            System.out.println(PlaceOrderController.generateOrderId());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThogaKade.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ThogaKade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
