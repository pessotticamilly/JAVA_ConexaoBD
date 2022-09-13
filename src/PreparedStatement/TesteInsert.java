package PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsert {
    public static void main(String[] args) throws SQLException {
        Contato contato = new Contato("Bruna", 17, "bruna@gmail.com", "98765-4321");

        String sql = "insert into contato(nome, idade, email, telefone) values (?, ?, ?, ?)";
        Conexao conexao = new Conexao();

        Connection connection = conexao.conectaBD();

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, contato.getNome());
        statement.setInt(2, contato.getIdade());
        statement.setString(3, contato.getEmail());
        statement.setString(4, contato.getTelefone());

        statement.execute();

        connection.close();
    }
}
