/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla240523.model;

/**
 *
 * @author TUF Gaming
 */
public class Peminjaman {
    private String nobp;
    private String kodeBuku;
    private String tglPinjam;
    private String tglKembali;
    
    public Peminjaman() {
    }
    
    public Peminjaman(String nobp, String kodeBuku, String tglPinjam, String tglKembali){
        this.nobp = nobp;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public String getNobp() {
        return nobp;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }
    
    
}
   
