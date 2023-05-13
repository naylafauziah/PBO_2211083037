/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla270423.model;
import java.util.*;
/**
 *
 * @author TUF Gaming
 */
public class PeminjamanDaoImpl {
    List<Peminjaman> data = new ArrayList<>();
    public PeminjamanDaoImpl(){
        AnggotaDao daoAnggota = new AnggotaDaoImpl();
        BukuDao daoBuku = new BukuDaoImpl();
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"27-04-23","28-04-23"));
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"27-04-23","28-04-23"));
    }
    
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    
    public void update(int idx, Peminjaman peminjaman){
        data.set(idx,peminjaman);
    }
    
    public void delete(int idx){
        data.remove(idx);
    }
    
    public Peminjaman getPeminjaman(int idx){
        return data.get(idx);
    }
    
    public List<Peminjaman> getAllPeminjaman(){
        return data;
    }
}
