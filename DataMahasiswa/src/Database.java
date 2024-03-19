// Saya Nabilla Assyfa Ramadhani [2205297]
// mengerjakan Latihan
// dalam mata kuliah Desain dan Pemograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan
// seperti yang telah dispesifikasikan.
// Aamiin

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private Connection connection;
    private Statement statement;

    public Database() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet selectQuery(String sql) {
        try {
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int insertUpdateDeleteQuery(String sql) {
        try {
            return statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Statement getStatement() {
        return statement;
    }
}
