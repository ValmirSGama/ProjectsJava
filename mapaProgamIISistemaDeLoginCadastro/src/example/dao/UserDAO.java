package example.dao;

import example.db.DatabaseConnection;
import example.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    
   // Método para validar o login
    public boolean validarLogin(String login, String senha) {
      
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                 "SELECT id, nome, login, senha, email FROM usuario WHERE login = ? AND senha = ?"
             )) {

            // Parâmetros para a consulta SQL
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, senha);
            
            // Executa a consulta e obtém o resultado
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // Retorna verdadeiro se houver um resultado, falso caso contrário
            return resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao validar o login", e);
        }
    }

    // Método para validar o cadastrar
    public void cadastrarUsuario(User user) {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                 "INSERT INTO usuario (nome, login, senha, email) VALUES (?, ?, ?, ?)"
             )) {

            // Define os parâmetros para a inserção
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getSenha());
            preparedStatement.setString(4, user.getEmail());

            // Executa a inserção
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar usuário", e);
        }
    }
}
