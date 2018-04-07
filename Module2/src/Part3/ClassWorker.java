package Part3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ClassWorker {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/bubusic/IdeaProjects/Module2/src/Part3/class.csv");
        createDB(path);
        ArrayList<String> list = SQLUtils.executeSelectQuery("SELECT * FROM class;");
        for(String s : list){
            System.out.println(s);
        }


    }

    public static void createDB(Path path) {
        ArrayList<String> list = FileUtils.readFile(path);
        String tableName = getTableName(path.getFileName().toString());
        SQLUtils.createTable(list, tableName);
        SQLUtils.fillData(list, tableName);
    }

    public static String getTableName(String fileName) {
        int i = fileName.lastIndexOf(".");
        String tableName = fileName.substring(0, i);
        return tableName;
    }
}
