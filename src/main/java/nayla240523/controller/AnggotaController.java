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
import nayla240523.database.DatabaseHelper;
import nayla240523.view.FormAnggota;
import nayla240523.Dao.AnggotaDao;
import nayla240523.model.Anggota;
import nayla240523.Dao.AnggotaDaoImpl;

/**
 *
 * @author TUF Gaming
 */
public class AnggotaController {
    FormAnggota view;
    Anggota model;
    AnggotaDao dao;
    
    public AnggotaController(FormAnggota view) {
        this.view = view;
        try {
            dao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
        }catch (SQLException ex) {
        }
    }
    
    public void clearFrom(){
        view.getTxtNoBP().setText("");
        view.getTxtNama().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");
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
    
    public void saveAnggota() throws SQLException{
        model = new Anggota();
        model.setNoBp(view.getTxtNoBP().getText());
        model.setNama(view.getTxtNama().getText());
        model.setAlamat(view.getTxtAlamat().getText());
        model.setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.insert(model);
        JOptionPane.showMessageDialog(view, "Insert OK");
    }
    
    public void update() throws SQLException{
        model = new Anggota();
        model.setNoBp(view.getTxtNoBP().getText());
        model.setNama(view.getTxtNama().getText());
        model.setAlamat(view.getTxtAlamat().getText());
        model.setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.update(model);
        JOptionPane.showMessageDialog(view, "Update OK");
    }
    
    public void getAnggota() {
        view.getTxtNoBP().setEditable(false);
        view.getBtnInsert().setEnabled(false);
        view.getBtnUpdate().setEnabled(true);
        view.getBtnDelete().setEnabled(true);
        try {
            String nobp = view.getTblAnggota().getValueAt(view.getTblAnggota().getSelectedRow(), 0).toString();
            model = dao.getAnggota(nobp);
            if(model != null){
                view.getTxtNoBP().setText(model.getNoBp());
                view.getTxtNama().setText(model.getNama());
                view.getTxtAlamat().setText(model.getAlamat());
                view.getCboJenisKelamin().setSelectedItem(model.getJenisKelamin());
            }
        } catch (SQLException ex ){
        }
    }
       
    public void tampilTabel(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel) view.getTblAnggota().getModel();
            tabelModel.setRowCount(0);
            List<Anggota> list = dao.getAll();
            for (Anggota anggota1 : list){
                Object[] row = {
                    anggota1.getNoBp(),
                    anggota1.getNama(),
                    anggota1.getAlamat(),
                    anggota1.getJenisKelamin()
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void delete() throws SQLException{
         String nobp = view.getTxtNoBP().getText().toString();
         dao.delete(nobp);
         JOptionPane.showMessageDialog(view, "Delete OK");
     }
    
}
