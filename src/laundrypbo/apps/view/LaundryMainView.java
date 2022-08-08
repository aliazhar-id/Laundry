/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrypbo.apps.view;

//import com.mysql.jdbc.Statement;
import java.sql.Statement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import laundrypbo.apps.controller.LaundryController;
import laundrypbo.apps.database.KonekDB;
import laundrypbo.apps.model.LaundryModel;

/**
 *
 * @author azkaz
 */
public class LaundryMainView extends javax.swing.JFrame {

  /** Creates new form FormLoginView */
 
    /** Creates new form FormLoginView */
    private LaundryModel model;
    private LaundryController controller;
    private AddView addView;
    private EditView editView;
    private DeleteView deleteView;
    Connection koneksi;

    public LaundryMainView() {
        koneksi = KonekDB.getKoneksi("localhost", "3306", "root", "", "laundry");
        // showData();
        model = new LaundryModel();
        controller = new LaundryController();
        addView = new AddView(this);
        editView = new EditView(this);
        deleteView = new DeleteView();

        controller.setModel(model);
        initComponents();
    }

    DefaultTableModel dtm;

    public void showData() {
        String[] kolom = { "ID", "Nama", "Berat", "Layanan", "Harga", "Tanggal masuk", "Tanggal Keluar" };
        dtm = new DefaultTableModel(null, kolom);
        try {
            Statement stmt = (Statement) koneksi.createStatement();
            String query = "SELECT * FROM laundry";
            ResultSet rs = stmt.executeQuery(query);
            int no = 1;
            while (rs.next()) {
                String id = rs.getString("ID");
                String nama = rs.getString("nama_customer");
                String berat = rs.getString("berat");
                String layanan = rs.getString("jenis_layanan");
                String harga = rs.getString("harga");
                String tglmasuk = rs.getString("tanggal_masuk");
                String tglkeluar = rs.getString("tanggal_keluar");

                dtm.addRow(new String[] { id, nama, berat, layanan, harga, tglmasuk, tglkeluar });
                no++;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        TblCustomer.setModel(dtm);
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }

    public JPanel getListPanel() {
        return listPanel;
    }

    public JPanel getBtnAboutPanel() {
        return btnAboutPanel;
    }

    public JPanel getBtnAddPanel() {
        return btnAddPanel;
    }

    public JPanel getBtnDeletePanel() {
        return btnDeletePanel;
    }

    public JPanel getBtnEditPanel() {
        return btnEditPanel;
    }

    public JPanel getBtnListPanel() {
        return btnListPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnListPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAddPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEditPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnLogOutPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnDeletePanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAboutPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        listPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCustomer = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jBtnDelete = new javax.swing.JButton();
        jBtnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin My Laundry");
        setPreferredSize(new java.awt.Dimension(1200, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPanel.setBackground(new java.awt.Color(214, 69, 65));
        MenuPanel.setPreferredSize(new java.awt.Dimension(280, 860));
        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/mylaundry.png"))); // NOI18N
        MenuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnListPanel.setBackground(new java.awt.Color(176, 82, 70));
        btnListPanel.setPreferredSize(new java.awt.Dimension(280, 500));
        btnListPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListPanelMouseExited(evt);
            }
        });
        btnListPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Daftar Pelanggan");
        btnListPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/list.png"))); // NOI18N
        btnListPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        MenuPanel.add(btnListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, 50));

        btnAddPanel.setBackground(new java.awt.Color(214, 69, 65));
        btnAddPanel.setPreferredSize(new java.awt.Dimension(280, 500));
        btnAddPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddPanelMouseExited(evt);
            }
        });
        btnAddPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tambah Pelanggan");
        btnAddPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/add.png"))); // NOI18N
        btnAddPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        MenuPanel.add(btnAddPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, 50));

        btnEditPanel.setBackground(new java.awt.Color(214, 69, 65));
        btnEditPanel.setPreferredSize(new java.awt.Dimension(280, 500));
        btnEditPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditPanelMouseExited(evt);
            }
        });
        btnEditPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Edit Pelanggan");
        btnEditPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/edit.png"))); // NOI18N
        btnEditPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        MenuPanel.add(btnEditPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 50));

        btnLogOutPanel.setBackground(new java.awt.Color(214, 69, 65));
        btnLogOutPanel.setPreferredSize(new java.awt.Dimension(280, 500));
        btnLogOutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOutPanelMouseExited(evt);
            }
        });
        btnLogOutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Log Out");
        btnLogOutPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/log-out.png"))); // NOI18N
        btnLogOutPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        MenuPanel.add(btnLogOutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, -1, 50));

        btnDeletePanel.setBackground(new java.awt.Color(214, 69, 65));
        btnDeletePanel.setPreferredSize(new java.awt.Dimension(280, 500));
        btnDeletePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeletePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeletePanelMouseExited(evt);
            }
        });
        btnDeletePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Hapus Pelanggan");
        btnDeletePanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/delete.png"))); // NOI18N
        btnDeletePanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        MenuPanel.add(btnDeletePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, 50));

        btnAboutPanel.setBackground(new java.awt.Color(214, 69, 65));
        btnAboutPanel.setPreferredSize(new java.awt.Dimension(280, 500));
        btnAboutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAboutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAboutPanelMouseExited(evt);
            }
        });
        btnAboutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("About Us");
        btnAboutPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/about.png"))); // NOI18N
        btnAboutPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        MenuPanel.add(btnAboutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, -1, 50));

        getContentPane().add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 870));

        MainPanel.setPreferredSize(new java.awt.Dimension(920, 870));
        MainPanel.setLayout(new java.awt.CardLayout());

        listPanel.setPreferredSize(new java.awt.Dimension(597, 200));
        listPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama ", "Berat", "Layanan", "Harga", "Tanggal Masuk", "Tanggal Keluar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblCustomer.setRowHeight(45);
        TblCustomer.getTableHeader().setResizingAllowed(false);
        TblCustomer.getTableHeader().setReorderingAllowed(false);
        TblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblCustomer);
        if (TblCustomer.getColumnModel().getColumnCount() > 0) {
            TblCustomer.getColumnModel().getColumn(0).setResizable(false);
            TblCustomer.getColumnModel().getColumn(1).setResizable(false);
            TblCustomer.getColumnModel().getColumn(2).setResizable(false);
            TblCustomer.getColumnModel().getColumn(3).setResizable(false);
            TblCustomer.getColumnModel().getColumn(4).setResizable(false);
            TblCustomer.getColumnModel().getColumn(5).setResizable(false);
            TblCustomer.getColumnModel().getColumn(6).setResizable(false);
        }

        listPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 850, 720));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Daftar Pelanggan");
        listPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jBtnDelete.setText("Delete");
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });
        listPanel.add(jBtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, -1, -1));

        jBtnEdit.setText("Edit");
        jBtnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnEditMouseClicked(evt);
            }
        });
        jBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditActionPerformed(evt);
            }
        });
        listPanel.add(jBtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 820, -1, -1));

        MainPanel.add(listPanel, "card2");

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 920));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutPanelMouseEntered
        // TODO add your handling code here:
        if (!this.btnAboutPanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnAboutPanel.setBackground(Color.decode("#FE7968"));
        }
    }//GEN-LAST:event_btnAboutPanelMouseEntered

    private void btnAboutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutPanelMouseExited
        // TODO add your handling code here:
        if (!this.btnAboutPanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnAboutPanel.setBackground(Color.decode("#D64541"));
        }
    }//GEN-LAST:event_btnAboutPanelMouseExited

    private void btnLogOutPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLogOutPanelMouseClicked
        // TODO add your handling code here:
        controller.logOut(this);
    }// GEN-LAST:event_btnLogOutPanelMouseClicked

    private void btnEditPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnEditPanelMouseClicked
        // TODO add your handling code here:
        controller.menuEdit(this);
    }// GEN-LAST:event_btnEditPanelMouseClicked

    private void btnListPanelMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnListPanelMouseEntered
        if (!this.btnListPanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnListPanel.setBackground(Color.decode("#FE7968"));
        }
    }// GEN-LAST:event_btnListPanelMouseEntered

    private void btnListPanelMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnListPanelMouseExited
        if (!this.btnListPanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnListPanel.setBackground(Color.decode("#D64541"));
        }
    }// GEN-LAST:event_btnListPanelMouseExited

    private void btnAddPanelMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAddPanelMouseEntered
        if (!this.btnAddPanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnAddPanel.setBackground(Color.decode("#FE7968"));
        }
    }// GEN-LAST:event_btnAddPanelMouseEntered

    private void btnAddPanelMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAddPanelMouseExited
        if (!this.btnAddPanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnAddPanel.setBackground(Color.decode("#D64541"));
        }
    }// GEN-LAST:event_btnAddPanelMouseExited

    private void btnEditPanelMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnEditPanelMouseEntered
        if (!this.btnEditPanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnEditPanel.setBackground(Color.decode("#FE7968"));
        }
    }// GEN-LAST:event_btnEditPanelMouseEntered

    private void btnEditPanelMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnEditPanelMouseExited
        if (!this.btnEditPanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnEditPanel.setBackground(Color.decode("#D64541"));
        }
    }// GEN-LAST:event_btnEditPanelMouseExited

    private void btnLogOutPanelMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLogOutPanelMouseEntered
        if (!this.btnLogOutPanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnLogOutPanel.setBackground(Color.decode("#FE7968"));
        }
    }// GEN-LAST:event_btnLogOutPanelMouseEntered

    private void btnLogOutPanelMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLogOutPanelMouseExited
        if (!this.btnLogOutPanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnLogOutPanel.setBackground(Color.decode("#D64541"));
        }
    }// GEN-LAST:event_btnLogOutPanelMouseExited

    private void btnAboutPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAboutPanelMouseClicked
        // TODO add your handling code here:
        controller.menuAbout(this);
    }// GEN-LAST:event_btnAboutPanelMouseClicked

    int baris;

    private void TblCustomerMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TblCustomerMouseClicked
        // TODO add your handling code here:
        baris = TblCustomer.getSelectedRow();
    }// GEN-LAST:event_TblCustomerMouseClicked

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jBtnDeleteActionPerformed
        // TODO add your handling code here:
        String IdDelete = TblCustomer.getValueAt(baris, 0).toString();

        try {
            Statement stmt = koneksi.createStatement();
            String query = "DELETE FROM laundry where ID = '" + IdDelete + "';";
            int success = stmt.executeUpdate(query);
            if (success == 1) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                dtm.getDataVector().removeAllElements();
                showData();
            } else {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            }

        } catch (SQLException q) {
            q.printStackTrace();
        }
    }// GEN-LAST:event_jBtnDeleteActionPerformed

    private void btnDeletePanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnDeletePanelMouseClicked
        // TODO add your handling code here:
        controller.menuDelete(this);
    }// GEN-LAST:event_btnDeletePanelMouseClicked

    private void btnDeletePanelMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnDeletePanelMouseEntered
        // TODO add your handling code here:
        if (!this.btnDeletePanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnDeletePanel.setBackground(Color.decode("#FE7968"));
        }
    }// GEN-LAST:event_btnDeletePanelMouseEntered

    private void btnDeletePanelMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnDeletePanelMouseExited
        // TODO add your handling code here:
        if (!this.btnDeletePanel.getBackground().toString().equals("java.awt.Color[r=176,g=82,b=70]")) {
            this.btnDeletePanel.setBackground(Color.decode("#D64541"));
        }
    }// GEN-LAST:event_btnDeletePanelMouseExited

    private void btnListPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnListPanelMouseClicked
        // TODO add your handling code here:
        controller.menuList(this);
    }// GEN-LAST:event_btnListPanelMouseClicked

                            

    private void jBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnEditActionPerformed

    private void jBtnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEditMouseClicked
        // TODO add your handling code here:
        
//        LaundryController control = new LaundryController();
        
//        EditView ubah = new EditView();
//        LaundryMainView main = new LaundryMainView();
//        String Id = TblCustomer.getValueAt(baris, 0).toString();
//        String nama = TblCustomer.getValueAt(baris, 1).toString();
//        String berat = TblCustomer.getValueAt(baris, 2).toString();
//        String layanan = TblCustomer.getValueAt(baris, 3).toString();
//        String harga = TblCustomer.getValueAt(baris, 4).toString();
//        String tglM = TblCustomer.getValueAt(baris, 5).toString();
//        String tglK = TblCustomer.getValueAt(baris, 6).toString();
//        ubah.getjTxtNama().setText(nama);
//        ubah.getjTxtBerat().setText(berat);

//        main.getMainPanel().removeAll();
//       // control.menuList(ubah.getEditPanel());
//        main.getMainPanel().add(ubah.getEditPanel());
//        main.getMainPanel().repaint();
//        main.getMainPanel().revalidate();
        controller.menuEdit(this);
    }//GEN-LAST:event_jBtnEditMouseClicked

  private void btnAddPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAddPanelMouseClicked
    // TODO add your handling code here:
    controller.menuAdd(this);
  }// GEN-LAST:event_btnAddPanelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LaundryMainView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaundryMainView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaundryMainView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaundryMainView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaundryMainView().setVisible(true);
            }
        });
    }
    //

    public Object getTxtUser() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools
                                                                       // | Templates.
    }

    public Object getTxtPass() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools
                                                                       // | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JTable TblCustomer;
    private javax.swing.JPanel btnAboutPanel;
    private javax.swing.JPanel btnAddPanel;
    private javax.swing.JPanel btnDeletePanel;
    private javax.swing.JPanel btnEditPanel;
    private javax.swing.JPanel btnListPanel;
    private javax.swing.JPanel btnLogOutPanel;
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listPanel;
    // End of variables declaration//GEN-END:variables
}
