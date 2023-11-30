package utils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.mycompany.maber.Pelatih;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author yusuf haryo timur
 */
public class URS {
    
    public static void main(String[] args) {
        Pelatih p1;
        
        p1 = new Pelatih("ucupaja123@email.com", "12345","20930031",
                "UCUP", "Information Technology", "S1-UPI");
        
        PelatihDAO.registerPelatih(p1);
         
         
        System.out.println("======================");
        System.out.println("Pelatih Information:");
        System.out.println("======================");
        System.out.println();
        p1.displayBiodata();
    }
    
}
