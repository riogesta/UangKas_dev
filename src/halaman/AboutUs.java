/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halaman;

import javax.swing.JOptionPane;

/**
 *
 * @author riogesta
 */
public class AboutUs extends javax.swing.JFrame {

    /**
     * Creates new form AboutUs
     */
    public AboutUs() {
        initComponents();
        
        UangKas u = new UangKas();
        jLabel_name1.setText(u.getNamedua());
        jLabel_name2.setText(u.getNamesatu());
        jLabel_name3.setText(u.getNametiga());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_name3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_name1 = new javax.swing.JLabel();
        jLabel_name2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Info");

        panelBackground.setBackground(new java.awt.Color(255, 240, 240));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group(70).png"))); // NOI18N
        panelBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info(70).png"))); // NOI18N
        panelBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 80));

        jLabel_name3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_name3.setText("-");
        panelBackground.add(jLabel_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 250, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Aplikasi Uang kas ");
        panelBackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 210, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Team kami");
        panelBackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, -1));

        jLabel_name1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_name1.setText("-");
        panelBackground.add(jLabel_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 250, 20));

        jLabel_name2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_name2.setText("-");
        panelBackground.add(jLabel_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(448, 314));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_name1;
    private javax.swing.JLabel jLabel_name2;
    private javax.swing.JLabel jLabel_name3;
    private javax.swing.JPanel panelBackground;
    // End of variables declaration//GEN-END:variables

}
