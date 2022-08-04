/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrypbo.apps.view;

import javax.swing.JPanel;
import laundrypbo.apps.controller.LaundryController;
import laundrypbo.apps.model.LaundryModel;

/**
 *
 * @author azkaz
 */
public class LaundryMainView extends javax.swing.JFrame {

  /** Creates new form FormLoginView */
  private LaundryModel model;
  private LaundryController controller;
  private AddView addView;
  private EditView editView;
  private DeleteView deleteView;

  public LaundryMainView() {
    model = new LaundryModel();
    controller = new LaundryController();
    addView = new AddView(this);
    editView = new EditView();
    deleteView = new DeleteView();

    controller.setModel(model);

    initComponents();
  }

  public JPanel getMainPanel() {
    return MainPanel;
  }

  public JPanel getListPanel() {
    return listPanel;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
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
        btnDeletePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        listPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("List Pelanggan");
        setPreferredSize(new java.awt.Dimension(1200, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPanel.setBackground(new java.awt.Color(255, 76, 48));
        MenuPanel.setPreferredSize(new java.awt.Dimension(280, 860));
        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/mylaundry.png"))); // NOI18N
        MenuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnListPanel.setBackground(new java.awt.Color(214, 69, 65));
        btnListPanel.setPreferredSize(new java.awt.Dimension(280, 500));
        btnListPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListPanelMouseClicked(evt);
            }
        });
        btnListPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("List Pelanggan");
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
        });
        btnEditPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Edit Pelanggan");
        btnEditPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/edit.png"))); // NOI18N
        btnEditPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        MenuPanel.add(btnEditPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 50));

        btnDeletePanel.setBackground(new java.awt.Color(214, 69, 65));
        btnDeletePanel.setPreferredSize(new java.awt.Dimension(280, 500));
        btnDeletePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletePanelMouseClicked(evt);
            }
        });
        btnDeletePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Delete Pelanggan");
        btnDeletePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/delete.png"))); // NOI18N
        btnDeletePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, -1, -1));

        MenuPanel.add(btnDeletePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, 50));

        getContentPane().add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 870));

        MainPanel.setPreferredSize(new java.awt.Dimension(920, 870));
        MainPanel.setLayout(new java.awt.CardLayout());

        listPanel.setPreferredSize(new java.awt.Dimension(597, 200));
        listPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama Costumer", "Harga", "Layanan", "Berat", "Tanggal Masuk", "Tanggal Keluar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        listPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 850, 720));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("List Transaksi");
        listPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        MainPanel.add(listPanel, "card2");

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletePanelMouseClicked
        // TODO add your handling code here:
        controller.menuDelete(this);
    }//GEN-LAST:event_btnDeletePanelMouseClicked

    private void btnEditPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditPanelMouseClicked
        // TODO add your handling code here:
        controller.menuEdit(this);
    }//GEN-LAST:event_btnEditPanelMouseClicked

  private void btnListPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnListPanelMouseClicked
    // TODO add your handling code here:
    controller.menuList(this);
  }// GEN-LAST:event_btnListPanelMouseClicked

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
        if ("Metal".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(LaundryMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LaundryMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LaundryMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LaundryMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LaundryMainView().setVisible(true);
      }
    });
  }

  public Object getTxtUser() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

  public Object getTxtPass() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
                                                                   // | Templates.
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel btnAddPanel;
    private javax.swing.JPanel btnDeletePanel;
    private javax.swing.JPanel btnEditPanel;
    private javax.swing.JPanel btnListPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel listPanel;
    // End of variables declaration//GEN-END:variables
}
