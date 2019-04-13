
package interfaces;

import infinitystore.com.LojaAdmin;
import javax.swing.JOptionPane;

public class CadastroUsuario extends javax.swing.JFrame {
    private LojaAdmin admin = new LojaAdmin();
    
    public CadastroUsuario() {
        admin.recuperaDados();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        modaAcessorio = new javax.swing.JRadioButton();
        eletrodomesticos = new javax.swing.JRadioButton();
        informatica = new javax.swing.JRadioButton();
        moveisDecoracao = new javax.swing.JRadioButton();
        industriaComercio = new javax.swing.JRadioButton();
        esporteLazer = new javax.swing.JRadioButton();
        games = new javax.swing.JRadioButton();
        nome = new javax.swing.JTextField();
        sobrenome = new javax.swing.JTextField();
        nomeDeUsuario = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrar.setBackground(new java.awt.Color(26, 26, 26));
        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadastrarUsu.png"))); // NOI18N
        cadastrar.setBorder(null);
        cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 283, -1, -1));

        cancelar.setBackground(new java.awt.Color(26, 26, 26));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancelar Cadastro.png"))); // NOI18N
        cancelar.setBorder(null);
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 283, -1, -1));
        getContentPane().add(modaAcessorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 84, -1, -1));
        getContentPane().add(eletrodomesticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 100, -1, -1));
        getContentPane().add(informatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 117, -1, -1));
        getContentPane().add(moveisDecoracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 135, -1, -1));
        getContentPane().add(industriaComercio, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 153, -1, -1));
        getContentPane().add(esporteLazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 187, -1, -1));
        getContentPane().add(games, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 170, -1, -1));

        nome.setBackground(new java.awt.Color(26, 26, 26));
        nome.setFont(new java.awt.Font("Glober SemiBold Free", 0, 12)); // NOI18N
        nome.setForeground(new java.awt.Color(254, 254, 254));
        nome.setBorder(null);
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 90, 180, 20));

        sobrenome.setBackground(new java.awt.Color(26, 26, 26));
        sobrenome.setFont(new java.awt.Font("Glober SemiBold Free", 0, 12)); // NOI18N
        sobrenome.setForeground(new java.awt.Color(254, 254, 254));
        sobrenome.setBorder(null);
        getContentPane().add(sobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 140, 180, 20));

        nomeDeUsuario.setBackground(new java.awt.Color(26, 26, 26));
        nomeDeUsuario.setFont(new java.awt.Font("Glober SemiBold Free", 0, 12)); // NOI18N
        nomeDeUsuario.setForeground(new java.awt.Color(254, 254, 254));
        nomeDeUsuario.setBorder(null);
        getContentPane().add(nomeDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 191, 180, 20));

        senha.setBackground(new java.awt.Color(26, 26, 26));
        senha.setForeground(new java.awt.Color(254, 254, 254));
        senha.setBorder(null);
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 240, 180, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cadastro dos Usuários.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -18, -1, -1));

        setSize(new java.awt.Dimension(693, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
        String status = admin.addUsuario(nome.getText(), sobrenome.getText(), nomeDeUsuario.getText(), senha.getText());
        JOptionPane.showMessageDialog(null, status);
        admin.gravaDados();
    }//GEN-LAST:event_cadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JRadioButton eletrodomesticos;
    private javax.swing.JRadioButton esporteLazer;
    private javax.swing.JRadioButton games;
    private javax.swing.JRadioButton industriaComercio;
    private javax.swing.JRadioButton informatica;
    private javax.swing.JRadioButton modaAcessorio;
    private javax.swing.JRadioButton moveisDecoracao;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nomeDeUsuario;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField sobrenome;
    // End of variables declaration//GEN-END:variables
}
