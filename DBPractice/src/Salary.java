import java.sql.*;
import java.util.ArrayList;

public class Salary {
    public static void main(String[] args) {

        String query = "select em.first_name, em.last_name, sal.salary\n" +
                "from employees em \n" +
                "inner join salaries sal on (em.emp_no=sal.emp_no) \n" +
                "where sal.to_date like ?;";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        ArrayList<Integer> list = new ArrayList<>();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "ISQwX133");
            statement = connection.prepareStatement(query);
            statement.setString(1, "2000%");
            resultSet = statement.executeQuery();

            while (resultSet.next()){
                list.add(resultSet.getInt(3));
            }
            for(Integer i : list){
                System.out.println(i);
            }
            resultSet.close();
            connection.close();
            statement.close();

        }
        catch (SQLException e){
            e.printStackTrace();

        }
        finally {
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
