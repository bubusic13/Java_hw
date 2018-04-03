import java.sql.*;
import java.util.ArrayList;

public class EmployeeWorker {
    public static void main(String[] args) {

        String query = "select employees.first_name, employees.last_name, employees.hire_date from employees.employees;";
        ArrayList<Employee> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "ISQwX133");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)){

            while (resultSet.next()){
                Employee employee = new Employee(resultSet.getString(1), resultSet.getString(2), resultSet.getDate(3));
                list.add(employee);
            }
            for(Employee employee : list){
                System.out.println(employee.getName()+ " " + employee.getLastName());
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
}
