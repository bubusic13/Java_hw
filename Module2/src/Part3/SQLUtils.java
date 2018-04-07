package Part3;

import java.sql.*;
import java.util.ArrayList;

public class SQLUtils {
    public static void createTable(ArrayList<String> list, String tableName){
        String query = "CREATE TABLE " + tableName + " (";
        String[] arrayColums = list.get(0).split(";");
        for(String s : arrayColums) {
            query += s + " VARCHAR(40),";

        }
        query += "PRIMARY KEY (" + arrayColums[0] + ")) CHARACTER SET=utf8";
        executeUpdateQuery(query);
        System.out.println(query);
    }

    private static void executeUpdateQuery(String query) {
        try {Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/class?useUnicode=true&characterEncoding=utf8", "root", "ISQwX133");
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void fillData(ArrayList<String> list, String tableName){
        String query = "INSERT INTO " + tableName + " (";
        String[] arrayColums = list.get(0).split(";");
        for(String s : arrayColums) {
            query += s + ",";
        }
        query = query.substring(0, query.length() - 1);
        query += ") VALUES (";

        for(int i = 1; i < list.size(); i++){
            executeFillQuery(i, list, query);
        }
    }

    public static void executeFillQuery(int i, ArrayList<String> list, String query){
        for(String s : getValues(list.get(i))){
            query +="'"+ s + "',";
        }
        query = query.substring(0, query.length() - 1);
        query += ")";
        executeUpdateQuery(query);
        System.out.println(query);
    }

    public static String[] getValues(String s){
        String[] value = s.split(";");
        return value;
    }

    public static ArrayList<String> executeSelectQuery(String query){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/class?useUnicode=true&characterEncoding=utf8", "root", "ISQwX133");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)){
            return prepareResultSet(resultSet);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<String> prepareResultSet(ResultSet rs){
        ArrayList<String> result = new ArrayList<>();
        try {
            while (rs.next()){
                String s = "";
                for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++){
                    s += rs.getString(i) + ";";
                }
                s = s.substring(0, s.length()-1);
                result.add(s);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }
}
