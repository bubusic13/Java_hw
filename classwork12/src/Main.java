import FirstPart.ObjectList;
import SecondPart.StringWraper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        StringWraper stringWraper = new StringWraper();
        stringWraper.TextFile("/Users/bubusic/IdeaProjects/123.txt");
        for(String line : stringWraper){
            System.out.println(line);
        }
        */


        File file = new File("/Users/bubusic/IdeaProjects/classwork12/src/FirstPart/objects");
        ObjectList objectList = new ObjectList();
        objectList.readObjectsFromFile(file);

    }

}
