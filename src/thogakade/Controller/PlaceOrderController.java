/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakade.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sahan Chamara
 */
public class PlaceOrderController {
    public static String showDate(){
        return new SimpleDateFormat("yyyy/MM/dd").format(new Date());
    }
    
}
