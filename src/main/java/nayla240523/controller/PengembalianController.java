/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla240523.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nayla240523.Dao.AnggotaDao;
import nayla240523.Dao.AnggotaDaoImpl;
import nayla240523.Dao.BukuDao;
import nayla240523.Dao.BukuDaoImpl;
import nayla240523.Dao.PeminjamanDao;
import nayla240523.Dao.PeminjamanDaoImpl;
import nayla240523.Dao.PengembalianDao;
import nayla240523.Dao.PengembalianDaoImpl;
import nayla240523.database.DatabaseHelper;
import nayla240523.model.Anggota;
import nayla240523.model.Buku;
import nayla240523.model.Peminjaman;
import nayla240523.model.Pengembalian;
import nayla240523.view.FormPengembalian;

/**
 *
 * @author TUF Gaming
 */
public class PengembalianController {
    FormPengembalian formPengembalian;
    PengembalianDao pengembalianDao;
    PeminjamanDao peminjamanDao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    Connection connection;
    Pengembalian pengembalian;
    
    public PengembalianController(FormPengembalian formPengembalian){
        try {
            this.formPengembalian = formPengembalian;
            connection = DatabaseHelper.getConnection();
            pengembalianDao = new PengembalianDaoImpl(connection);
            peminjamanDao = new PeminjamanDaoImpl(connection);
            anggotaDao = new AnggotaDaoImpl(connection);
            bukuDao = new BukuDaoImpl(connection);
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        formPengembalian.getTxtDenda().setText("");
        formPengembalian.getTxtTerlambat().setText("");
        formPengembalian.getTxtTglDikembalikan().setText("");
        formPengembalian.getTxtTglPinjam().setText("");
    }
    
    public void isiComboAnggota(){
        try {
            formPengembalian.getCboNobp().removeAllItems();
            List<Anggota> list = anggotaDao.getAll();
            for (Anggota anggota : list) {
                formPengembalian.getCboNobp()
                        .addItem(anggota.getNoBp()+ "-" + anggota.getNama());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiComboBuku(){
        try {
            formPengembalian.getCboKodeBuku().removeAllItems();
            List<Buku> list = bukuDao.getAll();
            for (Buku buku : list){
                formPengembalian.getCboKodeBuku()
                        .addItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(){
        try {
            pengembalian = new Pengembalian();
            pengembalian.setNobp(formPengembalian.getCboNobp()
                    .getSelectedItem().toString().split("-")[0]);
            pengembalian.setKodeBuku(formPengembalian.getCboKodeBuku()
                    .getSelectedItem().toString().split("-")[0]);
            pengembalian.setTglPinjam(formPengembalian.getTxtTglPinjam().getText());
            pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
            pengembalian.setTerlambat(Integer.parseInt(formPengembalian.getTxtTerlambat().getText()));
            pengembalian.setDenda(Double.parseDouble(formPengembalian.getTxtDenda().getText()));
            pengembalianDao.insert(pengembalian);
            JOptionPane.showMessageDialog(formPengembalian, "Pengembalian Ok");
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPengembalian(){
        try {
            pengembalian = new Pengembalian();
            String nobp = formPengembalian.getTblPengembalian().getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 0).toString();
            String kodebuku = formPengembalian.getTblPengembalian().getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 2).toString();
            String tglpinjam = formPengembalian.getTblPengembalian().getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 4).toString();
            
            Peminjaman peminjaman = peminjamanDao.getPeminjaman(nobp, kodebuku, tglpinjam);
            Anggota anggota = anggotaDao.getAnggota(peminjaman.getAnggota().getNobp());
            formPengembalian.getCboNobp().setSelectedItem(anggota.getNoBp()+"-"+anggota.getNama());
            Buku buku = bukuDao.getBuku(peminjaman.getBuku().getKodeBuku());
            formPengembalian.getCboKodeBuku().setSelectedItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
            formPengembalian.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            formPengembalian.getTxtTglDikembalikan().setText(pengembalian.getTglDikembalikan());
            int terlambat = pengembalianDao.selisihTanggal(pengembalian.getTglDikembalikan(),peminjaman.getTglKembali());
            pengembalian.setTerlambat(terlambat); 
            formPengembalian.getTxtTerlambat().setText(""+terlambat);
            formPengembalian.getTxtDenda().setText(""+pengembalian.getDenda());
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilTable(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) formPengembalian.getTblPengembalian().getModel();
            tabelModel.setRowCount(0);
            List<Pengembalian> list = pengembalianDao.getAll();
            for (Pengembalian p : list) {
                Anggota anggota = anggotaDao.getAnggota(p.getNobp());
                Buku buku =  bukuDao.getBuku(p.getKodeBuku());
                Peminjaman peminjaman = peminjamanDao.getPeminjaman(p.getNobp(),p.getKodeBuku(), p.getTglPinjam());
                Object[] row = {
                    anggota.getNoBp(),
                    anggota.getNama(),
                    buku.getKodeBuku(),
                    buku.getJudulBuku(),
                    p.getTglPinjam(),
                    peminjaman.getTglKembali(),
                    p.getTglDikembalikan(),
                    p.getTerlambat(),
                    p.getDenda()
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
          pengembalianDao.delete(pengembalian);
          JOptionPane.showMessageDialog(formPengembalian, "Delete data ok");  
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(formPengembalian, ex.getMessage());
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

