/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlhokhau_lekimanh;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fptshop
 */
public class ketnoi {
     public static Connection KNCSDL() throws SQLException{
       
       Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhokhau_lekimanh", "root", "");
       return c;
       
   }
    
}
