import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLUtils {

    public static void createTable(int columns, String tableName) {
        String dropQuery = "DROP TABLE IF EXISTS " + tableName;
        String query = "CREATE TABLE " + tableName + " (id INT NOT NULL AUTO_INCREMENT ,";
        for (int i = 1; i <= columns; i++) {
            query += i + " VARCHAR(40),";

        }
        query += "PRIMARY KEY (" + "id" + ")) CHARACTER SET=utf8";
        executeUpdateQuery(dropQuery);
        executeUpdateQuery(query);
    }

    private static void executeUpdateQuery(String query) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/module3?useUnicode=true&characterEncoding=utf8", "root", "ISQwX133");
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void fillData(String[] array, String tableName) {
        String query = "INSERT INTO " + tableName + "VALUES (";
        executeUpdateQuery(query);

    }


}