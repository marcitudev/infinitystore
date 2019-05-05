
package interfaces;

import infinitystore.com.LojaAdmin;
import java.util.List;
import infinitystore.com.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RemoverUsuario extends javax.swing.JFrame {
    private LojaAdmin admin = new LojaAdmin();
    private int[] indices;

    public RemoverUsuario() {
        admin.recuperaDados();
        initComponents();
        tabela.getParent().setBackground(new java.awt.Color(26,26,26));
        tabela.getTableHeader().setUI(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        nomeDeUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        procurar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(26, 26, 26));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Colunas tabela - User.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 137, 541, 195);

        nomeDeUsuario.setBackground(new java.awt.Color(255, 127, 42));
        nomeDeUsuario.setFont(new java.awt.Font("Glober SemiBold Free", 0, 13)); // NOI18N
        nomeDeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nomeDeUsuario.setBorder(null);
        nomeDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(nomeDeUsuario);
        nomeDeUsuario.setBounds(150, 62, 140, 25);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar Produtos - Lixeira.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(335, 52, 49, 40);

        procurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar Produtos - Botão.png"))); // NOI18N
        procurar.setBorderPainted(false);
        procurar.setContentAreaFilled(false);
        procurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        procurar.setFocusPainted(false);
        procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarActionPerformed(evt);
            }
        });
        getContentPane().add(procurar);
        procurar.setBounds(112, 58, 30, 31);

        tabela.setBackground(new java.awt.Color(26, 26, 26));
        tabela.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        tabela.setForeground(new java.awt.Color(255, 255, 255));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "Username", "Senha"
            }
        ));
        tabela.setGridColor(new java.awt.Color(26, 26, 26));
        tabela.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabela.setRequestFocusEnabled(false);
        tabela.setRowHeight(25);
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 160, 520, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Aviso.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(94, 91, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar Produtos.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -18, 700, 392);

        setSize(new java.awt.Dimension(693, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        if(tabela.getSelectedRow() != -1){
            admin.removerUsuario(indices[tabela.getSelectedRow()]);
            modelo.removeRow(tabela.getSelectedRow());
            admin.gravaDados();
        } else{
            JOptionPane.showMessageDialog(null, "Usuário não selecionado!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        tabela.setDefaultRenderer(Object.class, new CellRenderer());
        
        modelo.setNumRows(0);
        
        List<Integer> indicesAchados = admin.indiceUsuario(nomeDeUsuario.getText());
        indices = new int[indicesAchados.size()];
        for(int k=0; k<indicesAchados.size(); k++){
            indices[k] = indicesAchados.get(k);
        }
        
        List<Usuario> usuarios = admin.procurarUsuario(nomeDeUsuario.getText());
        if(usuarios.size() > 0){
            for(Usuario u: usuarios){
                Object[] linha = {u.getNome(), u.getSobrenome(), u.getNomeDeUsuario(), u.getSenha()};
                modelo.addRow(linha);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Nenhum usuário encontrado");
        }
    }//GEN-LAST:event_procurarActionPerformed

    private void nomeDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDeUsuarioActionPerformed
        procurar.doClick();
    }//GEN-LAST:event_nomeDeUsuarioActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RemoverUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeDeUsuario;
    private javax.swing.JButton procurar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
