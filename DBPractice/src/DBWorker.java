import java.sql.*;

public class DBWorker {

    public static void main(String[] args) {

        String query = "select count(*) from employees;";
        int count = 0;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "ISQwX133");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)){

            while (resultSet.next()){
                count = resultSet.getInt(1);
            }
            System.out.println(count);

        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

}
