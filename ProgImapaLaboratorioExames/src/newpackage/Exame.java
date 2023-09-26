package newpackage;

// Importa a classe JOptionPane do pacote javax.swing, que é usada para exibir caixas de diálogo na interface gráfica do Swing
import javax.swing.JOptionPane;

// Classe abstrata e instância variáveis privadas para encapsular os dados e evitar acesso direto a elas de fora da classe
public abstract class Exame {
  private String nome;
  private String tipoSangue;
  private int anoNascimento;
  private final int hoje = 2023;
  private int idade;

  // Método getter que permite acessar o valor da variável nome a partir de outras classes.
  public String getnome() {
    return nome;
  }

  // Método setter que permite definir o valor da variável nome, com a convenção de que o nome será armazenado em maiúsculas
  public void setnome(String nome) {
    this.nome = nome.toUpperCase();
  }

  // Método getter para a variável tipoSangue
  public String gettipoSangue() {
    return tipoSangue;
  }
  // Método setter para a variável tipoSangue, seguindo a mesma convenção de armazenamento em maiúsculas
  public void settipoSangue(String tipoSangue) {
    this.tipoSangue = tipoSangue.toUpperCase();
  }
  
  // Método getter para a variável anoNascimento
  public int getanoNascimento() {
    return anoNascimento;
  }
  
  // Método setter para a variável anoNascimento. O setter calcula a idade do paciente com base no ano de nascimento fornecido
  public void setanoNascimento(int anoNascimento) {
    this.idade = hoje - anoNascimento;
    this.anoNascimento = idade;
  }

  // Método getter para a variável idade
  public int getIdade() {
    return idade;
  }

  // Método setter para a variável idade
  public void setIdade(int idade) {
    this.idade = idade;
  }
  
   // Método cadastrarExame(). Ele solicita informações do paciente usando caixas de diálogo do JOptionPane, em seguida, chama os métodos setters para armazenar essas informações nas variáveis da classe Exame
   public void cadastrarExame(){
        String Nome = (JOptionPane.showInputDialog("Informe o nome do paciente:"));
        this.setnome(Nome);
        String TipoSangue = (JOptionPane.showInputDialog("Informe o tipo sanguíneo:"));
        this.settipoSangue(TipoSangue);
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento:"));
        this.setanoNascimento(ano);
    } 
}
