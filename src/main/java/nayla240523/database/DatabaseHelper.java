/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nayla240523.database;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nayla240523.Dao.AnggotaDaoImpl;
import nayla240523.Dao.AnggotaDao;
import nayla240523.model.Anggota;
import java.util.logging.Level;

/**
 *
 * @author TUF Gaming
 */
public class DatabaseHelper {
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException {
        if(connection == null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost/pbo_naylafauziah");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String[] args){
        try{
            connection = DatabaseHelper.getConnection();
            Anggota anggota = new Anggota();
            anggota.setNoBp("22337089");
            anggota.setNama("Nayla");
            anggota.setAlamat("Padang");
            anggota.setJenisKelamin("L");
            AnggotaDao dao = new AnggotaDaoImpl(connection);
            dao.insert(anggota);
            JOptionPane.showMessageDialog(null, "Entri OK");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
