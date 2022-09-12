import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteSelect {
    public static void main(String[] args) throws SQLException {
        Integer id = 2;

        String sql = "select * from contato where id = " + id;

        Conexao conexao = new Conexao();

        Connection connection = conexao.conectaBD();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet != null && resultSet.next()) {
            Contato contato = new Contato(
            resultSet.getInt("id"),
            resultSet.getString("nome"),
            resultSet.getInt("idade"),
            resultSet.getString("email"),
            resultSet.getString("telefone"));

            System.out.print(contato);
        }

        connection.close();
    }
}
