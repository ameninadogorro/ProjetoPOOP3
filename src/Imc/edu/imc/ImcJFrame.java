/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.imc;
import java.lang.Math;
import javax.swing.JOptionPane;
//public double peso = 0;
//public int altura = 0;
//public String resultadoImc = "";

/**
 *
 * @author pc
 */

    

public class ImcJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ImcJFrame
     */
    public ImcJFrame() {
        initComponents();
    }

    public double peso = 0;
    public double altura = 0;
    public double imcResultado = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCampoPeso = new javax.swing.JTextField();
        B_7 = new javax.swing.JButton();
        B_8 = new javax.swing.JButton();
        B_9 = new javax.swing.JButton();
        B_4 = new javax.swing.JButton();
        B_5 = new javax.swing.JButton();
        B_6 = new javax.swing.JButton();
        B_3 = new javax.swing.JButton();
        B_1 = new javax.swing.JButton();
        B_2 = new javax.swing.JButton();
        B_CE = new javax.swing.JButton();
        B_0 = new javax.swing.JButton();
        B_Ponto = new javax.swing.JButton();
        B_CALC_IMC = new javax.swing.JButton();
        txtCampoAltura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Altura:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));
        jPanel1.add(txtCampoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 169, 32));

        B_7.setBackground(new java.awt.Color(255, 255, 255));
        B_7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_7.setForeground(new java.awt.Color(153, 204, 255));
        B_7.setText("7");
        B_7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_7.setBorderPainted(false);
        B_7.setFocusPainted(false);
        jPanel1.add(B_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 72, 52));

        B_8.setBackground(new java.awt.Color(255, 255, 255));
        B_8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_8.setForeground(new java.awt.Color(153, 204, 255));
        B_8.setText("8");
        B_8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_8.setBorderPainted(false);
        B_8.setFocusPainted(false);
        jPanel1.add(B_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 72, 52));

        B_9.setBackground(new java.awt.Color(255, 255, 255));
        B_9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_9.setForeground(new java.awt.Color(153, 204, 255));
        B_9.setText("9");
        B_9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_9.setBorderPainted(false);
        B_9.setFocusPainted(false);
        jPanel1.add(B_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 72, 52));

        B_4.setBackground(new java.awt.Color(255, 255, 255));
        B_4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_4.setForeground(new java.awt.Color(153, 204, 255));
        B_4.setText("4");
        B_4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_4.setBorderPainted(false);
        B_4.setFocusPainted(false);
        jPanel1.add(B_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 72, 52));

        B_5.setBackground(new java.awt.Color(255, 255, 255));
        B_5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_5.setForeground(new java.awt.Color(153, 204, 255));
        B_5.setText("5");
        B_5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_5.setBorderPainted(false);
        B_5.setFocusPainted(false);
        B_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_5ActionPerformed(evt);
            }
        });
        jPanel1.add(B_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 72, 52));

        B_6.setBackground(new java.awt.Color(255, 255, 255));
        B_6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_6.setForeground(new java.awt.Color(153, 204, 255));
        B_6.setText("6");
        B_6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_6.setBorderPainted(false);
        B_6.setFocusPainted(false);
        jPanel1.add(B_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 72, 52));

        B_3.setBackground(new java.awt.Color(255, 255, 255));
        B_3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_3.setForeground(new java.awt.Color(153, 204, 255));
        B_3.setText("3");
        B_3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_3.setBorderPainted(false);
        B_3.setFocusPainted(false);
        jPanel1.add(B_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 72, 52));

        B_1.setBackground(new java.awt.Color(255, 255, 255));
        B_1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_1.setForeground(new java.awt.Color(153, 204, 255));
        B_1.setText("1");
        B_1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_1.setBorderPainted(false);
        B_1.setFocusPainted(false);
        B_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_1ActionPerformed(evt);
            }
        });
        jPanel1.add(B_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 72, 52));

        B_2.setBackground(new java.awt.Color(255, 255, 255));
        B_2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_2.setForeground(new java.awt.Color(153, 204, 255));
        B_2.setText("2");
        B_2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_2.setBorderPainted(false);
        B_2.setFocusPainted(false);
        jPanel1.add(B_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 72, 52));

        B_CE.setBackground(new java.awt.Color(255, 255, 255));
        B_CE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_CE.setForeground(new java.awt.Color(153, 204, 255));
        B_CE.setText(" ⌫");
        B_CE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_CE.setBorderPainted(false);
        B_CE.setFocusPainted(false);
        B_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CEActionPerformed(evt);
            }
        });
        jPanel1.add(B_CE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 72, 52));

        B_0.setBackground(new java.awt.Color(255, 255, 255));
        B_0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        B_0.setForeground(new java.awt.Color(153, 204, 255));
        B_0.setText("0");
        B_0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_0.setBorderPainted(false);
        B_0.setFocusPainted(false);
        jPanel1.add(B_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 72, 52));

        B_Ponto.setBackground(new java.awt.Color(255, 255, 255));
        B_Ponto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        B_Ponto.setForeground(new java.awt.Color(153, 204, 255));
        B_Ponto.setText(".");
        B_Ponto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B_Ponto.setBorderPainted(false);
        B_Ponto.setFocusPainted(false);
        jPanel1.add(B_Ponto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 72, 52));

        B_CALC_IMC.setBackground(new java.awt.Color(255, 255, 255));
        B_CALC_IMC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        B_CALC_IMC.setForeground(new java.awt.Color(153, 204, 255));
        B_CALC_IMC.setText("CALCULAR ");
        B_CALC_IMC.setFocusPainted(false);
        B_CALC_IMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CALC_IMCActionPerformed(evt);
            }
        });
        jPanel1.add(B_CALC_IMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 127, 49));

        txtCampoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampoAlturaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCampoAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 169, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CEActionPerformed
        txtCampoAltura.setText("");
        txtCampoPeso.setText("");
    }//GEN-LAST:event_B_CEActionPerformed

    private void B_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_1ActionPerformed
        
    }//GEN-LAST:event_B_1ActionPerformed

    private void B_CALC_IMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CALC_IMCActionPerformed
        peso = Double.parseDouble(txtCampoPeso.getText());
        altura = Double.parseDouble(txtCampoAltura.getText());
        
        //  peso/(altura)^2
        
        imcResultado = peso / Math.pow(altura, 2);
        System.out.println(imcResultado);
        JOptionPane.showMessageDialog(this, "Seu imc é de: " + imcResultado);
    }//GEN-LAST:event_B_CALC_IMCActionPerformed

    private void B_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_5ActionPerformed

    private void txtCampoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampoAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampoAlturaActionPerformed

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
            java.util.logging.Logger.getLogger(ImcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImcJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImcJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_0;
    private javax.swing.JButton B_1;
    private javax.swing.JButton B_2;
    private javax.swing.JButton B_3;
    private javax.swing.JButton B_4;
    private javax.swing.JButton B_5;
    private javax.swing.JButton B_6;
    private javax.swing.JButton B_7;
    private javax.swing.JButton B_8;
    private javax.swing.JButton B_9;
    private javax.swing.JButton B_CALC_IMC;
    private javax.swing.JButton B_CE;
    private javax.swing.JButton B_Ponto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCampoAltura;
    private javax.swing.JTextField txtCampoPeso;
    // End of variables declaration//GEN-END:variables
}
