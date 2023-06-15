/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nayla240523.Dao;

import java.sql.SQLException;
import java.util.List;
import nayla240523.model.Peminjaman;

/**
 *
 * @author TUF Gaming
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(Peminjaman peminjaman) throws SQLException;
    Peminjaman getPeminjaman(String nobp, String kodebuku, String tglpinjam) throws SQLException;
    List<Peminjaman> getAll() throws SQLException;
}
