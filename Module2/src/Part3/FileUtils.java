package Part3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class FileUtils {

    public static ArrayList<String> readFile(Path path) {
        ArrayList<String> list = new ArrayList<>();
        try {
            list = (ArrayList<String>) Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
