package example.gui;

import example.dao.UserDAO;

public class LoginFrame extends javax.swing.JFrame {

   private final UserDAO usuarioDAO; // Instância do UserDAO para acessar o banco de dados
   
  public LoginFrame() {
    initComponents(); // Inicializa os componentes da interface gráfica
    usuarioDAO = new UserDAO(); // Inicializa o UserDAO
    this.setLocationRelativeTo(null); // Centraliza a janela na tela
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabelTeladeLogin = new javax.swing.JLabel();
    jLabelLogin = new javax.swing.JLabel();
    jLabelSenha = new javax.swing.JLabel();
    jButtonCadastrarNovoUsuario = new javax.swing.JButton();
    jButtonEntrar = new javax.swing.JButton();
    jTextFieldLogin = new javax.swing.JTextField();
    jPasswordFieldSenha = new javax.swing.JPasswordField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Login");

    jLabelTeladeLogin.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jLabelTeladeLogin.setText("Tela de Login");

    jLabelLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jLabelLogin.setText("Login:");

    jLabelSenha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jLabelSenha.setText("Senha:");

    jButtonCadastrarNovoUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jButtonCadastrarNovoUsuario.setText("Cadastrar Novo Usuário");
    jButtonCadastrarNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonCadastrarNovoUsuarioActionPerformed(evt);
      }
    });

    jButtonEntrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jButtonEntrar.setText("Entrar");
    jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonEntrarActionPerformed(evt);
      }
    });

    jTextFieldLogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

    jPasswordFieldSenha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
    jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jPasswordFieldSenhaActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelLogin))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(122, 122, 122)
            .addComponent(jLabelTeladeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(180, 180, 180)
            .addComponent(jButtonEntrar))
          .addGroup(layout.createSequentialGroup()
            .addGap(81, 81, 81)
            .addComponent(jButtonCadastrarNovoUsuario)))
        .addContainerGap(83, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabelTeladeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(51, 51, 51)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelLogin)
          .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelSenha)
          .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jButtonEntrar)
        .addGap(18, 18, 18)
        .addComponent(jButtonCadastrarNovoUsuario)
        .addContainerGap(21, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Método chamado quando o botão "Cadastrar Novo Usuário" é clicado
  private void jButtonCadastrarNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarNovoUsuarioActionPerformed
     // Cria uma instância da tela de cadastro (RegisterFrame)
    RegisterFrame registerFrame = new RegisterFrame();
    
    // Define a visibilidade da tela de cadastro como verdadeira para exibi-la
    registerFrame.setVisible(true);
    
    // Fecha a tela de login 
    this.dispose();
  }//GEN-LAST:event_jButtonCadastrarNovoUsuarioActionPerformed

  private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
     // Chama a ação do botão "Entrar" quando a tecla "Enter" for pressionada após campo de senha
    jButtonEntrarActionPerformed(evt);
  }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

  // Método chamado quando o botão "Entrar" é clicado
  private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
    String login = jTextFieldLogin.getText(); // Obtém o login inserido pelo usuário
        String senha = new String(jPasswordFieldSenha.getPassword()); // Obtém a senha inserida pelo usuário

        if (!login.isEmpty() && !senha.isEmpty()) {
            if (usuarioDAO.validarLogin(login, senha)) {
                // Exibi Acesso autorizado
                javax.swing.JOptionPane.showMessageDialog(this, "Acesso Autorizado");
            } else {
                // Exibi Acesso negado
                javax.swing.JOptionPane.showMessageDialog(this, "Acesso Negado");
            }
        } else {
            // Exibi mensagem de erro se algum campo estiver vazio
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
        }
  }//GEN-LAST:event_jButtonEntrarActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonCadastrarNovoUsuario;
  private javax.swing.JButton jButtonEntrar;
  private javax.swing.JLabel jLabelLogin;
  private javax.swing.JLabel jLabelSenha;
  private javax.swing.JLabel jLabelTeladeLogin;
  private javax.swing.JPasswordField jPasswordFieldSenha;
  private javax.swing.JTextField jTextFieldLogin;
  // End of variables declaration//GEN-END:variables
}
