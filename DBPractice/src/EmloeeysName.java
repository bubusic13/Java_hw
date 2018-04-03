import java.sql.*;
import java.util.ArrayList;

public class EmloeeysName {
    public static void main(String[] args) {

        String query = "select employees.first_name, employees.last_name\n" +
                "from employees\n" +
                "where employees.last_name like ?;\n";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        ArrayList<String> list = new ArrayList<>();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "ISQwX133");
            statement = connection.prepareStatement(query);
            statement.setString(1, "Kop%");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                list.add(resultSet.getString(1) + " " + resultSet.getString(2));
            }
            for (String s : list) {
                System.out.println(s);
            }
            resultSet.close();
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                resultSet.close();
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
