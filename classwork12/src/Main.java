

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
        objectList.readObjects();
        */



        ArrayList<Position> list = new ArrayList<>();
        ArrayList<Position> newList = new ArrayList<>();
        list.add(new Pen(1, "Pen"));
        list.add(new Pen(2, "Pen"));
        list.add(new Pen(5, "Pen"));
        list.add(new Pen(1, "Pen"));
        list.add(new Pen(2, "Pen"));
        list.add(new Pen(1, "Pen"));
        list.add(new Pen(2, "Pen"));
        list.add(new Pen(5, "Pen"));
        list.add(new Pen(1, "Pen"));
        list.add(new Pen(5, "Pen"));
        PositionWraper positionWraper = new PositionWraper(list);
        for(Position position : positionWraper){
            newList.add(position);
        }
        for (Position p: newList) {
            System.out.println(p.getName()+p.getPrice());
        }

    }

}
