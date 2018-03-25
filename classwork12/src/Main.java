

import FirstPart.ObjectList;
import thirdpart.position.Position;
import thirdpart.position.PositionWraper;
import thirdpart.position.impl.Pen;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{

        /*
        StringWraper stringWraper = new StringWraper();
        stringWraper.TextFile("/Users/bubusic/IdeaProjects/123.txt");
        for(String line : stringWraper){
            System.out.println(line);
        }
        */
        /*
        ObjectList objectList = new ObjectList();
        objectList.readObjectsFromFile();
        */


        ArrayList<Position> list = new ArrayList<>();
        list.add(new Pen(1, "Pen"));
        list.add(new Pen(2, "Pen"));
        list.add(new Pen(5, "Pen"));
        list.add(new Pen(3, "Pen"));
        list.add(new Pen(5, "Pen"));
        PositionWraper positionWraper = new PositionWraper(list);
        for(Position position : positionWraper){
            System.out.println(position.getName() + position.getPrice());
        }
    }

}
