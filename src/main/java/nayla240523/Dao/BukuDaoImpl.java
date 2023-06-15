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
import nayla240523.model.Buku;
import java.sql.*;
import java.util.*;

/**
 *
 * @author TUF Gaming
 */
public class BukuDaoImpl implements BukuDao {
    Connection connection;
    public BukuDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Buku buku) throws SQLException{
        String sql = "Insert into buku values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
    }
    
    public void update(Buku buku) throws SQLException{
        String sql = "Update buku set judulbuku = ?, pengarang = ?, penerbit = ? where kodebuku = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
    }
    
    public void delete(String kodebuku) throws SQLException{
        String sql = "Delete from buku where kodebuku = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodebuku);
        ps.executeUpdate();
    }
    
    public Buku getBuku(String kodebuku) throws SQLException{
        String sql = "select * from buku where kodebuku = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodebuku);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
        }
        return buku;
    }
    
    public List<Buku> getAll() throws SQLException{
        String sql = "select * from buku";
        PreparedStatement ps = connection.prepareStatement(sql);
        Buku buku = null;
        ResultSet rs = ps.executeQuery();
        List<Buku> list = new ArrayList<>();
        while(rs.next()){
            buku = new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            list.add(buku);
        }
        return list;
    }
}
