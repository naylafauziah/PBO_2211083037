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
public class BukuDaoImpl implements BukuDao {
    
    List<Buku> data = new ArrayList();
    
    public BukuDaoImpl(){
        data.add(new Buku("1001","matahari","Tereliye","L","2000"));
        data.add(new Buku("1002","pulang","Samudra","P","2002"));
    }
    
    public void save(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAllBuku(){
        return data;
    }
}
