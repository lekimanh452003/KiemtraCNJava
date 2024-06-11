/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlnsx_lekimanh;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author fptshop
 */
public class testKN {
     public static void main(String[] args) throws SQLException {
        Connection kn= KN.KNCSDL();
        if(kn==null){
            System.out.println("Không thể kết nối đến CSDL");
        }else{
            System.out.println("Bạn đã kết nối thành công đến CSDL!");
        }
    }
}
