/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import UTS_B.model.Pesanan;
import UTS_B.model.PesananDao;
import UTS_B.model.PesananDaoImpl;
import UTS_B.view.PesananForm;

/**
 *
 * @author TUF Gaming
 */
public class PesananController {
    private PesananForm pesananForm;
    private Pesanan pesanan;
    private PesananDao pesananDao;
    
    public PesananController(PesananForm pesananForm){
        this.pesananForm = pesananForm;
        pesananDao = new PesananDaoImpl();
    }
    
    public void bersihForm(){
        pesananForm.getTxtKodePesanan().setText("");
        pesananForm.getTxtNamaPemesan().setText("");
        pesananForm.getTxtTanggalPesan().setText("");
        pesananForm.getTxtHarga().setText("");
        pesananForm.getTxtOngkosKirim().setText("");
        pesananForm.getTxtDiskon().setText("");
    }
    
    public void savePesanan(){
        pesanan = new Pesanan();
        pesanan.setKodePesanan(pesananForm.getTxtKodePesanan().getText());
        pesanan.setNamaPemesan(pesananForm.getTxtNamaPemesan().getText());
        pesanan.setTanggalPesan(pesananForm.getTxtTanggalPesan().getText());
        pesanan.setHarga(pesananForm.getTxtHarga().getText());
        pesanan.setOngkosKirim(pesananForm.getTxtOngkosKirim().getText());
        pesanan.setDiskon(pesananForm.getTxtDiskon().getText());
        pesananDao.save(pesanan);
        JOptionPane.showMessageDialog(pesananForm, "Insert Ok");
    }
    
    public void updatePesanan(){
        int index = pesananForm.getTblPesanan().getSelectedRow();
        pesanan.setKodePesanan(pesananForm.getTxtKodePesanan().getText());
        pesanan.setNamaPemesan(pesananForm.getTxtNamaPemesan().getText());
        pesanan.setTanggalPesan(pesananForm.getTxtTanggalPesan().getText());
        pesanan.setHarga(pesananForm.getTxtHarga().getText());
        pesanan.setOngkosKirim(pesananForm.getTxtOngkosKirim().getText());
        pesanan.setDiskon(pesananForm.getTxtDiskon().getText());
        pesananDao.update(index, pesanan);
        JOptionPane.showMessageDialog(pesananForm, "Update Ok");
    }
    
    public void delete(){
        int index = pesananForm.getTblPesanan().getSelectedRow();
        pesananDao.delete(index);
        JOptionPane.showMessageDialog(pesananForm, "Delete Ok");
    }
    
    public void getPesanan(){
        int index = pesananForm.getTblPesanan().getSelectedRow();
        pesanan = pesananDao.getPesanan(index);
        if(pesanan!=null){
            pesananForm.getTxtKodePesanan().setText(pesanan.getKodePesanan());
            pesananForm.getTxtNamaPemesan().setText(pesanan.getNamaPemesan());
            pesananForm.getTxtTanggalPesan().setText(pesanan.getTanggalPesan());
            pesananForm.getTxtHarga().setText(pesanan.getHarga());
            pesananForm.getTxtOngkosKirim().setText(pesanan.getOngkosKirim());
            pesananForm.getTxtDiskon().setText(pesanan.getDiskon());
        }
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) pesananForm.getTblPesanan().getModel();
        tabelModel.setRowCount(0);
        List<Pesanan> list = pesananDao.getAllPesanan();
        for (Pesanan pesanan1 : list){
            Object row[] = {
                pesanan1.getKodePesanan(),
                pesanan1.getNamaPemesan(),
                pesanan1.getTanggalPesan(),
                pesanan1.getHarga(),
                pesanan1.getOngkosKirim(),
                pesanan1.getDiskon()        
            };
            tabelModel.addRow(row);
        }
    }
}
