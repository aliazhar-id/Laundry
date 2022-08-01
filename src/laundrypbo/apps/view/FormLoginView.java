/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrypbo.apps.view;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import laundrypbo.apps.controller.LaundryController;
// import tugas2.aliazhar.pbo.event.FormLoginListener;
import laundrypbo.apps.model.LaundryModel;

/**
 *
 * @author aliazhar
 */
public class FormLoginView extends javax.swing.JFrame /* implements FormLoginListener */ {

  /** Creates new form FormLoginView */
  private LaundryModel model;
  private LaundryController controller;

  public FormLoginView() {
    model = new LaundryModel();
    controller = new LaundryController();

    // model.setFormLoginListener(this);
    controller.setModel(model);

    initComponents();
  }

  public JPasswordField getTxtPass() {
    return txtPass;
  }

  public JTextField getTxtUser() {
    return txtUser;
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

        loginPanel = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        labelUser = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        labelTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Login");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPass.setPreferredSize(new java.awt.Dimension(450, 50));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        loginPanel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        btnLogin.setBackground(new java.awt.Color(125, 169, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        loginPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 450, 50));

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginPanel.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 450, 50));

        labelUser.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelUser.setText("USERNAME");
        loginPanel.add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        labelPass.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelPass.setText("PASSWORD");
        loginPanel.add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 510, 560));

        sidePanel.setBackground(new java.awt.Color(102, 102, 255));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/user.png"))); // NOI18N
        sidePanel.add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 190));

        labelTitle1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle1.setText("USER LOGIN");
        sidePanel.add(labelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPassActionPerformed
    // TODO add your handling code here:
  }// GEN-LAST:event_txtPassActionPerformed

  private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLoginMouseClicked
    // TODO add your handling code here:
    controller.login(this);
  }// GEN-LAST:event_btnLoginMouseClicked

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
      java.util.logging.Logger.getLogger(FormLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FormLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FormLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FormLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FormLoginView().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelTitle1;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
//  @Override
//  public void onChange(LaundryModel login) {
//    txtUser.setText(model.getUsername());
//    txtPass.setText(model.getPassword());
//  }
}