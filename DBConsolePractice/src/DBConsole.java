import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DBConsole {
    public static void main(String[] args) {
        Path path = setPath();
        //createDB(path);
        ArrayList<String> list  = SQLUtils.executeSelectQuery("SELECT * FROM DB_Test.Department;", path.getFileName().toString());
        for(String s : list){
            System.out.println(s);
        }
    }

    public static Path setPath() {
        System.out.println("Set directory URL");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Path path = Paths.get(s);
        return path;
    }

    public static void createDB(Path path) {
        String DBName = path.getFileName().toString();
        DirectoryStream<Path> directoryStream = null;
        Path keyFile = null;
        try {
            directoryStream = Files.newDirectoryStream(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Path path1 : directoryStream) {
            String fileName = path1.getFileName().toString();
            if (ifCSV(fileName) == 1) {
                ArrayList<String> tableList = FileUtils.readFile(path1);
                String tableName = getTableName(fileName);
                SQLUtils.createTable(tableList, tableName, DBName);
                SQLUtils.fillData(tableList, tableName, DBName);
            }
            if (ifCSV(fileName) == 0) {
                keyFile = path1;
            }
        }


        ArrayList<String> keysList = FileUtils.readFile(keyFile);
       // SQLUtils.addKeys(keysList, DBName);


    }

    public static int ifCSV(String fileName) {
        if (fileName.indexOf(".csv") != -1) {
            return 1;
        }
        if (fileName.indexOf(".txt") != -1) {
            return 0;
        }
        return -1;
    }

    public static String getTableName(String fileName) {
        int i = fileName.lastIndexOf(".");
        String tableName = fileName.substring(0, i);
        return tableName;
    }


}
