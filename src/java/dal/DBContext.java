package dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Phuong78
 */
public class DBContext {

    protected Connection connection;

    public DBContext() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DSAdmin";
            String username = "sa";
            String password = "Phuong12345";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//viết sai thiếu r ở server đã sửa lại
//            System.out.println("1");
            connection = DriverManager.getConnection(url, username, password);
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }

//    public static void main(String[] args) {
//        DBContext k = new DBContext();
//        System.out.println(k);
//    }

}