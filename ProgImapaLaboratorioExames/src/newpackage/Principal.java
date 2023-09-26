package newpackage;

// declaração da classe principal
public class Principal {
  
  public static void main(String args[]){
   
      // Cria uma instância da classe Glicemia.
      // Em seguida, chama o método "cadastrarExame()" 
      // Por fim, chama o método "mostrarResultado()" 
      Glicemia g = new Glicemia();
      g.cadastrarExame();
      g.mostrarResultado();
    
      // Cria uma instância da classe Colesterol.
      // Em seguida, chama o método "cadastrarExame()"
      // Por fim, chama o método "mostrarResultado()" 
      Colesterol c = new Colesterol();
      c.cadastrarExame();
      c.mostrarResultado();
      
      // Cria uma instância da classe Triglicerideos.
      // Em seguida, chama o método "cadastrarExame()" 
      // Por fim, chama o método "mostrarResultado()" 
      Triglicerideos t = new Triglicerideos();
      t.cadastrarExame();
      t.mostrarResultado();
  }
}
