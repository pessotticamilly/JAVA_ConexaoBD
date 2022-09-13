package Statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsert {
    public static void main(String[] args) throws SQLException {
        Contato contato = new Contato("Bruna", 17, "bruna@gmail.com", "98765-4321");

        String sql = "insert into contato(nome, idade, email, telefone)" +
                "values ('"+ contato.getNome() + "', " + contato.getIdade() + ", '" + contato.getEmail() + "', '" + contato.getTelefone() + "')";
        Conexao conexao = new Conexao();

        Connection connection = conexao.conectaBD();

        Statement statement = connection.createStatement();
        statement.execute(sql);

        connection.close();
    }
}
