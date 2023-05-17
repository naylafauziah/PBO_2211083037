/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.model;

/**
 *
 * @author TUF Gaming
 */
public class Pesanan {
    private String kodePesanan;
    private String namaPemesan;
    private String tanggalPesan;
    private String harga;
    private String ongkosKirim;
    private String diskon;
    
    public Pesanan(){
        
    }
    
    public Pesanan(String kodePesanan, String namaPemesan, String tanggalPesan, String harga, String ongkosKirim, String diskon){
        this.kodePesanan = kodePesanan;
        this.namaPemesan = namaPemesan;
        this.tanggalPesan = tanggalPesan;
        this.harga = harga;
        this.ongkosKirim = ongkosKirim;
        this.diskon = diskon;
    }
    
    public String getKodePesanan(){
        return kodePesanan;
    }
    
    public void setKodePesanan(String kodePesanan){
        this.kodePesanan = kodePesanan;
    }
    
    public String getNamaPemesan(){
        return namaPemesan;
    }
    
    public void setNamaPemesan(String namaPemesan){
        this.namaPemesan = namaPemesan;
    }
    
    public String getTanggalPesan(){
        return tanggalPesan;
    }
    
    public void setTanggalPesan(String tanggalPesan){
        this.tanggalPesan = tanggalPesan;
    }
    
    public String getHarga(){
        return harga;
    }
    
    public void setHarga(String harga){
        this.harga = harga;
    }
    
    public String getOngkosKirim(){
        return ongkosKirim;
    }
    
    public void setOngkosKirim(String ongkosKirim){
        this.ongkosKirim = ongkosKirim;
    }
    
    public String getDiskon(){
        return diskon;
    }
    
    public void setDiskon(String diskon){
        this.diskon = diskon;
    }
}
