import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static String read(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){

            StringBuilder stringBuilder = new StringBuilder();

            String currentString;
            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append("\n");

            }

            return stringBuilder.toString();
        }
        catch (IOException e){
            return "IOException";
        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("/Users/bubusic/IdeaProjects/13.txt"));
    }
}
