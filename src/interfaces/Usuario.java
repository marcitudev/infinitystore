package interfaces;

import infinitystore.com.JTableRenderer;
import infinitystore.com.LojaAdmin;
import infinitystore.com.Produto;
import infinitystore.com.ProdutoRef;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Usuario extends javax.swing.JFrame {

    private int indiceUsuario = -1;
    private LojaAdmin admin = new LojaAdmin();
    private List<Produto> produtos = new ArrayList<Produto>();

    public Usuario() {
        admin.recuperaDados();
        initComponents();
        configTabela();
        desligarBotoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        botaoCarrinho = new javax.swing.JButton();
        botaoProcurar = new javax.swing.JButton();
        nomeProduto = new javax.swing.JTextField();
        removerCarrinho = new javax.swing.JButton();
        adicionaCarrinho = new javax.swing.JButton();
        removerFavoritos = new javax.swing.JButton();
        botaoFavoritos = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        adicionarFavorito = new javax.swing.JButton();
        comprarAgora = new javax.swing.JButton();
        modaAcessorios = new javax.swing.JButton();
        eletrodomesticos = new javax.swing.JButton();
        informatica = new javax.swing.JButton();
        moveisDecoracao = new javax.swing.JButton();
        industriaComercio = new javax.swing.JButton();
        games = new javax.swing.JButton();
        esporteLazer = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        inicial = new javax.swing.JLabel();
        backgroundUser = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Infinity Store");
        setBackground(new java.awt.Color(255, 102, 0));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Esconder tabela.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 87, 560, 230);

        tabelaUsuario.setBackground(new java.awt.Color(26, 26, 26));
        tabelaUsuario.setFont(new java.awt.Font("Helvetica-Normal", 0, 11)); // NOI18N
        tabelaUsuario.setForeground(new java.awt.Color(255, 127, 42));
        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaUsuario.setGridColor(new java.awt.Color(26, 26, 26));
        tabelaUsuario.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabelaUsuario.setRequestFocusEnabled(false);
        tabelaUsuario.setRowHeight(70);
        tabelaUsuario.setSelectionBackground(new java.awt.Color(255, 127, 42));
        jScrollPane1.setViewportView(tabelaUsuario);
        if (tabelaUsuario.getColumnModel().getColumnCount() > 0) {
            tabelaUsuario.getColumnModel().getColumn(0).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaUsuario.getColumnModel().getColumn(1).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabelaUsuario.getColumnModel().getColumn(2).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabelaUsuario.getColumnModel().getColumn(3).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabelaUsuario.getColumnModel().getColumn(4).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(4).setPreferredWidth(0);
            tabelaUsuario.getColumnModel().getColumn(5).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 110, 470, 200);

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
        botaoCarrinho.setBounds(272, 28, 30, 30);

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
        nomeProduto.setBounds(500, 25, 140, 20);

        removerCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir do carrinho.png"))); // NOI18N
        removerCarrinho.setBorderPainted(false);
        removerCarrinho.setContentAreaFilled(false);
        removerCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removerCarrinho.setFocusPainted(false);
        removerCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(removerCarrinho);
        removerCarrinho.setBounds(628, 316, 30, 30);

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
        adicionaCarrinho.setBounds(628, 316, 30, 30);

        removerFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir dos favoritos.png"))); // NOI18N
        removerFavoritos.setBorderPainted(false);
        removerFavoritos.setContentAreaFilled(false);
        removerFavoritos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removerFavoritos.setFocusPainted(false);
        removerFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerFavoritosActionPerformed(evt);
            }
        });
        getContentPane().add(removerFavoritos);
        removerFavoritos.setBounds(575, 316, 30, 30);

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
        botaoFavoritos.setBounds(229, 28, 30, 30);

        sair.setBorderPainted(false);
        sair.setContentAreaFilled(false);
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.setFocusPainted(false);
        sair.setMaximumSize(new java.awt.Dimension(49, 23));
        sair.setMinimumSize(new java.awt.Dimension(49, 23));
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(185, 28, 30, 30);

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
        adicionarFavorito.setBounds(575, 316, 30, 30);

        comprarAgora.setBackground(new java.awt.Color(26, 26, 26));
        comprarAgora.setForeground(new java.awt.Color(26, 26, 26));
        comprarAgora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Comprar agora.png"))); // NOI18N
        comprarAgora.setBorderPainted(false);
        comprarAgora.setContentAreaFilled(false);
        comprarAgora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprarAgora.setFocusPainted(false);
        comprarAgora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarAgoraActionPerformed(evt);
            }
        });
        getContentPane().add(comprarAgora);
        comprarAgora.setBounds(448, 316, 100, 30);

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
        modaAcessorios.setBounds(60, 141, 130, 10);

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
        eletrodomesticos.setBounds(60, 160, 130, 10);

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
        informatica.setBounds(60, 180, 130, 10);

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
        moveisDecoracao.setBounds(60, 200, 130, 10);

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
        industriaComercio.setBounds(60, 220, 130, 10);

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
        games.setBounds(60, 238, 130, 10);

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
        esporteLazer.setBounds(60, 258, 130, 10);

        user.setBackground(new java.awt.Color(255, 127, 42));
        user.setFont(new java.awt.Font("Glober SemiBold Free", 0, 10)); // NOI18N
        user.setForeground(new java.awt.Color(26, 26, 26));
        user.setText("User");
        getContentPane().add(user);
        user.setBounds(110, 34, 80, 15);

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastre-se.png"))); // NOI18N
        cadastrar.setBorder(null);
        cadastrar.setBorderPainted(false);
        cadastrar.setContentAreaFilled(false);
        cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrar.setFocusPainted(false);
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(360, 22, 90, 28);

        username.setBackground(new java.awt.Color(255, 127, 42));
        username.setFont(new java.awt.Font("Gotham", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(26, 26, 26));
        username.setText("Convidado");
        getContentPane().add(username);
        username.setBounds(110, 23, 80, 13);

        inicial.setFont(new java.awt.Font("Gotham", 0, 28)); // NOI18N
        inicial.setForeground(new java.awt.Color(255, 255, 255));
        inicial.setText("C");
        getContentPane().add(inicial);
        inicial.setBounds(66, 19, 60, 50);

        backgroundUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background User.png"))); // NOI18N
        backgroundUser.setPreferredSize(new java.awt.Dimension(698, 200));
        backgroundUser.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                backgroundUserComponentHidden(evt);
            }
        });
        getContentPane().add(backgroundUser);
        backgroundUser.setBounds(0, -20, 720, 400);

        setSize(new java.awt.Dimension(693, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setUser(int indice) {  
        indiceUsuario = indice;
        if(indiceUsuario != -1){
           user.setText(admin.procurarUserIndice(indiceUsuario).getNome());
            username.setText(admin.procurarUserIndice(indiceUsuario).getNomeDeUsuario());
            cadastrar.setVisible(false);
            String[] nome = admin.procurarUserIndice(indice).getNome().split("");
            inicial.setText(nome[0].toUpperCase());
        } 
        inicializarProdutos();
    }

    private void nomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdutoActionPerformed
        botaoProcurar.doClick();
    }//GEN-LAST:event_nomeProdutoActionPerformed
    
    private void desligarBotoes(){
        comprarAgora.setVisible(false);
        removerCarrinho.setVisible(false);
        removerFavoritos.setVisible(false);
    }
    
    private void configTabela() {
        tabelaUsuario.setDefaultRenderer(Object.class, new CellRenderer());
        TableColumnModel columnModel = tabelaUsuario.getColumnModel();
        JTableRenderer renderer = new JTableRenderer();
        columnModel.getColumn(0).setCellRenderer(renderer);
        tabelaUsuario.setDefaultRenderer(Object.class, new CellRenderer());
        tabelaUsuario.getParent().setBackground(new java.awt.Color(26, 26, 26));
        tabelaUsuario.getTableHeader().setUI(null);
    }
    
    private void listarNaTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();
        modelo.setNumRows(0);
  
        if (produtos.size() > 0) {
            for (Produto p : produtos) {
                ImageIcon imagem = new ImageIcon(p.getImagem());
                Object[] dados = {imagem, p.getNome(), p.getMarca(), p.getDescricao(), p.getQuantidade(), String.format("R$ %.2f", p.getValor())};
                modelo.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto(s) não encontrado(s)!");
        }
    }
    
    public void inicializarProdutos() {
        comprarAgora.setVisible(false);
        
        if(indiceUsuario != -1){
            List<String> interesses = admin.procurarUserIndice(indiceUsuario).getInteresse();
            List<Produto> produtos = admin.getProdutos();
            for(Produto p: produtos){
                if(interesses.contains(p.getCategoria())){
                    this.produtos.add(p);
                }
            } 
        } else{
            this.produtos = admin.getProdutos();
        }
        listarNaTabela();
    }

    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarActionPerformed
        admin.recuperaDados();
        desligarBotoes();
        
        produtos = admin.procurarProduto(nomeProduto.getText());
        listarNaTabela();
    }//GEN-LAST:event_botaoProcurarActionPerformed

    private void botaoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCarrinhoActionPerformed
        admin.recuperaDados();
        if (indiceUsuario != -1) { 
            desligarBotoes();
            comprarAgora.setVisible(true);
            removerCarrinho.setVisible(true);
            List<Produto> produtosAchados = new ArrayList<Produto>();
            for(String s: admin.procurarUserIndice(indiceUsuario).getCarrinho()){
                for(Produto p: admin.getProdutos()){
                    if(p.getNome().equals(s)){
                        produtosAchados.add(p);
                    }
                }
            }
            
            produtos = produtosAchados;
            
            listarNaTabela();      
        } else {
            JOptionPane.showMessageDialog(null, "Crie uma conta para fazer seu carrinho em nosso site.");
        }

    }//GEN-LAST:event_botaoCarrinhoActionPerformed

    private void adicionaCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionaCarrinhoActionPerformed
        if (indiceUsuario != -1) {
            int click = tabelaUsuario.getSelectedRow();
            if (click != -1) {
                Produto p = produtos.get(click);
                admin.procurarUserIndice(indiceUsuario).addCarrinho(p.getNome());
                admin.gravaDados();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Crie uma conta para fazer seu carrinho em nosso site.");
        }
    }//GEN-LAST:event_adicionaCarrinhoActionPerformed

    private void botaoFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFavoritosActionPerformed
        admin.recuperaDados();
        if (indiceUsuario != -1) {
            desligarBotoes();
            removerFavoritos.setVisible(true);

            List<Produto> produtosAchados = new ArrayList<Produto>();
            for(String s: admin.procurarUserIndice(indiceUsuario).getFavoritos()){
                for(Produto p: admin.getProdutos()){
                    if(p.getNome().equals(s)){
                        produtosAchados.add(p);
                    }
                }
            }
            
            produtos = produtosAchados;
            
            listarNaTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Crie uma conta para fazer seu carrinho em nosso site.");
        }

    }//GEN-LAST:event_botaoFavoritosActionPerformed

    private void pesquisarPorCategoria(String categoria) {
        admin.recuperaDados();
        desligarBotoes();

        produtos = admin.procurarProdutoCategoria(categoria);

        listarNaTabela();
    }

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        new Interface().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void backgroundUserComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_backgroundUserComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_backgroundUserComponentHidden

    private void adicionarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarFavoritoActionPerformed
        if (indiceUsuario != -1) {
            int click = tabelaUsuario.getSelectedRow();
            if (click != -1) {
                admin.procurarUserIndice(indiceUsuario).addFavorito(produtos.get(click).getNome());
                admin.gravaDados();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Crie uma conta para fazer seu carrinho em nosso site.");
        }

    }//GEN-LAST:event_adicionarFavoritoActionPerformed
    
    public void atualizarCarrinho(){
        botaoCarrinho.doClick();
    }
    
    private void comprarAgoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarAgoraActionPerformed
        if(produtos.size() > 0){ 
            Pagamento pagamento = new Pagamento();
            pagamento.setVisible(true);
            pagamento.setPagamento(indiceUsuario, produtos);
        } else{
            JOptionPane.showMessageDialog(null, "Carrinho vazio!");
        }
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

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
        new CadastroUsuario().setVisible(true);
        new Interface().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastrarActionPerformed

    private void removerCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerCarrinhoActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();
        int click = tabelaUsuario.getSelectedRow();
        if(click != -1){
            admin.procurarUserIndice(indiceUsuario).removeProduto(click);
            modelo.removeRow(click);
            admin.gravaDados();
        }
    }//GEN-LAST:event_removerCarrinhoActionPerformed

    private void removerFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerFavoritosActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();
        int click = tabelaUsuario.getSelectedRow();
        if(click != -1){
            admin.procurarUserIndice(indiceUsuario).removeFavorito(click);
            modelo.removeRow(click);
            admin.gravaDados();
        }
    }//GEN-LAST:event_removerFavoritosActionPerformed

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
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton comprarAgora;
    private javax.swing.JButton eletrodomesticos;
    private javax.swing.JButton esporteLazer;
    private javax.swing.JButton games;
    private javax.swing.JButton industriaComercio;
    private javax.swing.JButton informatica;
    private javax.swing.JLabel inicial;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modaAcessorios;
    private javax.swing.JButton moveisDecoracao;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JButton removerCarrinho;
    private javax.swing.JButton removerFavoritos;
    private javax.swing.JButton sair;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JLabel user;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
