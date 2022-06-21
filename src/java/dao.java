
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phuong78
 */
public class dao {

    public static void main(String[] args) {
        String server = "PHUONG\\PHUONG07";
        String user = "sa";
        String password ="Phuong12345";
        String db = "DSAdmin";
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setServerName(server);
        ds.setPassword(password);
        ds.setPortNumber(1433);
        ds.setDatabaseName(password);
        ds.setDatabaseName(db);
        try (Connection conn = ds.getConnection()){
            System.out.println("ket noi thanh cong");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
