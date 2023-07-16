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
import nayla240523.model.Peminjaman;
import java.sql.*;
import java.util.*;

/**
 *
 * @author TUF Gaming
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    Connection connection;
    public PeminjamanDaoImpl(Connection connection){
        this.connection = connection;
    }

    @Override
    public void insert(Peminjaman peminjaman) throws SQLException {
        String sql = "Insert into peminjaman(tglkembali, nobp, kodebuku, tglpinjam) values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getTglKembali());
        ps.setString(2, peminjaman.getNobp());
        ps.setString(3, peminjaman.getKodeBuku());
        ps.setString(4, peminjaman.getTglPinjam());
        ps.executeUpdate();
    }

    @Override
    public void update(Peminjaman peminjaman) throws SQLException {
        String sql="update peminjaman set tglkembali=?"
                    +"where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getTglKembali());
        ps.setString(2, peminjaman.getNobp());
        ps.setString(3, peminjaman.getKodeBuku());
        ps.setString(4, peminjaman.getTglPinjam());
        ps.executeUpdate();                                                                                                                                                                                        
    }

    @Override
    public void delete(Peminjaman peminjaman) throws SQLException {
        String sql="delete from peminjaman "
                    +"where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.executeUpdate();
    }

    @Override
    public Peminjaman getPeminjaman(String nobp, String kodeBuku, String tglPinjam) throws SQLException {
        String sql="select * from peminjaman "
                    + " where nobp=? and kodebuku=? and tglpinjam=?" ;
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.setString(2, kodeBuku);
        ps.setString(3, tglPinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return peminjaman;
    }

    @Override
    public List<Peminjaman> getAll() throws SQLException {
        String sql="Select * from peminjaman ";
        PreparedStatement ps = connection.prepareStatement(sql);
        Peminjaman peminjaman = null;
        ResultSet rs = ps.executeQuery();
        List <Peminjaman> list = new ArrayList<>();
        while (rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    } 
}
