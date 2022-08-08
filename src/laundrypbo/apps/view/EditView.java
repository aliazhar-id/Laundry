/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrypbo.apps.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import laundrypbo.apps.controller.LaundryController;
import laundrypbo.apps.database.KonekDB;
import laundrypbo.apps.model.LaundryModel;

/**
 *
 * @author aliazhar
 */
public class EditView extends javax.swing.JFrame {

    /**
     * Creates new form editView
     */
    
    private LaundryModel model;
    private LaundryController controller;
    private AddView addView;
    private EditView editView;
    private DeleteView deleteView;
    private LaundryMainView mainView;
    private String ID;

    public String getID() {
        return ID;
    }
    
    Connection koneksi;
    
    public EditView(LaundryMainView mainView) {
        koneksi = KonekDB.getKoneksi("localhost", "3306", "root", "", "laundry");
        model = new LaundryModel();
        controller = new LaundryController();
        this.mainView = mainView;
        controller.setModel(model);
        initComponents();
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public EditView() {
        
    }
    
    public JPanel getEditPanel() {
        return editPanel;
    }

    public JTextField getjTxtBerat() {
        return jTxtBerat;
    }

    public void setjTxtBerat(JTextField jTxtBerat) {
        this.jTxtBerat = jTxtBerat;
    }

    public JTextField getjTxtNama() {
        return jTxtNama;
    }

    public void setjTxtNama(JTextField jTxtNama) {
        this.jTxtNama = jTxtNama;
    }

    public JComboBox<String> getComboAddLayanan() {
        return comboAddLayanan;
    }

    public JTextField getjTxtTglK() {
        return jTxtTglK;
    }

    public JTextField getjTxtTglM() {
        return jTxtTglM;
    }

    
    void showData(String ID){
        try{
            Statement stmt = koneksi.createStatement();
            String query = "SELECT * FROM laundry where ID = '"+ID+"'";
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            jTxtNama.setText(rs.getString("ID"));
            comboAddLayanan.setSelectedItem(rs.getString("jenis_layanan"));
            jTxtBerat.setText(rs.getString("berat"));
            jTxtTglM.setText(rs.getString("tanggal_masuk"));
            jTxtTglK.setText(rs.getString("tanggal_keluar"));
            
        } catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan di query");
        }
    }
    
   
    public void EditData(){
       
        String ngaran = this.getjTxtNama().getText();
        String layanan = this.getComboAddLayanan().getSelectedItem().toString();
        String berat = this.getjTxtBerat().getText();
        String tgl_masuk = this.getjTxtTglM().getText();
        String tgl_keluar = this.getjTxtTglK().getText();
        
        //int harga = this.getj
        
        try{
            Statement stmt = koneksi.createStatement();
            String query = "UPDATE laundry SET nama_customer = '"+ngaran+"', " + "berat = '"+berat+"', " + "jenis_layanan = '"+layanan+"' , " + "tanggal_masuk = '"+tgl_masuk+"' , " + "tanggal_keluar = '"+tgl_keluar+"'  WHERE ID = '"+ID+"' ";
            
            System.out.println(query);
            int success = stmt.executeUpdate(query);
            if(success == 1){
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            } else{
                JOptionPane.showMessageDialog(null, "Data Gagal diubah");
            }
            
        } catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada query");
        }
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtTglM = new javax.swing.JTextField();
        jTxtBerat = new javax.swing.JTextField();
        jTxtTglK = new javax.swing.JTextField();
        jTxtNama = new javax.swing.JTextField();
        comboAddLayanan = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editPanel.setPreferredSize(new java.awt.Dimension(920, 870));
        editPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Edit Transaksi");
        editPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Layanan");
        editPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Berat (Kg)");
        editPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tanggal Masuk");
        editPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Tanggal Keluar");
        editPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Nama");
        editPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jTxtTglM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtTglM.setPreferredSize(new java.awt.Dimension(230, 32));
        editPanel.add(jTxtTglM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jTxtBerat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtBerat.setPreferredSize(new java.awt.Dimension(230, 32));
        editPanel.add(jTxtBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 140, -1));

        jTxtTglK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtTglK.setPreferredSize(new java.awt.Dimension(230, 32));
        editPanel.add(jTxtTglK, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jTxtNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtNama.setPreferredSize(new java.awt.Dimension(230, 32));
        editPanel.add(jTxtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        comboAddLayanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reguler", "Kilat" }));
        comboAddLayanan.setPreferredSize(new java.awt.Dimension(180, 32));
        editPanel.add(comboAddLayanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jButton1.setText("jButton1");
        editPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jButton2.setText("Edit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        editPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        getContentPane().add(editPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        EditData();
    }//GEN-LAST:event_jButton2MouseClicked

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAddLayanan;
    private javax.swing.JPanel editPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTxtBerat;
    private javax.swing.JTextField jTxtNama;
    private javax.swing.JTextField jTxtTglK;
    private javax.swing.JTextField jTxtTglM;
    // End of variables declaration//GEN-END:variables
}
