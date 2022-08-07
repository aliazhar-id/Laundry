package laundrypbo.apps.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import laundrypbo.apps.database.KonekDB;
import laundrypbo.apps.view.AboutView;
import laundrypbo.apps.view.LoginView;
import laundrypbo.apps.view.AddView;
import laundrypbo.apps.view.LaundryMainView;

/*
 *
 * @author aliazhar
 */
public class LaundryModel {

    private String username, password;
    Connection koneksi;

    public LaundryModel() {
        koneksi = KonekDB.getKoneksi("localhost", "3306", "root", "", "laundry");
        this.setUsername("admin");
        this.setPassword("admin123");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(LoginView view) {
        LaundryMainView mainWindow = new LaundryMainView();

        view.dispose();
        mainWindow.setVisible(true);
        mainWindow.showData();
    }

    public void saveAdd(AddView addView) throws ParseException {
        String username_baru = addView.getTxtAddNama().getText();
        int berat = Integer.parseInt(addView.getTxtAddBerat().getText());
        int harga = 0;
        int lyn = addView.getComboAddLayanan().getSelectedIndex();
        String layanan = "test";
        String tgl_masuk = addView.getTxtAddTglMasuk().getText();
        String tgl_keluar = "11/11/11";
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal  = Calendar.getInstance();
        
        cal.setTime(sdf.parse(tgl_masuk));
        
        if(lyn == 0){
            layanan = "reguler";
            harga = berat * 6000;
            cal.add(Calendar.DATE, 3);
            tgl_keluar = sdf.format(cal.getTime());  
        } else if(lyn == 1){
            layanan = "kilat"; 
            harga = berat * 8000;
            cal.add(Calendar.DATE, 1);
            tgl_keluar = sdf.format(cal.getTime());}
          
        // int harga = Integer.parseInt(addView.gettxt.getText());
        System.out.println("Save Berhasil Ditekan, tapi belum ke database!");
        try {
            Statement stmt = koneksi.createStatement();
            String query = "INSERT INTO laundry(nama_customer, harga, jenis_layanan, berat, tanggal_masuk, tanggal_keluar)"
                    + "VALUES('" + username_baru + "', '" + harga + "', '" + layanan + "', '" + berat + "', '" + tgl_masuk + "', '" + tgl_keluar + "')";
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            if (berhasil == 1) {
                JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan");
            } else {
                JOptionPane.showMessageDialog(null, "Data Gagal dimasukkan");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi KEsalahn pada database");
        }
    }

    public void about(LaundryMainView view) {
        AboutView mainWindow = new AboutView();

        view.dispose();
        mainWindow.setVisible(true);
    }
}
