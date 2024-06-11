/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlnsx_lekimanh;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fptshop
 */
public class KN {

    public static Connection KNCSDL() throws SQLException{
       
       Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/QlnhaSx_lekimanh", "root", "");
       return c;
       
   }
    
}
