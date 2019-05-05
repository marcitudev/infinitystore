package interfaces;

import infinitystore.com.JTableRenderer;
import infinitystore.com.LojaAdmin;
import infinitystore.com.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Usuario extends javax.swing.JFrame {

    private int indexUsuario = -1;
    private LojaAdmin admin = new LojaAdmin();
    private int[] indices;
    private List<Produto> produtosAchados = new ArrayList<Produto>();

    public Usuario() {
        admin.recuperaDados();
        initComponents();
        configTabela();
        comprarAgora.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        botaoCarrinho = new javax.swing.JButton();
        botaoProcurar = new javax.swing.JButton();
        nomeProduto = new javax.swing.JTextField();
        adicionaCarrinho = new javax.swing.JButton();
        botaoFavoritos = new javax.swing.JButton();
        configUsuario = new javax.swing.JButton();
        adicionarFavorito = new javax.swing.JButton();
        comprarAgora = new javax.swing.JButton();
        modaAcessorios = new javax.swing.JButton();
        eletrodomesticos = new javax.swing.JButton();
        informatica = new javax.swing.JButton();
        moveisDecoracao = new javax.swing.JButton();
        industriaComercio = new javax.swing.JButton();
        games = new javax.swing.JButton();
        esporteLazer = new javax.swing.JButton();
        backgroundUser = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        setResizable(false);
        getContentPane().setLayout(null);

        tabelaUsuario.setBackground(new java.awt.Color(26, 26, 26));
        tabelaUsuario.setFont(new java.awt.Font("Helvetica-Normal", 0, 11)); // NOI18N
        tabelaUsuario.setForeground(new java.awt.Color(255, 127, 42));
        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
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
        tabelaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaUsuario.setGridColor(new java.awt.Color(26, 26, 26));
        tabelaUsuario.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabelaUsuario.setRequestFocusEnabled(false);
        tabelaUsuario.setRowHeight(70);
        tabelaUsuario.setSelectionBackground(new java.awt.Color(255, 127, 42));
        jScrollPane1.setViewportView(tabelaUsuario);
        if (tabelaUsuario.getColumnModel().getColumnCount() > 0) {
            tabelaUsuario.getColumnModel().getColumn(0).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(1).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelaUsuario.getColumnModel().getColumn(2).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(3).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(4).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(5).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 110, 470, 180);

        botaoCarrinho.setBorderPainted(false);
        botaoCarrinho.setContentAreaFilled(false);
        botaoCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCarrinho.setFocusPainted(false);
        botaoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCarrinho);
        botaoCarrinho.setBounds(270, 30, 30, 30);

        botaoProcurar.setBorder(null);
        botaoProcurar.setBorderPainted(false);
        botaoProcurar.setContentAreaFilled(false);
        botaoProcurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoProcurar.setFocusPainted(false);
        botaoProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoProcurar);
        botaoProcurar.setBounds(470, 20, 30, 30);

        nomeProduto.setBackground(new java.awt.Color(51, 51, 51));
        nomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        nomeProduto.setBorder(null);
        nomeProduto.setOpaque(false);
        nomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(nomeProduto);
        nomeProduto.setBounds(500, 27, 140, 20);

        adicionaCarrinho.setBorderPainted(false);
        adicionaCarrinho.setContentAreaFilled(false);
        adicionaCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionaCarrinho.setFocusPainted(false);
        adicionaCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionaCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(adicionaCarrinho);
        adicionaCarrinho.setBounds(625, 320, 30, 30);

        botaoFavoritos.setBorderPainted(false);
        botaoFavoritos.setContentAreaFilled(false);
        botaoFavoritos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoFavoritos.setFocusPainted(false);
        botaoFavoritos.setMaximumSize(new java.awt.Dimension(49, 23));
        botaoFavoritos.setMinimumSize(new java.awt.Dimension(49, 23));
        botaoFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFavoritosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoFavoritos);
        botaoFavoritos.setBounds(230, 30, 30, 30);

        configUsuario.setBorderPainted(false);
        configUsuario.setContentAreaFilled(false);
        configUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configUsuario.setFocusPainted(false);
        configUsuario.setMaximumSize(new java.awt.Dimension(49, 23));
        configUsuario.setMinimumSize(new java.awt.Dimension(49, 23));
        configUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(configUsuario);
        configUsuario.setBounds(190, 30, 30, 30);

        adicionarFavorito.setBorderPainted(false);
        adicionarFavorito.setContentAreaFilled(false);
        adicionarFavorito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionarFavorito.setFocusPainted(false);
        adicionarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarFavoritoActionPerformed(evt);
            }
        });
        getContentPane().add(adicionarFavorito);
        adicionarFavorito.setBounds(572, 320, 30, 30);

        comprarAgora.setBackground(new java.awt.Color(26, 26, 26));
        comprarAgora.setForeground(new java.awt.Color(26, 26, 26));
        comprarAgora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Comprar agora.png"))); // NOI18N
        comprarAgora.setBorderPainted(false);
        comprarAgora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprarAgora.setFocusPainted(false);
        comprarAgora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarAgoraActionPerformed(evt);
            }
        });
        getContentPane().add(comprarAgora);
        comprarAgora.setBounds(448, 320, 100, 30);

        modaAcessorios.setBorderPainted(false);
        modaAcessorios.setContentAreaFilled(false);
        modaAcessorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modaAcessorios.setFocusPainted(false);
        modaAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modaAcessoriosActionPerformed(evt);
            }
        });
        getContentPane().add(modaAcessorios);
        modaAcessorios.setBounds(60, 150, 130, 10);

        eletrodomesticos.setBorderPainted(false);
        eletrodomesticos.setContentAreaFilled(false);
        eletrodomesticos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eletrodomesticos.setFocusPainted(false);
        eletrodomesticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eletrodomesticosActionPerformed(evt);
            }
        });
        getContentPane().add(eletrodomesticos);
        eletrodomesticos.setBounds(60, 170, 130, 10);

        informatica.setBorderPainted(false);
        informatica.setContentAreaFilled(false);
        informatica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informatica.setFocusPainted(false);
        informatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informaticaActionPerformed(evt);
            }
        });
        getContentPane().add(informatica);
        informatica.setBounds(60, 190, 130, 10);

        moveisDecoracao.setBorderPainted(false);
        moveisDecoracao.setContentAreaFilled(false);
        moveisDecoracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moveisDecoracao.setFocusPainted(false);
        moveisDecoracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveisDecoracaoActionPerformed(evt);
            }
        });
        getContentPane().add(moveisDecoracao);
        moveisDecoracao.setBounds(60, 210, 130, 10);

        industriaComercio.setBorderPainted(false);
        industriaComercio.setContentAreaFilled(false);
        industriaComercio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        industriaComercio.setFocusPainted(false);
        industriaComercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                industriaComercioActionPerformed(evt);
            }
        });
        getContentPane().add(industriaComercio);
        industriaComercio.setBounds(60, 230, 130, 10);

        games.setBorderPainted(false);
        games.setContentAreaFilled(false);
        games.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        games.setFocusPainted(false);
        games.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesActionPerformed(evt);
            }
        });
        getContentPane().add(games);
        games.setBounds(60, 250, 130, 10);

        esporteLazer.setBorderPainted(false);
        esporteLazer.setContentAreaFilled(false);
        esporteLazer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        esporteLazer.setFocusPainted(false);
        esporteLazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esporteLazerActionPerformed(evt);
            }
        });
        getContentPane().add(esporteLazer);
        esporteLazer.setBounds(60, 270, 130, 10);

        backgroundUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background User.png"))); // NOI18N
        backgroundUser.setPreferredSize(new java.awt.Dimension(698, 200));
        backgroundUser.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                backgroundUserComponentHidden(evt);
            }
        });
        getContentPane().add(backgroundUser);
        backgroundUser.setBounds(0, -1, 698, 380);

        setSize(new java.awt.Dimension(713, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setUser(int index) {
        indexUsuario = index;
    }

    private void nomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdutoActionPerformed
        botaoProcurar.doClick();
    }//GEN-LAST:event_nomeProdutoActionPerformed

    public void configTabela() {
        tabelaUsuario.setDefaultRenderer(Object.class, new CellRenderer());
        TableColumnModel columnModel = tabelaUsuario.getColumnModel();
        JTableRenderer renderer = new JTableRenderer();
        columnModel.getColumn(0).setCellRenderer(renderer);
        tabelaUsuario.setDefaultRenderer(Object.class, new CellRenderer());
        tabelaUsuario.getParent().setBackground(new java.awt.Color(26, 26, 26));
    }

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();

        comprarAgora.setVisible(false);

        modelo.setNumRows(0);

        List<Integer> index = admin.indiceProduto(nomeProduto.getText());
        indices = new int[index.size()];
        for (int k = 0; k < index.size(); k++) {
            indices[k] = index.get(k);
        }

        produtosAchados = admin.procurarProduto(nomeProduto.getText());
        if (produtosAchados.size() > 0) {
            for (Produto p : produtosAchados) {
                ImageIcon imagem = new ImageIcon(p.getImagem());
                Object[] dados = {imagem, p.getNome(), p.getMarca(), p.getDescricao(), p.getQuantidade(), p.getValor()};
                modelo.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto(s) não encontrado(s)!");
        }
    }//GEN-LAST:event_botaoProcurarActionPerformed

    private void botaoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCarrinhoActionPerformed
        if (indexUsuario != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();

            comprarAgora.setVisible(true);

            modelo.setNumRows(0);

            produtosAchados = admin.procurarUserIndice(indexUsuario).getCarrinho();

            for (Produto p : produtosAchados) {
                ImageIcon imagem = new ImageIcon(p.getImagem());
                Object[] proCar = {imagem, p.getNome(), p.getMarca(), p.getDescricao(), p.getQuantidade(), p.getValor()};
                modelo.addRow(proCar);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Crie uma conta para fazer seu carrinho em nosso site.");
        }

    }//GEN-LAST:event_botaoCarrinhoActionPerformed

    private void adicionaCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionaCarrinhoActionPerformed
        if (indexUsuario != -1) {
            int click = tabelaUsuario.getSelectedRow();
            if (click != -1) {
                admin.procurarUserIndice(indexUsuario).addProduto(produtosAchados.get(click));
                admin.gravaDados();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Crie uma conta para fazer seu carrinho em nosso site.");
        }
    }//GEN-LAST:event_adicionaCarrinhoActionPerformed

    private void botaoFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFavoritosActionPerformed
        if (indexUsuario != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();

            comprarAgora.setVisible(false);

            modelo.setNumRows(0);

            produtosAchados = admin.procurarUserIndice(indexUsuario).getFavoritos();

            for (Produto p : produtosAchados) {
                ImageIcon imagem = new ImageIcon(p.getImagem());
                Object[] proCar = {imagem, p.getNome(), p.getMarca(), p.getDescricao(), p.getQuantidade(), p.getValor()};
                modelo.addRow(proCar);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Crie uma conta para fazer seu carrinho em nosso site.");
        }

    }//GEN-LAST:event_botaoFavoritosActionPerformed

    public void pesquisarPorCategoria(String categoria) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();

        modelo.setNumRows(0);

        produtosAchados = admin.procurarProdutoCategoria(categoria);
        
        indices = new int[produtosAchados.size()];
        for (Produto p: produtosAchados) {
            List<Integer> index = admin.indiceProduto(p.getNome());
            for (int k = 0; k < index.size(); k++) {
                indices[k] = index.get(k);
            }
        }

        if (produtosAchados.size() > 0) {
            for (Produto p : produtosAchados) {
                ImageIcon imagem = new ImageIcon(p.getImagem());
                Object[] linha = {imagem, p.getNome(), p.getMarca(), p.getDescricao(), p.getQuantidade(), p.getValor()};
                modelo.addRow(linha);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto desta categoria foi encontrado.");
        }
    }

    private void configUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configUsuarioActionPerformed
        new Interface().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_configUsuarioActionPerformed

    private void backgroundUserComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_backgroundUserComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_backgroundUserComponentHidden

    private void adicionarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarFavoritoActionPerformed
        if (indexUsuario != -1) {
            int click = tabelaUsuario.getSelectedRow();
            if (click != -1) {
                admin.procurarUserIndice(indexUsuario).addFavorito(produtosAchados.get(click));
                admin.gravaDados();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Crie uma conta para fazer seu carrinho em nosso site.");
        }

    }//GEN-LAST:event_adicionarFavoritoActionPerformed

    private void comprarAgoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarAgoraActionPerformed
        // TODO add your handling code here:
        //comprarAgora.setVisible(false);
    }//GEN-LAST:event_comprarAgoraActionPerformed

    private void modaAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modaAcessoriosActionPerformed
        pesquisarPorCategoria("moda e acessorios");
    }//GEN-LAST:event_modaAcessoriosActionPerformed

    private void eletrodomesticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eletrodomesticosActionPerformed
        pesquisarPorCategoria("eletrodomesticos");
    }//GEN-LAST:event_eletrodomesticosActionPerformed

    private void informaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informaticaActionPerformed
        pesquisarPorCategoria("informatica");
    }//GEN-LAST:event_informaticaActionPerformed

    private void moveisDecoracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveisDecoracaoActionPerformed
        pesquisarPorCategoria("moveis e decoracao");
    }//GEN-LAST:event_moveisDecoracaoActionPerformed

    private void industriaComercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_industriaComercioActionPerformed
        pesquisarPorCategoria("industria e comercio");
    }//GEN-LAST:event_industriaComercioActionPerformed

    private void gamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesActionPerformed
        pesquisarPorCategoria("games");
    }//GEN-LAST:event_gamesActionPerformed

    private void esporteLazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esporteLazerActionPerformed
        pesquisarPorCategoria("esporte e lazer");
    }//GEN-LAST:event_esporteLazerActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionaCarrinho;
    private javax.swing.JButton adicionarFavorito;
    private javax.swing.JLabel backgroundUser;
    private javax.swing.JButton botaoCarrinho;
    private javax.swing.JButton botaoFavoritos;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JButton comprarAgora;
    private javax.swing.JButton configUsuario;
    private javax.swing.JButton eletrodomesticos;
    private javax.swing.JButton esporteLazer;
    private javax.swing.JButton games;
    private javax.swing.JButton industriaComercio;
    private javax.swing.JButton informatica;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modaAcessorios;
    private javax.swing.JButton moveisDecoracao;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JTable tabelaUsuario;
    // End of variables declaration//GEN-END:variables
}
