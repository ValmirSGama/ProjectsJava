 package example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // URL de conexão com o banco de dados MySQL
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mapa";
    // Nome de usuário do banco de dados
    private static final String DB_USERNAME = "root";
    // Senha do banco de dados
    private static final String DB_PASSWORD = "entrar";
    // Método público para obter uma conexão com o banco de dados
    public static Connection getConnection() {
      
        try {
            // Estabelece uma conexão com o banco de dados usando as informações de URL, nome de usuário e senha
            return DriverManager.getConnection(JDBC_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            // Em caso de erro ao conectar, lançamos uma exceção RuntimeException com uma mensagem de erro
            throw new RuntimeException("Erro ao conectar ao banco de dados.", e);
        }
    }
}
