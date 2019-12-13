/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author melhorenvio
 */
public class TelaBuscar extends javax.swing.JFrame {

    /**
     * Creates new form TelaBuscar
     */
    Agenda nova;
    File f;
    public TelaBuscar(Agenda nova, File f) {
        this.nova = nova;
        this.f = f;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        sobrenome = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nome.setBorder(null);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 220, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Button.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 50, 50));

        sobrenome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sobrenome.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sobrenome.setBorder(null);
        sobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(sobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 210, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Button.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/BUSCAR_CONTATO.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobrenomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(nome.getText().equals("") && sobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(null,  "Preencha os dois campos!", "Erro!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Contato> iguais = new ArrayList();
        for(int i=0; i< nova.getNumeroDeContatos(); i++){
            if(sobrenome.getText().equals("")){
                if(nome.getText().equals(nova.getListaDeContatos().get(i).getNome())){
                   iguais.add(nova.getListaDeContatos().get(i));
                }
            }
            else{ if(nome.getText().equals("")){
                if(sobrenome.getText().equals(nova.getListaDeContatos().get(i).getSobrenome())){
                    iguais.add(nova.getListaDeContatos().get(i));
                }
            }
            else{
                if(sobrenome.getText().equals(nova.getListaDeContatos().get(i).getSobrenome()) && nome.getText().equals(nova.getListaDeContatos().get(i).getNome())){
                  iguais.add(nova.getListaDeContatos().get(i));
                }
            }
            }
        }
           if(iguais.isEmpty()){
                JOptionPane.showMessageDialog(null,  "Contato não encontrado!", "Atenção!", JOptionPane.ERROR_MESSAGE);
            }
           else{
               BuscaResultado tela = new BuscaResultado(nova, f, iguais);
               tela.setVisible(true);
               dispose();
           }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                    ListaAgenda tela = new ListaAgenda(nova, f);
                     tela.setVisible(true);
                     dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField sobrenome;
    // End of variables declaration//GEN-END:variables
}
