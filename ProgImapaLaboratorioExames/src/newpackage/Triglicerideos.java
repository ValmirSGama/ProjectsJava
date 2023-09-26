package newpackage;

// Importa a classe JOptionPane do pacote javax.swing, que é usada para exibir caixas de diálogo na interface gráfica do Swing
import javax.swing.JOptionPane;

// Classe Triglicerideos que estende a classe abstrata Exame, o que significa que Triglicerideos herda todos os campos e métodos de Exame e pode adicionar funcionalidades específicas à classe Triglicerideos
public class Triglicerideos extends Exame {
  
  // variáveis privadas de instância específicas
  private double quantidadeTriglicerideos;
  private String resultado;

  // Método getter para a variável quantidadeTriglicerideos, permitindo acessar seu valor
  public double getQuantidadeTriglicerideos() {
    return quantidadeTriglicerideos;
  }

  // Método setter para a variável quantidadeTriglicerideos, permitindo definir seu valor
  public void setQuantidadeTriglicerideos(double quantidadeTriglicerideos) {
    this.quantidadeTriglicerideos = quantidadeTriglicerideos;
  }
  
  // Este método classifica o resultado do exame de triglicerídeos com base na idade do paciente e nos valores de referência.
  // Ele verifica a idade do paciente usando super.getanoNascimento() e a quantidade de triglicerídeos usando getQuantidadeTriglicerideos().
  // Em seguida, atribui uma mensagem de resultado com base nas condições fornecidas.
  // Se a idade estiver dentro do intervalo especificado e a quantidade de triglicerídeos estiver abaixo do limite, o resultado é "Triglicerídeos: BOM".
  // Caso contrário, o resultado é "Triglicerídeos: RUIM".
  public void classificarResultado(){
    
    if (super.getanoNascimento() <= 9 && this.getQuantidadeTriglicerideos() < 75){
      resultado = "Triglicerideos: BOM";
    } else if ((super.getanoNascimento() >= 10 && super.getanoNascimento() <= 19) && getQuantidadeTriglicerideos() < 90){
      resultado = "Triglicerideos: BOM";
    }else if (super.getanoNascimento() > 20 && getQuantidadeTriglicerideos() < 150){
      resultado = "Triglicerideos: BOM";
    }else{
      resultado = "Triglicerideos  RUIM";
    }
  }
  
  
  // Método que exibe o resultado da classificação dos triglicerídeos de uma pessoa,
  // incluindo informações como nome, idade, tipo de sangue e quantidade de triglicerídeos.
  // Ele utiliza a classificarResultado() para determinar a classificação com base na quantidade de triglicerídeos
  // e depois exibe todas essas informações em uma caixa de diálogo usando JOptionPane.
   public void mostrarResultado(){
      classificarResultado();
      String messagem = "Nome: " + super.getnome() + "\nIdade: " + super.getanoNascimento() + " ano(s)" + "\nTipo de sangue: " + super.gettipoSangue() + "\nResultado Triglicerideos: " + this.getQuantidadeTriglicerideos() + " mg/dL\n" + resultado;
     JOptionPane.showMessageDialog(null, messagem);
  }
   
   
  // Este método é uma sobreposição do método cadastrarExame() da classe pai (super.cadastrarExame()).
  // Ele solicita ao usuário a quantidade de triglicerídeos por meio de uma caixa de diálogo de entrada.
  // Em seguida, define essa quantidade de triglicerídeos usando o método setQuantidadeTriglicerideos().
  @Override
  public void cadastrarExame(){
    super.cadastrarExame();
    double triglicerideos = Double.parseDouble(JOptionPane.showInputDialog("Quantidade Triglicerideos"));
    this.setQuantidadeTriglicerideos(triglicerideos);
  } 
}
