/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla240523.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.*;
import nayla240523.model.Pengembalian;
import nayla240523.Dao.*;

/**
 *
 * @author TUF Gaming
 */
public class PengembalianDaoImpl implements PengembalianDao {
    Connection connection;
    public PengembalianDaoImpl(Connection connection){
        this.connection = connection;
    }

    @Override
    public void insert(Pengembalian pengembalian) throws SQLException {
        String sql="insert into pengembalian values(?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getNobp());
        ps.setString(2, pengembalian.getKodeBuku());
        ps.setString(3, pengembalian.getTglPinjam());
        ps.setString(4, pengembalian.getTglDikembalikan());
        ps.setInt(5, pengembalian.getTerlambat());
        ps.setDouble(6, pengembalian.getDenda());
        ps.executeUpdate();
    }
    
    @Override
    public void update(Pengembalian pengembalian) throws SQLException {
        String sql="update pengembalian set tgldikembalikan=?, terlambat=?, denda=? "
                + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getTglDikembalikan());
        ps.setInt(2, pengembalian.getTerlambat());
        ps.setDouble(3, pengembalian.getTerlambat());
        ps.setString(4, pengembalian.getNobp());
        ps.setString(5, pengembalian.getKodeBuku());
        ps.setString(6, pengembalian.getTglPinjam());
        ps.executeUpdate();   
    }

    public void delete(Pengembalian pengembalian) throws SQLException {
        String sql = "Delete from pengembalian "+ "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getNobp());
        ps.setString(2, pengembalian.getKodeBuku());
        ps.setString(3, pengembalian.getTglPinjam());
        ps.executeUpdate();
    }

    public Pengembalian getPengembalian(String nobp, String kodebuku, String tglpinjam) throws SQLException {
        String sql = "select * from pengembalian " + "where nobp=? and kodenuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        Pengembalian pengembalian = null;
        if(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setNobp(rs.getString("nobp"));
            pengembalian.setKodeBuku(rs.getString("kodebuku"));
            pengembalian.setTglPinjam(rs.getString("tglpinjam"));
            pengembalian.setTglDikembalikan(rs.getString("tgldikembalikan"));
            pengembalian.setTerlambat(rs.getInt("terlambat"));
            pengembalian.setDenda(rs.getDouble("denda"));
        }
        return pengembalian;
    }

    @Override
    public List<Pengembalian> getAll() throws SQLException {
        String sql = "SELECT `anggota`.`nobp`, `anggota`.`nama`, buku.`kodebuku`,"
                    +"buku.`judulbuku`," +"`peminjaman`.`tglpinjam`, `peminjaman`.`tglkembali`, `pengembalian`.`tglkembali`," 
                    +"`pengembalian`.`terlambat`,`pengembalian`.`denda`" +  
                    "FROM `peminjaman` INNER JOIN `anggota` ON `peminjaman`.`nobp` = `anggota`.`nobp`" +
                    "INNER JOIN `buku` ON `peminjaman`.`kodebuku` = buku.`kodebuku`" +
                    "LEFT JOIN `pengembalian` ON (`peminjaman`.`nobp` = `pengembalian`.`nobp`" +
                    "AND `peminjaman`.`kodebuku`=`pengembalian`.`kodebuku`" +
                    "AND `peminjaman`.`tglpinjam`=`pengembalian`.`tglpinjam`) ";

        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Pengembalian pengembalian = null;
        List<Pengembalian> list = new ArrayList<>();
        while(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setNobp(rs.getString("nobp"));
            pengembalian.setKodeBuku(rs.getString("kodebuku"));
            pengembalian.setTglPinjam(rs.getString("tglPinjam"));
            pengembalian.setTglDikembalikan(rs.getString("tglDikembalikan"));
            pengembalian.setTerlambat(rs.getInt("terlambat"));
            pengembalian.setDenda(rs.getDouble("denda"));
            list.add(pengembalian);
        }
        return list;
    }

    @Override
    public int selisihTanggal(String tgl1, String tgl2) throws SQLException {
        int selisih = 0;
        String sql = "SELECT DATEDIFF(?, ?) AS selisih";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, tgl1);
        ps.setString(2, tgl2);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            selisih = rs.getInt(1);
        }
        return selisih;
    }
}
        

