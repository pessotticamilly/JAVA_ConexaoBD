import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteUpdate {
    public static void main(String[] args) throws SQLException {
        Contato contato = new Contato(2, "Leozin", 18,  "cabelinho@netuno.com", "88888-8888");

        String sql = "update contato set nome = '" + contato.getNome() + "', idade = " + contato.getIdade() + ", email = '" + contato.getEmail() + "', telefone  = '" + contato.getTelefone() + "' where id = " + contato.getId();

        Conexao conexao = new Conexao();

        Connection connection = conexao.conectaBD();

        Statement statement = connection.createStatement();
        statement.execute(sql);

        connection.close();
    }
}
