package utils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author yusuf haryo timur
 */
public class BaseDAO {
    protected static final String DB_NAME = "maber";
    protected static final String DB_HOST = "localhost";
    protected static final String DB_USER = "root";
    protected static final String DB_PASS = "QWERTYUI";
    static final String INSERT = "insert into ";
    static final String UPDATE = "update";
    static final String DELETE = "delete";
    static final String SELECT = "select ";
    private Connection conn;
    private Statement statement;
    private ResultSet resultSet;
    
    
    public static Connection getCon() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + DB_HOST + ":3306/" + DB_NAME, DB_USER, DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
     public BaseDAO(String usn, String database, String pass) {
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, usn, pass);
            System.out.println("konek cuy");
            statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void closeCon(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
