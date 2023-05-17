/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nayla270423.model;

import java.util.List;

/**
 *
 * @author TUF Gaming
 */
public interface PeminjamanDao {
    void save(Peminjaman peminjaman);
    void update(int idx, Peminjaman peminjaman);
    void delete(int idx);
    Peminjaman getPeminjaman(int idx);
    public List<Peminjaman> getAllPeminjaman();
}
