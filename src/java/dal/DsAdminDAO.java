package dal;

import java.util.ArrayList;
import java.util.List;
import model.category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class DsAdminDAO extends DBContext {

    //doc tat ca du lieu tu ban category
    public List<category> getAll() {
        List<category> list = new ArrayList<>();
        String sql = "select * from [dbo].[tblSanpham2]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                category c = new category(rs.getInt("idSanPham"), rs.getString("tenSP"), rs.getString("hang"),
                        rs.getInt("pin"), rs.getInt("ram"), rs.getInt("rom"), rs.getString("CPU"),
                        rs.getString("KTmanHinh"), rs.getString("cameraTruoc"), rs.getString("cameraSau"), rs.getString("gia"),
                        rs.getString("linkAnh"), rs.getString("moTa"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void insert(category c) {
        String sql = "INSERT INTO [dbo].[tblSanpham2]\n"
                + "           ([tenSP]\n"
                + "           ,[hang]\n"
                + "           ,[pin]\n"
                + "           ,[ram]\n"
                + "           ,[rom]\n"
                + "           ,[CPU]\n"
                + "           ,[KTmanHinh]\n"
                + "           ,[cameraTruoc]\n"
                + "           ,[cameraSau]\n"
                + "           ,[gia]\n"
                + "           ,[linkAnh]\n"
                + "           ,[moTa])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, c.getTenSP());
//            st.setInt(2, c.getIdSanPham());
            st.setString(2, c.getHang());
            st.setInt(3, c.getPin());
            st.setInt(4, c.getRam());
            st.setInt(5, c.getRom());
            st.setString(6, c.getCPU());
            st.setString(7, c.getKTmanhinh());
            st.setString(8, c.getCameraTruoc());
            st.setString(9, c.getCameraSau());
            st.setString(10, c.getGia());
            st.setString(11, c.getLinkAnh());
            st.setString(12, c.getMoTa());
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public category getCategoryById(int idSanPham) {
        String sql = "select * from [dbo].[tblSanpham2] where idSanPham=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, idSanPham);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                category c = new category(rs.getInt("idSanPham"), rs.getString("tenSP"), rs.getString("hang"),
                        rs.getInt("pin"), rs.getInt("ram"), rs.getInt("rom"), rs.getString("CPU"),
                        rs.getString("KTmanHinh"), rs.getString("cameraTruoc"), rs.getString("cameraSau"), rs.getString("gia"),
                        rs.getString("linkAnh"), rs.getString("moTa"));
                return c;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void delete(int idSanPham) {
        String sql = "DELETE FROM [dbo].[tblSanpham2]\n"
                + "      WHERE idSanPham =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, idSanPham);
            st.executeUpdate();
        } catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        DsAdminDAO c = new DsAdminDAO();
        List<category> list = c.getAll();
        for (category i : list) {
            System.out.println(i.getTenSP());
        }
//        System.out.println(list.get(0).getTenSP());
    }

    
}
