/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laundrypbo.apps.aboutUs;
import java.awt.PopupMenu;
import javax.swing.JPanel;

/**
 *
 * @author Aldiansyah
 */
public class AboutYuan extends javax.swing.JFrame {

    /**
     * Creates new form AboutAldi
     */
    public AboutYuan() {
        initComponents();
    }
    public JPanel getYuanPanel() {
        return YuanPanel;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        YuanPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        YuanPanel.setPreferredSize(new java.awt.Dimension(920, 780));
        YuanPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundrypbo/resources/img/yuan.jpeg"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(500, 500));
        YuanPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 39, 288, 293));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("NIM     : 10121172");
        YuanPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 482, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("NAMA  : YUAN KHRISNA ARADIA");
        YuanPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 388, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("EMAIL : yuan.10121172@mahasiswa.unikom.ac.id");
        YuanPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 529, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("TTL      : Bandung, 18 September 2003");
        YuanPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 435, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Konstribusi:");
        YuanPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("NO HP : 082240223828");
        YuanPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 576, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("GITHUB : -");
        YuanPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

        getContentPane().add(YuanPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 983, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AboutAldi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutAldi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutAldi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutAldi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutYuan().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel YuanPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables


}