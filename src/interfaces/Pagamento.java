/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import infinitystore.com.LojaAdmin;
import infinitystore.com.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Pagamento extends javax.swing.JFrame {
    LojaAdmin admin = new LojaAdmin();
    private double valorTotal;
    private int indiceUsuario;
    private List<Produto> produtos = new ArrayList<Produto>();
    
    public Pagamento() {
        admin.recuperaDados();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        cpf = new javax.swing.JFormattedTextField();
        cartao = new javax.swing.JFormattedTextField();
        senha = new javax.swing.JPasswordField();
        cartaoBandeira = new javax.swing.JComboBox();
        valor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        valorParcelas = new javax.swing.JLabel();
        parcelas = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");

        jRadioButtonMenuItem5.setSelected(true);
        jRadioButtonMenuItem5.setText("jRadioButtonMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpf.setBackground(new java.awt.Color(26, 26, 26));
        cpf.setBorder(null);
        cpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 109, 170, 20));

        cartao.setBackground(new java.awt.Color(26, 26, 26));
        cartao.setBorder(null);
        cartao.setForeground(new java.awt.Color(255, 255, 255));
        try {
            cartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.####.####.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(cartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 159, 170, 20));

        senha.setBackground(new java.awt.Color(26, 26, 26));
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setBorder(null);
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 211, 170, 20));

        cartaoBandeira.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mastercard", "Visa", "Hipercard", "Diners Club", "American Express" }));
        cartaoBandeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaoBandeiraActionPerformed(evt);
            }
        });
        getContentPane().add(cartaoBandeira, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        valor.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 230, 30));

        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 266, 110, 34));

        valorParcelas.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(valorParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 210, 30));

        parcelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        parcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcelasActionPerformed(evt);
            }
        });
        getContentPane().add(parcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pagamento.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -28, 710, 410));

        setSize(new java.awt.Dimension(693, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void setPagamento(int indice, List<Produto> produtosComprados){
        indiceUsuario = indice;
        produtos = produtosComprados;
        valorTotal = 0;
        for(Produto p: produtosComprados){
            valorTotal += p.getValor();
        }
        String valorDouble = String.format("%.2f", valorTotal);
        valor.setText(produtosComprados.size() + " produtos, por R$ " + valorDouble);
    }
    
    private void cartaoBandeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaoBandeiraActionPerformed
        
    }//GEN-LAST:event_cartaoBandeiraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String senhaUser = admin.getUsuarios().get(indiceUsuario).getSenha();
        String cpfDados = cpf.getText();
        String cartaoDados = cartao.getText();
        String senhaDados = senha.getText();
        
        if(!cpfDados.equals("   .   .   -  ") && !cartaoDados.equals("    .    .    .    ") && senhaDados.equals(senhaUser)){
            admin.realizarCompra(produtos);
            Usuario novo = new Usuario();
            admin.gravaDados();
            JOptionPane.showMessageDialog(null, "Parabéns, " + admin.procurarUserIndice(indiceUsuario).getNome() + ", pela sua compra no valor de R$ " + valorTotal);
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Verifique suas informações!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void parcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcelasActionPerformed
        int quantParcelas = parcelas.getSelectedIndex()+1;
        double valorP = valorTotal / quantParcelas;
        valorParcelas.setText(quantParcelas + " vezes de R$ " + valorP + " reais.");
    }//GEN-LAST:event_parcelasActionPerformed

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
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cartao;
    private javax.swing.JComboBox cartaoBandeira;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JComboBox parcelas;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel valor;
    private javax.swing.JLabel valorParcelas;
    // End of variables declaration//GEN-END:variables
}
