/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla240523.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author TUF Gaming
 */
public class Pengembalian {
    private String nobp;
    private String kodeBuku;
    private String tglPinjam;
    private String tglDikembalikan;
    private int terlambat;
    private double denda;

    
    public Pengembalian() {
    }
    
    public Pengembalian(String nobp, String kodeBuku, String tglPinjam, String tglDikembalikan, int terlambat,double denda ){
        this.nobp = nobp;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglDikembalikan = tglDikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
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

    public String getTglDikembalikan() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        tglDikembalikan = format.format(new Date());
        return tglDikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public double getDenda() {
        denda = terlambat * 1000;
        return denda;
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

    public void setTglDikembalikan(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }
}

    

