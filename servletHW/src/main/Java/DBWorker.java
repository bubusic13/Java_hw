import java.sql.*;
import java.util.ArrayList;

public class DBWorker {

    public static void fillData(String name, String email, int password){

        String query = "INSERT INTO users(name,email,password) VALUES(" + name + "," + email + "," + password + ");";
        Connection connection = null;
        Statement statement = null;
        try {connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletHW", "root", "ISQwX133");
             statement = connection.createStatement();
             statement.executeUpdate(query);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getId(String name, String email){

        String query = "select user_id from users where name like ? and email like ?;";
        Connection connection = null;
        PreparedStatement statement = null;
        int id = 0;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletHW", "root", "ISQwX133");
            statement = connection.prepareStatement(query);
            statement.setString(1, name + "%");
            statement.setString(2, email + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return id;
    }

    public static ArrayList<String> getNameById(int id){

        String query = "select name, email from users where id like ?;";
        Connection connection = null;
        PreparedStatement statement = null;
        ArrayList<String> list = new ArrayList();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletHW", "root", "ISQwX133");
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                list.add(resultSet.getString(1));
                list.add(resultSet.getString(2));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
