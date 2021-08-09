/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BaiKiemTra;
import Model.CT_SV_BKT;
import Model.CauHoi;
import Model.GiangVien;
import Model.Lop;
import Model.SinhVien;
import Model.TaiKhoan;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class ConnectToSQLServer {
    static Connection connection = null;
    
    public static Connection ketNoiCSDL() {
        try{
            var server = "MYLAPTOP";
            var user = "sa";
            var password = "123456";
            var db = "PHANMEMTRACNGHIEM";
            var port = 1433;
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser(user);
            ds.setPassword(password);
            ds.setDatabaseName(db);
            ds.setServerName(server);
            ds.setPortNumber(port);
            
            connection = ds.getConnection();
            System.out.println("Ket noi thanh cong voi sql server");
            System.out.println(connection.getCatalog());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static ArrayList<TaiKhoan> layData_BangTaiKhoan(String sql)  {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<TaiKhoan> danhSachTaiKhoan = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan temp = new TaiKhoan(rs.getString("TenDangNhap"), 
                        rs.getString("MatKhau"), rs.getString("LoaiTaiKhoan"));
                System.out.println(temp);
                danhSachTaiKhoan.add(temp);
            }                                
        } 
        catch (Exception ex) {           
            System.out.println("Loi lay du lieu "+ ex.toString());
            return null;
        }
        return danhSachTaiKhoan;
    }
    
    public static ArrayList<Lop> layData_BangLop(String sql)  {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<Lop> danhSachLop = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan();
                GiangVien giangVien = new GiangVien(rs.getString("MaGV"), rs.getString("TenGV"), taiKhoan);
                Lop temp = new Lop(rs.getString("MaLop"), rs.getString("TenLop"), giangVien, rs.getInt("SoSV"));
                danhSachLop.add(temp);
            }                                
        } 
        catch (Exception ex) {           
            System.out.println("Loi lay du lieu "+ ex.toString());
            return null;
        }
        return danhSachLop;
    }
    
    public static ArrayList<GiangVien> layData_BangGiangVien(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenDangNhap(rs.getString("TenDangNhap"));
                GiangVien temp = new GiangVien(rs.getString("MaGV"), rs.getString("TenGV"), taiKhoan);
                danhSachGiangVien.add(temp);
            }                                
        } 
        catch (Exception ex) {           
            System.out.println("Loi lay du lieu "+ ex.toString());
            return null;
        }
        return danhSachGiangVien;
    }
    
    public static ArrayList<SinhVien> layData_BangSinhVien(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenDangNhap(rs.getString("TenDangNhap"));
                GiangVien giangVien = new GiangVien();
                Lop lop = new Lop(rs.getString("MaLop"), rs.getString("TenLop"), giangVien, rs.getInt("SoSV"));
                SinhVien temp = new SinhVien(rs.getString("MaSV"), rs.getString("TenSV"), lop, taiKhoan);
                danhSachSinhVien.add(temp);
            }                                
        } 
        catch (Exception ex) {           
            System.out.println("Loi lay du lieu "+ ex.toString());
            return null;
        }
        return danhSachSinhVien;
    }

    public static ArrayList<BaiKiemTra> layData_BangBaiKiemTra(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<BaiKiemTra> danhSachBaiKiemTra = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Lop lop = new Lop();
                lop.setTenLop(rs.getString("TenLop"));
                
                BaiKiemTra temp = new BaiKiemTra(rs.getString("MaBKT"), rs.getString("TenBKT"), lop, 
                        rs.getString("DoKho"), rs.getInt("ThoiGianLam"), rs.getString("HanNop"), rs.getInt("TongSoCau"));
                danhSachBaiKiemTra.add(temp);
            }                             
        } 
        catch (Exception ex) {           
            System.out.println("Loi lay du lieu "+ ex.toString());
            return null;
        }
        return danhSachBaiKiemTra;
    }
    
    public static ArrayList<CT_SV_BKT> layData_BangCT_SV_BKT(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<CT_SV_BKT> result = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            //do du lieu ra danhSachBaiKiemTra
            while (rs.next()) {
                SinhVien sinhVien = new SinhVien();
                sinhVien.setMaSV(rs.getString("MaSV"));
                sinhVien.setTenSV(rs.getString("TenSV"));
                
                BaiKiemTra baiKiemTra = new BaiKiemTra();
                baiKiemTra.setMaBKT(rs.getString("MaBKT"));
                baiKiemTra.setTenBKT(rs.getString("TenBKT"));
                baiKiemTra.setHanNop(rs.getString("HanNop"));
                baiKiemTra.setThoiGianLam(rs.getInt("ThoiGianLam"));

                CT_SV_BKT temp = new CT_SV_BKT(sinhVien, baiKiemTra, rs.getFloat("Diem"), 
                        rs.getInt("SoCauDung"), rs.getInt("TongThoiGianLam"), rs.getString("TrangThai"));
                result.add(temp);
            }
        } catch (SQLException ex) {
        }
        
        return result;
    }
    
    public static ArrayList<CauHoi> layData_BangCauHoi(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<CauHoi> result = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            //do du lieu ra danhSachBaiKiemTra
            while (rs.next()) {
                BaiKiemTra baiKiemTra = new BaiKiemTra();
                baiKiemTra.setMaBKT(rs.getString("MaBKT"));
                baiKiemTra.setTenBKT(rs.getString("TenBKT"));
                baiKiemTra.setThoiGianLam(rs.getInt("ThoiGianLam"));
                baiKiemTra.setTongSoCauHoi(rs.getInt("TongSoCau"));

                CauHoi temp = new CauHoi(rs.getInt("MaCH"), baiKiemTra, rs.getString("NoiDung"), 
                        rs.getString("A"), rs.getString("B"), rs.getString("C"), rs.getString("D"), 
                        rs.getString("DapAn"), rs.getString("DoKho"));
                result.add(temp);
            }
        } catch (SQLException ex) {
        }
        
        return result;
    }
    
    public static ArrayList<CauHoi> layData_BangCauHoi_KhoDe(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<CauHoi> result = new ArrayList<>();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            //do du lieu ra danhSachBaiKiemTra
            while (rs.next()) {
                CauHoi temp = new CauHoi(rs.getInt("MaCH"), null, rs.getString("NoiDung"), 
                        rs.getString("A"), rs.getString("B"), rs.getString("C"), rs.getString("D"), 
                        rs.getString("DapAn"), rs.getString("DoKho"));
                result.add(temp);
            }
        } catch (SQLException ex) {
        }
        
        return result;
    }
    
    
    
    //////////////////////
    public boolean xoaCauHoi(int id){
        String sql0 = "DELETE CauHoi WHERE id=?";
        try{
            PreparedStatement ps0 =connection.prepareStatement(sql0);
            ps0.setInt(1, id);
            ps0.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean updateCauHoi(CauHoi c, String id){
        String sql = "UPDATE CauHoi set DoKho=?, NoiDung=?, A=?, B=?, C=?, D=?, DapAn=?  WHERE maCH=?";    
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, c.getDoKho());
            ps.setString(2, c.getNoiDung());
            ps.setString(3, c.getA());
            ps.setString(4, c.getB());
            ps.setString(5, c.getC());
            ps.setString(6, c.getD());
            ps.setString(7, c.getDapAn());
            ps.setString(8, id);
            return ps.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean addCauHoi(CauHoi c){
        String sql = "INSERT INTO CauHoi(MaCH, DoKho, NoiDung, A, B, C, D, DapAn)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, c.getMaCH());
            ps.setString(2, c.getDoKho());
            ps.setString(3, c.getNoiDung());
            ps.setString(4, c.getA());
            ps.setString(5, c.getB());
            ps.setString(6, c.getC());
            ps.setString(7, c.getD());
            ps.setString(8, c.getDapAn());
            return ps.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
//    public ArrayList<CauHoi> getCauHoi(){
//        ArrayList<CauHoi> list = new LinkedList<>();
//        String sql = "SELECT * FROM CauHoi";
//        
//        try{
//            PreparedStatement ps =connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                CauHoi c = new CauHoi();
//                c.setMaCH(rs.getString("MaCH"));
//                c.setDoKho(rs.getString("DoKho"));
//                c.setNoiDung(rs.getString("NoiDung"));
//                c.setA(rs.getString("A"));
//                c.setB(rs.getString("B"));
//                c.setC(rs.getString("C"));
//                c.setD(rs.getString("D"));
//                c.setDapAn(rs.getString("DapAn"));
//                
//                list.add(c);
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//        return list;
//    }
//    
//    public boolean addBKT(BaiKiemTra c){
//        String sql = "INSERT INTO BKT(maBKT,tenBKT,doKho,tgLam,hanNop,soCau)"
//                + "VALUES(?,?,?,?,?,?)";
//        try{
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, c.getMaBKT());
//            ps.setString(2, c.getTenBKT());
//            ps.setString(3, c.getDoKhoBKT());
//            ps.setString(4, c.getTGLam());
//            ps.setString(5, c.getHanNop());
//            ps.setInt(6, c.getSoCau());
//            return ps.executeUpdate() > 0;
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return false;
//    }
//    
//    public ArrayList<BaiKiemTra> getBKT(){
//        ArrayList<BaiKiemTra> list = new ArrayList<>();
//        String sql = "SELECT * FROM BKT";
//        
//        try{
//            PreparedStatement ps =conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                BaiKiemTra c = new BaiKiemTra();
//                c.setMaBKT(rs.getString("maBKT"));
//                c.setTenBKT(rs.getString("tenBKT"));
//                c.setDoKhoBKT(rs.getString("doKho"));
//                c.setTGLam(rs.getString("tgLam"));
//                c.setHanNop(rs.getString("hanNop"));
//                c.setSoCau(rs.getInt("soCau"));              
//                list.add(c);
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//        return list;
//    }
   
    public static boolean thucHienLenhSQL(String sql)  {
        ConnectToSQLServer.ketNoiCSDL();
        try {
            Statement stm = connection.createStatement();
            stm.execute(sql);
            return true;
        } 
        catch (Exception ex) {
            System.out.println("Khong thuc hien duoc cau lẹnh SQL: "+sql);
            return false;
        }
    }

    
}
