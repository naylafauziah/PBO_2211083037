/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla240523.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nayla240523.Dao.BukuDao;
import nayla240523.Dao.BukuDaoImpl;
import nayla240523.database.DatabaseHelperBuku;
import nayla240523.model.Buku;
import nayla240523.view.FormBuku;

/**
 *
 * @author TUF Gaming
 */
public class BukuController {
    FormBuku view;
    Buku model;
    BukuDao dao;
    
    public BukuController(FormBuku view) {
        this.view = view;
        try {
            dao = new BukuDaoImpl(DatabaseHelperBuku.getConnection());
        }catch (SQLException ex) {
        }
    }
    
    public void clearForm(){
        view.getTxtKodeBuku().setText(" ");
        view.getTxtJudulBuku().setText(" ");
        view.getTxtPengarang().setText(" ");
        view.getTxtPenerbit().setText(" ");
    }
    
    /*
    public void insert() throws SQLException{
        try{
            anggota = new Anggota();
            anggota = setNoBp(view.getTxtNoBP().getText());
            anggota = setNama(view.getTxtNama().getText());
            anggota = setAlamat(view.getTxtAlamat().getText());
            anggota = setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
            dao.insert(anggota);
            JOptionPane.showMessageDialog(view, "Entri data Ok");
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
        
    }
*/
    
    public void saveBuku() throws SQLException{
        model = new Buku();
        model.setKodeBuku(view.getTxtKodeBuku().getText());
        model.setJudulBuku(view.getTxtJudulBuku().getText());
        model.setPengarang(view.getTxtPengarang().getText());
        model.setPenerbit(view.getTxtPenerbit().getText());
        dao.insert(model);
        JOptionPane.showMessageDialog(view, "Insert OK");
    }
    
    public void update() throws SQLException{
        model = new Buku();
        model.setKodeBuku(view.getTxtKodeBuku().getText());
        model.setJudulBuku(view.getTxtJudulBuku().getText());
        model.setPengarang(view.getTxtPengarang().getText());
        model.setPenerbit(view.getTxtPenerbit().getText());
        dao.update(model);
        JOptionPane.showMessageDialog(view, "Update OK");
    }
    
    public void getBuku() {
        view.getTxtKodeBuku().setEditable(false);
        view.getBtnInsert().setEnabled(false);
        view.getBtnUpdate().setEnabled(true);
        view.getBtnDelete().setEnabled(true);
        try {
            String nobp = view.getTblBuku().getValueAt(view.getTblBuku().getSelectedRow(), 0).toString();
            model = dao.getBuku(nobp);
            if(model != null){
                view.getTxtKodeBuku().setText(model.getKodeBuku());
                view.getTxtJudulBuku().setText(model.getJudulBuku());
                view.getTxtPengarang().setText(model.getPengarang());
                view.getTxtPenerbit().setText(model.getPenerbit());
            }
        } catch (SQLException ex ){
        }
    }
       
    public void tampilTabel(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) view.getTblBuku().getModel();
            tabelModel.setRowCount(0);
            List<Buku> list = dao.getAll();
            for (Buku buku1 : list){
                Object[] row = {
                    buku1.getKodeBuku(),
                    buku1.getJudulBuku(),
                    buku1.getPengarang(),
                    buku1.getPenerbit()
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void delete() throws SQLException{
         String judulBuku = view.getTxtJudulBuku().getText().toString();
         dao.delete(judulBuku);
         JOptionPane.showMessageDialog(view, "Delete OK");
     }
}
