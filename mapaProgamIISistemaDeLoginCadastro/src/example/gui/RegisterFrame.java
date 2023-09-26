package example.gui;

import example.dao.UserDAO;
import example.model.User;

public class RegisterFrame extends javax.swing.JFrame {

  private final UserDAO usuarioDAO; // Instância do UserDAO para acessar o banco de dados
  
  public RegisterFrame() {
    initComponents(); // Inicializa os componentes da interface gráfica
    usuarioDAO = new UserDAO(); // Inicializa o UserDAO
    this.setLocationRelativeTo(null); // Centraliza a janela na tela
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
    jLabelCadastroUsuario = new javax.swing.JLabel();
    jLabelNome = new javax.swing.JLabel();
    jLabelLogin = new javax.swing.JLabel();
    jLabelSenha = new javax.swing.JLabel();
    jLabelEmail = new javax.swing.JLabel();
    botaoSalvar = new javax.swing.JButton();
    campoNome = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    campoLogin = new javax.swing.JTextField();
    campoSenha = new javax.swing.JPasswordField();
    campoEmail = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro");
    setName("Cadastro"); // NOI18N
    setResizable(false);

    jLabelCadastroUsuario.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
    jLabelCadastroUsuario.setText("Cadastrar novo Usuário");

    jLabelNome.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jLabelNome.setText("Nome:");

    jLabelLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jLabelLogin.setText("Login:");

    jLabelSenha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jLabelSenha.setText("Senha:");

    jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    jLabelEmail.setText("Email:");

    botaoSalvar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
    botaoSalvar.setText("Salvar");
    botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botaoSalvarActionPerformed(evt);
      }
    });

    campoNome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

    jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

    campoLogin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

    campoSenha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

    campoEmail.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addGap(57, 57, 57)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))))
          .addGroup(layout.createSequentialGroup()
            .addGap(92, 92, 92)
            .addComponent(jLabelCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(207, 207, 207)
            .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(31, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabelCadastroUsuario)
        .addGap(30, 30, 30)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelNome)
          .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6)
          .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelSenha)
          .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelEmail)
          .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(botaoSalvar)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Método chamado quando o botão "Salvar" é clicado
  private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
     String nome = campoNome.getText(); // Obtém o nome inserido pelo usuário
        String login = campoLogin.getText(); // Obtém o login inserido pelo usuário
        String senha = new String(campoSenha.getPassword()); // Obtém a senha inserida pelo usuário
        String email = campoEmail.getText(); // Obtém o email inserido pelo usuário

        if (!nome.isEmpty() && !login.isEmpty() && !senha.isEmpty() && !email.isEmpty()) {
            User user = new User(nome, login, senha, email);  // Cria um objeto User com os dados inseridos
            usuarioDAO.cadastrarUsuario(user); // Chama o método do UserDAO para cadastrar o usuário no banco de dados

            // Exibi mensagem de sucesso
            javax.swing.JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso.");
            this.dispose(); // Fecha a tela de cadastro
        } else {
            // Exibi mensagem de erro se algum campo estiver vazio
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
        }
  }//GEN-LAST:event_botaoSalvarActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton botaoSalvar;
  private javax.swing.JTextField campoEmail;
  private javax.swing.JTextField campoLogin;
  private javax.swing.JTextField campoNome;
  private javax.swing.JPasswordField campoSenha;
  private javax.swing.Box.Filler filler1;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabelCadastroUsuario;
  private javax.swing.JLabel jLabelEmail;
  private javax.swing.JLabel jLabelLogin;
  private javax.swing.JLabel jLabelNome;
  private javax.swing.JLabel jLabelSenha;
  // End of variables declaration//GEN-END:variables
}
