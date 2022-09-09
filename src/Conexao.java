import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String url = "jdbc:mysql://localhost:3306/agenda", user = "root", password = "root";

    public Connection conectaBD() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
