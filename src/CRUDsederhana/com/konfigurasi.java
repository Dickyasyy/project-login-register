/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDsederhana.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class konfigurasi {
    
    private static Connection MySQLConfiq;
    
    public static Connection configDB()throws SQLException{
        try{
            String url ="jdbc:mysql://localhost:3306/pasien_rawat_inap";
            String user = "root";
            String pw = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfiq = DriverManager.getConnection(url, user, pw);
            
        }catch(SQLException e){
            System.out.println("Koneksi ke database Gagal "+e.getMessage());
        }
        return MySQLConfiq;
    }
}
