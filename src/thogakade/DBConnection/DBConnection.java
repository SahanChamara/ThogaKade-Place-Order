/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakade.DBConnection;
import java.sql.*;


/**
 *
 * @author Sahan Chamara
 */
public class DBConnection {
    private static DBConnection instance;
    private Connection connection;
    
    
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/thogakade", "root", "sahan@sql");        
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        return instance==null?instance = new DBConnection():instance;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
}
