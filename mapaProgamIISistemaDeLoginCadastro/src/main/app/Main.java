package main.app;

import example.gui.LoginFrame;

public class Main {
    public static void main(String[] args){
      
         //Cria e exibe o formulário
         java.awt.EventQueue.invokeLater(() -> {
      // Define a visibilidade da tela de login como verdadeira para exibi-la
      new LoginFrame().setVisible(true);
    });
    }
}
