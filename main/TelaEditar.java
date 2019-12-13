/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cassi
 */
public class TelaEditar extends javax.swing.JFrame {

    /**
     * Creates new form TelaEditar
     */
    Agenda nova;
    File f;
    int index;
    public TelaEditar(Agenda nova, File f, int index) {
        initComponents();
        this.nova = nova;
        this.f = f;
        this.index = index;
        Nome.setText(nova.getListaDeContatos().get(index).getNome());
        Sobrenome.setText(nova.getListaDeContatos().get(index).getSobrenome());
        Telefone.setText(nova.getListaDeContatos().get(index).getTelefone());
        Email.setText(nova.getListaDeContatos().get(index).getEmail());
        Endereco.setText(nova.getListaDeContatos().get(index).getRua());
        Numero.setText(nova.getListaDeContatos().get(index).getNumero());
        Cep.setText(nova.getListaDeContatos().get(index).getCep());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Numero = new javax.swing.JTextField();
        Cep = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        Sobrenome = new javax.swing.JTextField();
        Telefone = new javax.swing.JTextField();
        Endereco = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Button.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 50, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Button.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 30, 30));

        Numero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Numero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Numero.setBorder(null);
        getContentPane().add(Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 280, 30));

        Cep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Cep.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Cep.setBorder(null);
        getContentPane().add(Cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 260, 30));

        Nome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Nome.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Nome.setBorder(null);
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 260, 30));

        Sobrenome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sobrenome.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Sobrenome.setBorder(null);
        Sobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(Sobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 210, 30));

        Telefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Telefone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Telefone.setBorder(null);
        getContentPane().add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 210, 30));

        Endereco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Endereco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Endereco.setBorder(null);
        getContentPane().add(Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 280, 30));

        Email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Email.setBorder(null);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 260, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/EDITAR_CONTATO.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaContato tela = new TelaContato(nova, f, index);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Nome.getText().equals("") || (Telefone.getText().equals("") && Email.getText().equals(""))){
            JOptionPane.showMessageDialog(null,  "Preencha pelo menos o nome e o telefone ou e-mail!", "Contato inválido!", JOptionPane.ERROR_MESSAGE);
        }
        nova.getListaDeContatos().get(index).setNome(Nome.getText());
        nova.getListaDeContatos().get(index).setSobrenome(Sobrenome.getText());
        nova.getListaDeContatos().get(index).setTelefone(Telefone.getText());
        nova.getListaDeContatos().get(index).setEmail(Email.getText());
        nova.getListaDeContatos().get(index).setRua(Endereco.getText());
        nova.getListaDeContatos().get(index).setNumero(Numero.getText());
        nova.getListaDeContatos().get(index).setCep(Cep.getText());
        nova.ordenaLista();
        try {
            FileWriter fw = new FileWriter(f.getName());
            StringBuilder sb = new StringBuilder("");
            for(int i=0; i<nova.getNumeroDeContatos(); i++){
                sb.append(nova.getListaDeContatos().get(i).getNome()+"\n"+ nova.getListaDeContatos().get(i).getSobrenome()+"\n"+nova.getListaDeContatos().get(i).getTelefone()+"\n"+nova.getListaDeContatos().get(i).getEmail()+"\n"+nova.getListaDeContatos().get(i).getRua()+"\n"+nova.getListaDeContatos().get(i).getNumero()+"\n"+nova.getListaDeContatos().get(i).getCep()+"\n");
            }
            fw.write(sb.toString());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(TelaEditar.class.getName()).log(Level.SEVERE, null, ex);
        }

        TelaContato tela = new TelaContato(nova, f, index);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SobrenomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cep;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Endereco;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Numero;
    private javax.swing.JTextField Sobrenome;
    private javax.swing.JTextField Telefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}