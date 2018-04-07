import java.sql.*;
import java.util.ArrayList;

public abstract class SQLUtils {

    public static void createTable(ArrayList<String> list, String tableName, String baseName){
        String query = "CREATE TABLE " + tableName + " (";
        String[] arrayColums = list.get(0).split(";");
        for(String s : arrayColums) {
            query += s + " VARCHAR(40),";

        }
        query += "PRIMARY KEY (" + arrayColums[0] + ")) CHARACTER SET=utf8";
        executeUpdateQuery(query,baseName);
        System.out.println(query);
    }

    private static void executeUpdateQuery(String query, String baseName) {
        try {Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + baseName + "?useUnicode=true&characterEncoding=utf8", "root", "ISQwX133");
             Statement statement = connection.createStatement();
             statement.executeUpdate(query);
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void fillData(ArrayList<String> list, String tableName, String baseName){
        String query = "INSERT INTO " + tableName + " (";
        String[] arrayColums = list.get(0).split(";");
        for(String s : arrayColums) {
            query += s + ",";
        }
        query = query.substring(0, query.length() - 1);
        query += ") VALUES (";

        for(int i = 1; i < list.size(); i++){
            executeFillQuery(i, list, query, baseName);
        }
    }

    public static void addKeys(ArrayList<String> list, String baseName){
        for(String s : list) {
            String[] keys = s.split(",");
            for(String str : keys){
                System.out.println(str);
            }
            String query = "ALTER TABLE " + keys[0] +
                    " ADD CONSTRAINT FK_" + keys[3] +
                    " FOREIGN KEY (" + keys[3] +") REFERENCES "+ keys[2] + "(" + keys[3] + ")";
            executeUpdateQuery(query, baseName);
        }
    }

    public static ArrayList<String> executeSelectQuery(String query, String baseName){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ baseName +"?useUnicode=true&characterEncoding=utf8", "root", "ISQwX133");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)){
            return prepareResultSet(resultSet);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static String[] getValues(String s){
        String[] value = s.split(";");
        return value;
    }

    public static void executeFillQuery(int i, ArrayList<String> list, String query, String baseName){
        for(String s : getValues(list.get(i))){
            query +="'"+ s + "',";
        }
        query = query.substring(0, query.length() - 1);
        query += ")";
        executeUpdateQuery(query, baseName);
        System.out.println(query);
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
