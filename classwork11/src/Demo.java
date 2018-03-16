import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path + "/file.txt");
        String gap = "";
        file.createNewFile();
        Path newFile = Paths.get(path+"/fileNio.txt");
        /*
        File f = new File(pathName);
        File[] files = f.listFiles();
        ArrayList<String> lines = new ArrayList<>();
        for(File file : files){
            String s = file.getName() + ":" + file.lastModified();
            lines.add(s);
        }

        Path newFile = Paths.get(pathName+"/file.txt");
        Files.write(newFile, lines, Charset.forName("UTF-8"));
        */

        /*
        File file = new File(pathName + "/file.txt");
        File dir = new File(pathName);
        File[] files = dir.listFiles();
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(pathName + "/file.txt");
        for(File f : files){
            Date date = new Date(f.lastModified());
            fileWriter.write(f.getName() + " : " + date  + "\n");
            System.out.println(f.getName());
        }

        fileWriter.close();
        */

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> namesNio = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        getFilesTree(path, gap, file, names);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println(timeSpent);

        startTime = System.currentTimeMillis();
        getFilesTreeNio(path, gap, newFile, namesNio);
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.println(timeSpent);


    }

    public static void getFilesTree(String path, String gap, File file, ArrayList<String> names) throws IOException {

        FileWriter fileWriter = new FileWriter(file);
        File directory = new File(path);
        File[] files = directory.listFiles();
        for(File f : files){
            if(f.isFile()){
                Date date = new Date(f.lastModified());
                names.add(gap + f.getName() + " : " + date  + "\n");
            }
            else {
                String newGap = gap + " ";
                Date date = new Date(f.lastModified());
                names.add(newGap + f.getName() + " : " + date  + "\n");
                getFilesTree(f.getAbsolutePath(), newGap, file, names);
            }
        }
        for(String s : names){
            fileWriter.write(s);
        }
        fileWriter.close();


    }

    public static void getFilesTreeNio(String path, String gap, Path newFile, ArrayList<String> names) throws IOException {
        File directory = new File(path);
        File[] files = directory.listFiles();
        for(File f : files){
            if(f.isFile()){
                Date date = new Date(f.lastModified());
                names.add(gap + f.getName() + " : " + date  + "\n");
            }
            else {
                String newGap = gap + " ";
                Date date = new Date(f.lastModified());
                names.add(newGap + f.getName() + " : " + date  + "\n");
                getFilesTreeNio(f.getAbsolutePath(), newGap, newFile, names);
            }
        }

        Files.write(newFile, names, Charset.forName("UTF-8"));

    }
}
