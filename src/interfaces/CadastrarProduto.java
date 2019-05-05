
package interfaces;

import infinitystore.com.LojaAdmin;
import infinitystore.com.Produto;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CadastrarProduto extends javax.swing.JFrame {
    private LojaAdmin admin = new LojaAdmin();
    
    public CadastrarProduto() {
        admin.recuperaDados();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        marca = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        valor = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        quantidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        diretorio = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        modaAcessorio = new javax.swing.JRadioButton();
        eletrodomesticos = new javax.swing.JRadioButton();
        informatica = new javax.swing.JRadioButton();
        moveisDecoracao = new javax.swing.JRadioButton();
        industriaComercio = new javax.swing.JRadioButton();
        esporteLazer = new javax.swing.JRadioButton();
        games = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(683, 291));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marca.setBackground(new java.awt.Color(26, 26, 26));
        marca.setFont(new java.awt.Font("Glober SemiBold Free", 0, 13)); // NOI18N
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setBorder(null);
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });
        getContentPane().add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 133, 170, 20));

        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 289, 80, 22));

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 289, 80, 22));

        valor.setBackground(new java.awt.Color(26, 26, 26));
        valor.setFont(new java.awt.Font("Glober SemiBold Free", 0, 13)); // NOI18N
        valor.setForeground(new java.awt.Color(255, 255, 255));
        valor.setBorder(null);
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 250, 80, 20));

        nome.setBackground(new java.awt.Color(26, 26, 26));
        nome.setFont(new java.awt.Font("Glober SemiBold Free", 0, 13)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setBorder(null);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 88, 170, 20));

        descricao.setBackground(new java.awt.Color(26, 26, 26));
        descricao.setColumns(1);
        descricao.setFont(new java.awt.Font("Glober SemiBold Free", 0, 13)); // NOI18N
        descricao.setForeground(new java.awt.Color(255, 255, 255));
        descricao.setLineWrap(true);
        descricao.setBorder(null);
        descricao.setOpaque(false);
        jScrollPane1.setViewportView(descricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, 50));

        quantidade.setBackground(new java.awt.Color(26, 26, 26));
        quantidade.setForeground(new java.awt.Color(255, 255, 255));
        quantidade.setBorder(null);
        getContentPane().add(quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 250, 50, 20));

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 256, 25, 25));

        diretorio.setEditable(false);
        diretorio.setBackground(new java.awt.Color(77, 77, 77));
        diretorio.setFont(new java.awt.Font("Glober SemiBold Free", 0, 13)); // NOI18N
        diretorio.setForeground(new java.awt.Color(255, 255, 255));
        diretorio.setBorder(null);
        diretorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diretorioActionPerformed(evt);
            }
        });
        getContentPane().add(diretorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 260, 100, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        modaAcessorio.setBackground(new java.awt.Color(245, 127, 42));
        modaAcessorio.setBorder(null);
        modaAcessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modaAcessorioActionPerformed(evt);
            }
        });
        getContentPane().add(modaAcessorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        eletrodomesticos.setBackground(new java.awt.Color(245, 127, 42));
        eletrodomesticos.setBorder(null);
        eletrodomesticos.setFocusPainted(false);
        eletrodomesticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eletrodomesticosActionPerformed(evt);
            }
        });
        getContentPane().add(eletrodomesticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        informatica.setBackground(new java.awt.Color(245, 127, 42));
        informatica.setBorder(null);
        informatica.setFocusPainted(false);
        informatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informaticaActionPerformed(evt);
            }
        });
        getContentPane().add(informatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        moveisDecoracao.setBackground(new java.awt.Color(245, 127, 42));
        moveisDecoracao.setBorder(null);
        moveisDecoracao.setFocusPainted(false);
        moveisDecoracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveisDecoracaoActionPerformed(evt);
            }
        });
        getContentPane().add(moveisDecoracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        industriaComercio.setBackground(new java.awt.Color(245, 127, 42));
        industriaComercio.setBorder(null);
        industriaComercio.setFocusPainted(false);
        industriaComercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                industriaComercioActionPerformed(evt);
            }
        });
        getContentPane().add(industriaComercio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        esporteLazer.setBackground(new java.awt.Color(245, 127, 42));
        esporteLazer.setBorder(null);
        esporteLazer.setFocusPainted(false);
        esporteLazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esporteLazerActionPerformed(evt);
            }
        });
        getContentPane().add(esporteLazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        games.setBackground(new java.awt.Color(245, 127, 42));
        games.setBorder(null);
        games.setFocusPainted(false);
        games.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesActionPerformed(evt);
            }
        });
        getContentPane().add(games, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastrar Produto back.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -18, -1, -1));

        setSize(new java.awt.Dimension(694, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nomeProduto = nome.getText();
        String marcaProduto = marca.getText();
        String categoria = categoria();
        String descricaoProduto = descricao.getText();
        String url = diretorio.getText();
        
        try{
            int quant = Integer.parseInt(quantidade.getText());
            double valorProduto = Double.parseDouble(valor.getText());
            if(!nomeProduto.equals("") && !marcaProduto.equals("") && !url.equals("") && categoria != null){
                BufferedImage imagem = null;
                String urlGravada = "/home/marcio/Documents/Projetos Java/LojaVirtual/src/imagensProdutos/" + nomeProduto + ".png";
                try {
                    imagem = ImageIO.read(new File(url));
                    ImageIO.write(imagem, "jpg", new File(urlGravada));
                } catch (IOException ex) {
                    System.out.println("Erro na imagem");;
                }
                Produto produto = new Produto(nomeProduto, marcaProduto, categoria, descricaoProduto, quant, urlGravada, valorProduto);
                String status = admin.addProduto(produto);
                admin.gravaDados();
                String mensagem = String.format(" no valor de R$ %.2f", valorProduto);
                JOptionPane.showMessageDialog(null, "Produto " + status + mensagem + "."); 
            } else{
                JOptionPane.showMessageDialog(null, "Dados inválidos!");
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }     
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void desmarcarBotoes(){
        modaAcessorio.setSelected(false);
        eletrodomesticos.setSelected(false);
        informatica.setSelected(false);
        moveisDecoracao.setSelected(false);
        industriaComercio.setSelected(false);
        games.setSelected(false);
        esporteLazer.setSelected(false);
    }
    
    private String categoria(){
        if(modaAcessorio.isSelected()){
            return "moda e acessorios";
        }else if(eletrodomesticos.isSelected()){
            return "eletrodomesticos";
        }else if(informatica.isSelected()){
            return "informatica";
        }else if(moveisDecoracao.isSelected()){
            return "moveis e decoracao";
        }else if(industriaComercio.isSelected()){
            return "industria e comercio";
        }else if(games.isSelected()){
            return "games";
        }else if(esporteLazer.isSelected()){
            return "esporte e lazer";
        }
        return null;
    }
    
    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Procurar imagem");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "jpg", "png");
        fileChooser.setFileFilter(filter);
        int retorno = fileChooser.showOpenDialog(this);
        if(retorno == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            diretorio.setText(file.getPath());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modaAcessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modaAcessorioActionPerformed
        desmarcarBotoes();
        modaAcessorio.setSelected(true);
    }//GEN-LAST:event_modaAcessorioActionPerformed

    private void eletrodomesticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eletrodomesticosActionPerformed
        desmarcarBotoes();
        eletrodomesticos.setSelected(true);
    }//GEN-LAST:event_eletrodomesticosActionPerformed

    private void informaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informaticaActionPerformed
        desmarcarBotoes();
        informatica.setSelected(true);
    }//GEN-LAST:event_informaticaActionPerformed

    private void moveisDecoracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveisDecoracaoActionPerformed
        desmarcarBotoes();
        moveisDecoracao.setSelected(true);
    }//GEN-LAST:event_moveisDecoracaoActionPerformed

    private void industriaComercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_industriaComercioActionPerformed
        desmarcarBotoes();
        industriaComercio.setSelected(true);
    }//GEN-LAST:event_industriaComercioActionPerformed

    private void gamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesActionPerformed
        desmarcarBotoes();
        games.setSelected(true);
    }//GEN-LAST:event_gamesActionPerformed

    private void esporteLazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esporteLazerActionPerformed
        desmarcarBotoes();
        esporteLazer.setSelected(true);
    }//GEN-LAST:event_esporteLazerActionPerformed

    private void diretorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diretorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diretorioActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
        
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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea descricao;
    private javax.swing.JTextField diretorio;
    private javax.swing.JRadioButton eletrodomesticos;
    private javax.swing.JRadioButton esporteLazer;
    private javax.swing.JRadioButton games;
    private javax.swing.JRadioButton industriaComercio;
    private javax.swing.JRadioButton informatica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField marca;
    private javax.swing.JRadioButton modaAcessorio;
    private javax.swing.JRadioButton moveisDecoracao;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
