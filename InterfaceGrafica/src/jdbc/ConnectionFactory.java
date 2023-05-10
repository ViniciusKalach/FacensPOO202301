package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public Connection getConnectionUSBWebService(){
        try {
            var conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/vendased?zeroDateTimeBehavior=CONVERT_TO_NULL&useTimezone=true&serverTimezone=UTC", "root", "usbw");
            
            return conn;
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }

}
