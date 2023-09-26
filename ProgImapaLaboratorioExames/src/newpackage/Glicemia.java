package newpackage;

// Importa a classe JOptionPane do pacote javax.swing, que é usada para exibir caixas de diálogo na interface gráfica do Swingimport javax.swing.JOptionPane;

import javax.swing.JOptionPane;


// Classe Glicemia que estende a classe abstrata Exame, o que significa que Glicemia herda todos os campos e métodos de Exame e pode adicionar funcionalidades específicas à classe Glicemia.
public class Glicemia extends Exame {
  
  private double quantidadeGlicose; // Variável privada usada para armazenar a quantidade de glicose
  private String retornoGlicose; // Variável privada usada para armazenar o resultado da classificação

  // Método getter para a variável quantidadeGlicose, permitindo acessar seu valor
  public double getQuantidadeGlicose() {
    return quantidadeGlicose;
  }

  // Método setter para a variável quantidadeGlicose, permitindo definir seu valor
  public void setQuantidadeGlicose(double quantidadeGlicose) {
    this.quantidadeGlicose = quantidadeGlicose;
  }
  
  // Método classificarResultado() verifica a quantidade de glicose e classifica o resultado com base em critérios específicos
  public void classificarResultado(){
    if (this.getQuantidadeGlicose() < 100){
      retornoGlicose = "Normoglicemia";
    }else if(this.getQuantidadeGlicose() < 126){
      retornoGlicose = "Pré-diabetes";
    }else{
      retornoGlicose = "Diabetes estabelecido";
    }
  }
  
  // Método mostrarResultado() chama o método classificarResultado() para determinar o resultado da glicemia, em seguida, cria uma mensagem com informações do paciente e resultado da glicose e exibe-o em uma caixa de diálogo
  public void mostrarResultado(){
      classificarResultado();
      String messagem = "Nome: " + super.getnome() + "\nIdade: " + super.getanoNascimento() + " ano(s)" + "\nTipo de sangue: " + super.gettipoSangue() + "\nResultado Glicose: " + this.getQuantidadeGlicose() + " mg/dL\n" + retornoGlicose;
     JOptionPane.showMessageDialog(null, messagem);
  }
  
  // Método cadastrarExame() sobrescreve o método da classe pai Exame. Ele chama o método cadastrarExame() da classe pai usando super.cadastrarExame() para obter informações básicas do paciente e, em seguida, solicita a quantidade de glicose e a define usando o setter setQuantidadeGlicose()
  @Override
  public void cadastrarExame(){
    super.cadastrarExame();
    double glicose = Double.parseDouble(JOptionPane.showInputDialog("Quantidade Glicose"));
    this.setQuantidadeGlicose(glicose);
  }
}
