/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nayla270423.view;

/**
 *
 * @author TUF Gaming
 */
public class Buku extends javax.swing.JFrame {

    /**
     * Creates new form Buku
     */
    public Buku() {
        initComponents();
    }
    
    public javax.swing.JTextField getTxtKodeBuku(){
        return txtKodeBuku;
    }
    
    public javax.swing.JTextField getTxtJudulBuku(){
        return txtJudulBuku;
    }
    
    public javax.swing.JTextField getTxtPengarang(){
        return txtPengarang;
    }
    
    public javax.swing.JTextField getTxtPenerbit(){
        return txtPenerbit;
    }
    
    public javax.swing.JTable getTblBuku(){
        return tblBuku;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKodeBuku = new javax.swing.JTextField();
        txtJudulBuku = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Buku");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 80, 18);

        jLabel2.setText("Judul Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 90, 18);

        jLabel3.setText("Pengarang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 70, 18);

        jLabel4.setText("Penerbit");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 60, 18);

        jLabel5.setText("Tahun");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 34, 18);

        txtKodeBuku.setText("jTextField1");
        getContentPane().add(txtKodeBuku);
        txtKodeBuku.setBounds(180, 20, 390, 24);

        txtJudulBuku.setText("jTextField2");
        getContentPane().add(txtJudulBuku);
        txtJudulBuku.setBounds(180, 50, 390, 24);

        txtPengarang.setText("jTextField3");
        getContentPane().add(txtPengarang);
        txtPengarang.setBounds(180, 80, 390, 24);

        txtPenerbit.setText("jTextField4");
        getContentPane().add(txtPenerbit);
        txtPenerbit.setBounds(180, 110, 390, 24);

        txtTahun.setText("jTextField5");
        getContentPane().add(txtTahun);
        txtTahun.setBounds(180, 140, 390, 24);

        btnInsert.setText("Insert");
        getContentPane().add(btnInsert);
        btnInsert.setBounds(60, 200, 72, 24);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(190, 200, 72, 24);

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(330, 200, 72, 24);

        btnCancel.setText("Cancel");
        getContentPane().add(btnCancel);
        btnCancel.setBounds(460, 200, 72, 24);

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Pengarang", "Penerbit", "Tahun"
            }
        ));
        jScrollPane1.setViewportView(tblBuku);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 560, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}