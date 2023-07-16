/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla240523.controller;

import java.awt.HeadlessException;
import java.sql.SQLException;
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
import nayla240523.database.DatabaseHelper;
import nayla240523.model.Peminjaman;
import nayla240523.view.FormPeminjaman;
import nayla240523.model.Anggota;
import nayla240523.model.Buku;


/**
 *
 * @author TUF Gaming
 */
public class PeminjamanController {
    FormPeminjaman formPeminjaman;
    Peminjaman peminjaman;
    PeminjamanDao peminjamanDao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        try {
            this.formPeminjaman = formPeminjaman;
            peminjamanDao = new PeminjamanDaoImpl(DatabaseHelper.getConnection());
            anggotaDao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
            bukuDao = new BukuDaoImpl(DatabaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        formPeminjaman.getTxtTglPinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void isiComboAnggota(){
        try {
            formPeminjaman.getCboNobp().removeAllItems();
            List<Anggota> list = anggotaDao.getAll();
            for (Anggota anggota : list) {
                formPeminjaman.getCboNobp().addItem(anggota.getNoBp() + "-" + anggota.getNama());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiComboBuku(){
        try {
            formPeminjaman.getCboKodebuku().removeAllItems();
            List<Buku> list = bukuDao.getAll();
            for (Buku buku : list){
                formPeminjaman.getCboKodebuku().addItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(){
        try {
            peminjaman = new Peminjaman();
            peminjaman.setNobp(formPeminjaman.getCboNobp().getSelectedItem().toString().split("-")[0]);
            peminjaman.setKodeBuku(formPeminjaman.getCboKodebuku().getSelectedItem().toString().split("-")[0]);
            peminjaman.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
            peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
            peminjamanDao.insert(peminjaman);
            JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPeminjaman, ex.getMessage());
        }
    }
    
    public void getPeminjaman(){
        try {
            String nobp = formPeminjaman.getTblPeminjaman().getValueAt(formPeminjaman.getTblPeminjaman().getSelectedRow(), 0).toString();
            String kodebuku = formPeminjaman.getTblPeminjaman().getValueAt(formPeminjaman.getTblPeminjaman().getSelectedRow(), 2).toString();
            String tglpinjam = formPeminjaman.getTblPeminjaman().getValueAt(formPeminjaman.getTblPeminjaman().getSelectedRow(), 4).toString();
            
            peminjaman = peminjamanDao.getPeminjaman(nobp, kodebuku, tglpinjam);
            Anggota anggota = anggotaDao.getAnggota(peminjaman.getNobp());
            formPeminjaman.getCboNobp().setSelectedItem(anggota.getNoBp()+"-"+anggota.getNama());
            Buku buku = bukuDao.getBuku(peminjaman.getKodeBuku());
            formPeminjaman.getCboKodebuku().setSelectedItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
            formPeminjaman.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglKembali());
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampilTable(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
            tabelModel.setRowCount(0);
            List<Peminjaman> list = peminjamanDao.getAll();
            for (Peminjaman p : list) {
                Anggota anggota = anggotaDao.getAnggota(p.getNobp());
                Buku buku =  bukuDao.getBuku(p.getKodeBuku());
                Object[] row = {
                    p.getNobp(),
                    anggota.getNama(),
                    p.getKodeBuku(),
                    buku.getJudulBuku(),
                    p.getTglPinjam(),
                    p.getTglKembali()
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
          peminjamanDao.delete(peminjaman);
          JOptionPane.showMessageDialog(formPeminjaman, "Delete data ok");  
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(formPeminjaman, ex.getMessage());
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update() throws SQLException{
        try {
            peminjaman = new Peminjaman();
            peminjaman.setNobp(formPeminjaman.getCboNobp().getSelectedItem().toString().split("-")[0]);
            peminjaman.setKodeBuku(formPeminjaman.getCboKodebuku().getSelectedItem().toString().split("-")[0]);
            peminjaman.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
            peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
            peminjamanDao.update(peminjaman);
            JOptionPane.showMessageDialog(formPeminjaman, "Update Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPeminjaman, ex.getMessage());
        }
    }
}
