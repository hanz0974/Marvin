/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class conection {
    public static Connection getConnection(){ 
        Connection conn = null;
        if(conn == null){
            try {                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marvin","root","");

            } catch (ClassNotFoundException e) {
                System.out.println("Driver tidak ditemukan.");
            } catch (SQLException e) {
                System.out.println("Koneksi gagal.");
            } 
        }
        return conn;
    }
}
