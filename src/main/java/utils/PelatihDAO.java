package utils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.UUID;
import com.mycompany.maber.Pelatih;


/**
 *
 * @author yusuf haryo timur
 */
public class PelatihDAO {
    private static Connection con;
    private static PreparedStatement st;
    

    public static void registerPelatih(Pelatih p) {
        try {
            con = BaseDAO.getCon();
            String query = "INSERT INTO pelatih VALUES ('%s', '%s', '%s', '%s', '%s')";
            query = String.format(query,
                    p.getId(),
                    p.getNama(),
                    p.getEmail(),
                    p.getKeteranganKeahlian(),
                    p.getLulusan());
            st = con.prepareStatement(query);
            st.executeUpdate();
            
        } catch (SQLException ex) {
            System.err.print("Error saving the data: "
                    + ex.getMessage());
            System.exit(1);
        } finally {
            BaseDAO.closeCon(con);
        }
    }
}
