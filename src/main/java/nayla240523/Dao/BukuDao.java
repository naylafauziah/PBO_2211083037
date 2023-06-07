/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nayla240523.Dao;

import java.sql.SQLException;
import java.util.List;
import nayla240523.model.Buku;

/**
 *
 * @author TUF Gaming
 */
public interface BukuDao {
    void insert(Buku buku) throws SQLException;
    void update(Buku buku) throws SQLException;
    void delete(String kodebuku) throws SQLException;
    Buku getBuku(String kodebuku) throws SQLException;
    List<Buku> getAll() throws SQLException;
}
