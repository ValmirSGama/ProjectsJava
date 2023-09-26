package newpackage;

// Importa a classe JOptionPane do pacote javax.swing, que é usada para exibir caixas de diálogo na interface gráfica do Swing
import javax.swing.JOptionPane;

// Declaração da classe Colesterol que estende a classe abstrata Exame, o que significa que Colesterol herda todos os campos e métodos de Exame e pode adicionar funcionalidades específicas à classe Colesterol
public class Colesterol extends Exame {
 
  // variáveis privadas de instância específicas 
  private double quantidadeLDL;
  private double quantidadeHDL;
  private char risco;
  private String resultadoLDL, resultadoHDL;

  // Método getter para a variável quantidadeLDL, permitindo acessar seu valor
  public double getQuantidadeLDL() {
    return quantidadeLDL;
  }

  // Método setter para a variável quantidadeLDL, permitindo definir seu valor
  public void setQuantidadeLDL(double quantidadeLDL) {
    this.quantidadeLDL = quantidadeLDL;
  }

  // Método getter para a variável quantidadeHDL, permitindo acessar seu valor
  public double getQuantidadeHDL() {
    return quantidadeHDL;
  }

  // Método setter para a variável quantidadeHDL, permitindo definir seu valor
  public void setQuantidadeHDL(double quantidadeHDL) {
    this.quantidadeHDL = quantidadeHDL;
  }
  // Método getter para a variável risco, permitindo acessar seu valor
  public char getRisco() {
    return risco;
  }

  // Método setter para a variável risco, permitindo definir seu valor
  public void setRisco(char risco) {
    this.risco = risco;
  }
  
  // Método classificarResultado() verifica a quantidade de HDL, a idade do paciente e o nível de    risco para classificar tanto o HDL quanto o LDL como bons ou ruins
  public void classificarResultado(){
    
    if ((super.getanoNascimento() <= 19 && this.getQuantidadeHDL() > 45) || (super.getanoNascimento() >= 20 && this.getQuantidadeHDL() > 40)){
    resultadoHDL = "HDL - BOM";
  }else{
      resultadoHDL = "HDL - RUIM";
    }
   
    if ((risco == 'A') && ( getQuantidadeLDL() < 50)){
      resultadoLDL = "LDL - BOM";
    } else if ((risco == 'M') && (getQuantidadeLDL() < 70)){
      resultadoLDL = "LDL - BOM";
    }else if ((risco == 'B') && (getQuantidadeLDL() < 100)){
      resultadoLDL = "LDL - BOM";
    }else{
      resultadoLDL = "LDL - RUIM";
    }
}
  
   // Método mostrarResultado() chama o método classificarResultado() para determinar os resultados do HDL e LDL, em seguida, cria uma mensagem com informações do paciente e resultados dos exames e exibe-o em uma caixa de diálogo
   public void mostrarResultado(){
      classificarResultado();
      String messagem = "Nome: " + super.getnome() + "\nIdade: " + super.getanoNascimento() + " ano(s)" + "\nTipo de sangue: " + super.gettipoSangue() + "\nValor HDL: " + this.getQuantidadeHDL() + " mg/dL\nValor LDL: " + this.getQuantidadeLDL() + " mg/dL\nRisco: " + this.getRisco() + "\n" + resultadoHDL + "\n" + resultadoLDL;
     JOptionPane.showMessageDialog(null, messagem);
  }
  
  // Método cadastrarExame() sobrescreve o método da classe pai Exame. Ele chama o método cadastrarExame() da classe pai usando super.cadastrarExame() para obter informações básicas do paciente e, em seguida, solicita as quantidades de HDL e LDL e o nível de risco, definindo esses valores usando os setters correspondentes
  @Override
  public void cadastrarExame(){
    super.cadastrarExame();
    
    double entradaHDL = Double.parseDouble(JOptionPane.showInputDialog("Quantidade HDL: "));
    this.setQuantidadeHDL(entradaHDL);
     
    double entradaLDL = Double.parseDouble(JOptionPane.showInputDialog("Quantidade LDL: "));
    this.setQuantidadeLDL(entradaLDL);
    
    String nivelRisco = JOptionPane.showInputDialog("Informe o risco (B - baixo, M - médio, A - alto):").toUpperCase();
    char NivelRisco = nivelRisco.charAt(0);
    this.setRisco(NivelRisco);
  }
}
  
  
