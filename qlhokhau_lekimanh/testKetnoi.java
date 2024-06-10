/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlhokhau_lekimanh;

import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author fptshop
 */
public class testKetnoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Connection kn= ketnoi.KNCSDL();
        if(kn==null){
            System.out.println("Không thể kết nối đến CSDL");
        }else{
            System.out.println("Bạn đã kết nối thành công đến CSDL!");
        }
    }
    
}
