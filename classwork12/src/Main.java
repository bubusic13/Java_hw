import FirstPart.ObjectList;
import SecondPart.StringWraper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
        StringWraper stringWraper = new StringWraper();
        stringWraper.TextFile("/Users/bubusic/IdeaProjects/123.txt");
        for(String line : stringWraper){
            System.out.println(line);
        }
        */

        ObjectList objectList = new ObjectList();
        objectList.readObjectsFromFile();

    }

}
