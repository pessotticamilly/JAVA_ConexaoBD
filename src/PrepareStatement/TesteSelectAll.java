package PrepareStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteSelectAll {
    public static void main(String[] args) throws SQLException {
        String sql = "select * from contato";

        Conexao conexao = new Conexao();

        Connection connection = conexao.conectaBD();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet != null && resultSet.next()) {
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