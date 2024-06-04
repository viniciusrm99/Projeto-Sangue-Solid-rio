/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import CONTROLER.AtualizarControler;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author vinir
 */
public class AtualizarDoadorTelaView extends javax.swing.JFrame {

    /**
     * Creates new form AtualizarDoadorTelaView
     */
    public AtualizarDoadorTelaView() {
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza a janela na tela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAtualizar = new javax.swing.JButton();
        txtVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAtualizar.setBackground(new java.awt.Color(255, 0, 0));
        txtAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        txtAtualizar.setText("Confirmar");
        txtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(txtAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, -1));

        txtVoltar.setBackground(new java.awt.Color(255, 0, 0));
        txtVoltar.setForeground(new java.awt.Color(255, 255, 255));
        txtVoltar.setText("Voltar");
        txtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(txtVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 80, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualizar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 220, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Informe o ID do doador que deseja atualizar:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 400, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Telefone:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 30));

        txtID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 63, -1));

        txtTelefone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 196, 290, -1));

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, -1));

        fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo doador.jpg"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, -1, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVoltarActionPerformed
        PaginaInicialTelaView objInicialTelaView = new PaginaInicialTelaView();
        objInicialTelaView.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_txtVoltarActionPerformed

    private void txtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarActionPerformed
       AtualizarControler objatulizarcontroler = new AtualizarControler(this);
        try {
            objatulizarcontroler.atualizarControler();
        } catch (SQLException ex) {
            Logger.getLogger(AtualizarDoadorTelaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        getTxtID().setText("");
        getTxtEmail().setText("");
        getTxtTelefone().setText("");
    }//GEN-LAST:event_txtAtualizarActionPerformed

    public JButton getTxtAtualizar() {
        return txtAtualizar;
    }

    public void setTxtAtualizar(JButton txtAtualizar) {
        this.txtAtualizar = txtAtualizar;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }




    public JTextField getTxtID() {
        return txtID;
    }

    public void setTxtID(JTextField txtID) {
        this.txtID = txtID;
    }

    public JTextField getTxtTelefone() {
        return txtTelefone;
    }

    public void setTxtTelefone(JTextField txtTelefone) {
        this.txtTelefone = txtTelefone;
    }

    public JButton getTxtVoltar() {
        return txtVoltar;
    }

    public void setTxtVoltar(JButton txtVoltar) {
        this.txtVoltar = txtVoltar;
    }

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
            java.util.logging.Logger.getLogger(AtualizarDoadorTelaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarDoadorTelaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarDoadorTelaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarDoadorTelaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarDoadorTelaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton txtAtualizar;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JButton txtVoltar;
    // End of variables declaration//GEN-END:variables
}
