/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nayla240523.Dao;

import java.sql.SQLException;
import java.util.List;
import nayla240523.model.Pengembalian;

/**
 *
 * @author TUF Gaming
 */
public interface PengembalianDao {
    void insert(Pengembalian pengembalian) throws SQLException;
    void update(Pengembalian pengembalian) throws SQLException;
    void delete(Pengembalian pengembalian) throws SQLException;
    Pengembalian getPengembalian(String nobp, String kodebuku, String tglPinjam) throws SQLException;
    List<Pengembalian> getAll() throws SQLException;
    int selisihTanggal(String tgl1, String tgl2) throws SQLException;
}
