/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author RLCR
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        configurarRB();
    }
    public void configurarRB(){
    ButtonGroup mensajes = new ButtonGroup();
    mensajes.add(rb_1);
    mensajes.add(rb_2);
    mensajes.add(rb_3);
    mensajes.add(rb_4);
    rb_1.setSelected(true);
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rb_1 = new javax.swing.JRadioButton();
        rb_2 = new javax.swing.JRadioButton();
        rb_3 = new javax.swing.JRadioButton();
        rb_4 = new javax.swing.JRadioButton();
        btn_aceptar = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rb_1.setText("Ver showMessageDialog");

        rb_2.setText("Ver showInputDialog");

        rb_3.setText("ver showConfirmDialog");

        rb_4.setText("Ver showOptionDialog");

        btn_aceptar.setText("ACEPTAR");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_2)
                            .addComponent(rb_1)
                            .addComponent(rb_3)
                            .addComponent(rb_4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jToggleButton1)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(rb_1)
                .addGap(18, 18, 18)
                .addComponent(rb_2)
                .addGap(18, 18, 18)
                .addComponent(rb_3)
                .addGap(18, 18, 18)
                .addComponent(rb_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        if(rb_1.isSelected()){
            JOptionPane.showMessageDialog(null,"RB1");
                }
        if(rb_2.isSelected()){
            JOptionPane.showInputDialog(null,"RB2");
                }
        if(rb_3.isSelected()){
            JOptionPane.showConfirmDialog(null,"RB3");
                }
        if(rb_4.isSelected()){
            String[] rb = {"opción 1","opción 2", "opción 3"};
            JOptionPane.showOptionDialog(null,"RB4","Titulo", 0, 0, null, rb, null);
                }
    }//GEN-LAST:event_btn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton rb_1;
    private javax.swing.JRadioButton rb_2;
    private javax.swing.JRadioButton rb_3;
    private javax.swing.JRadioButton rb_4;
    // End of variables declaration//GEN-END:variables
}
