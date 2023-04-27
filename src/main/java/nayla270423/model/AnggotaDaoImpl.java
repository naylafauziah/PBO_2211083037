/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla270423.model;
import java.util.*;
import java.util.List;

/**
 *
 * @author TUF Gaming
 */
public class AnggotaDaoImpl implements AnggotaDao {
    
    List<Anggota> data = new ArrayList();
    
    public void save(Anggota anggota){
        data.add(anggota);
    }
    
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return null;
    }
    
    public List<Anggota> getAllAnggota(){
        return null;
    }
}
