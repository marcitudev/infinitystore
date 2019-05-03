
package interfaces;

import infinitystore.com.JTableRenderer;
import infinitystore.com.LojaAdmin;
import infinitystore.com.Produto;
import java.awt.Component;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ProcurarProduto extends javax.swing.JFrame {
    private LojaAdmin admin = new LojaAdmin();
    
    public ProcurarProduto() {
        admin.recuperaDados();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeDoProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeDoProduto.setBackground(new java.awt.Color(255, 127, 42));
        nomeDoProduto.setFont(new java.awt.Font("Glober SemiBold Free", 0, 13)); // NOI18N
        nomeDoProduto.setForeground(new java.awt.Color(254, 254, 254));
        nomeDoProduto.setBorder(null);
        nomeDoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDoProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(nomeDoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 66, 140, 25));

        tabela.setBackground(new java.awt.Color(26, 26, 26));
        tabela.setBorder(null);
        tabela.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        tabela.setForeground(new java.awt.Color(255, 255, 255));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imagem", "Nome", "Marca", "Descrição", "Qtd", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setFocusable(false);
        tabela.setGridColor(new java.awt.Color(26, 26, 26));
        tabela.setOpaque(false);
        tabela.setRequestFocusEnabled(false);
        tabela.setRowHeight(70);
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(5).setResizable(false);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 540, 210));

        jButton1.setBackground(new java.awt.Color(255, 127, 42));
        jButton1.setForeground(new java.awt.Color(26, 26, 26));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar Produtos - Botão.png"))); // NOI18N
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 68, 40, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar Produtos.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -14, -1, -1));

        setSize(new java.awt.Dimension(693, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

        if (tabela.getRowCount() > 0) {
            while (tabela.getRowCount() > 0) {
                modelo.removeRow(0);
            }
        }
        
        TableColumnModel columnModel = tabela.getColumnModel();
        JTableRenderer renderer = new JTableRenderer();
        columnModel.getColumn(0).setCellRenderer(renderer);
        tabela.setDefaultRenderer(Object.class, new CellRenderer());

        List<Produto> produtosAchados = admin.procurarProduto(nomeDoProduto.getText());
        if (produtosAchados.size() > 0) {
            for (Produto p : produtosAchados) {
                ImageIcon imagem = new ImageIcon(p.getImagem());
                Object[] dados = {imagem, p.getNome(), p.getMarca(), p.getDescricao(), p.getQuantidade(), String.format("R$ %.2f", p.getValor())};
                modelo.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto(s) não encontrado(s)!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nomeDoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDoProdutoActionPerformed
        jButton1.doClick();
    }//GEN-LAST:event_nomeDoProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(ProcurarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcurarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcurarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcurarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcurarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeDoProduto;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}

class CellRenderer extends DefaultTableCellRenderer {

    public CellRenderer() {
        super();
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        this.setHorizontalAlignment(CENTER);
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
