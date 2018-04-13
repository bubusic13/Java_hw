package PartXXX;

import java.sql.*;
import java.util.ArrayList;

public class SocialNetwork<T extends Entity> {



    public void like(User user, T t){
        String query = "INSERT INTO like (author_id,entityId) VALUES (" +  "," + user.getId() + t.getId() + ");";
        executeQuery(query);
    }

    public void unlike(User user, T t){
        String query = "DELETE * FROM like WHERE author_id LIKE " + user.getId() + "AND entity_id LIKE " + t.getId();
        executeQuery(query);
    }



    public void executeQuery(String query){
        try {Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_network", "root", "ISQwX133");
            Statement statement = connection.prepareStatement(query);
            statement.executeQuery(query);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void executeCountQuery(Entity entity) {
        String query = "select count (*)" +
                "from like \n" +
                "where entity_id like ?;";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        int count = 0;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "ISQwX133");
            statement = connection.prepareStatement(query);
            statement.setInt(1, entity.getId());
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                count = resultSet.getInt(1);
            }
            System.out.println(count);

            resultSet.close();
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void executeSelectQuery(Entity entity) {
        String query = "select author_id" +
                "from like \n" +
                "where entity_id like ?;";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        ArrayList<Integer> list = new ArrayList<>();

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "ISQwX133");
            statement = connection.prepareStatement(query);
            statement.setInt(1, entity.getId());
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                list.add(resultSet.getInt(1));
            }
            for (int i : list){
                System.out.println(i);
            }

            resultSet.close();
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




}
