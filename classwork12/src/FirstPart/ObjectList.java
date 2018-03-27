package FirstPart;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ObjectList {
    Airplane airplane = new Airplane(120, 12, "Jet");
    Car car = new Car(20, 22, "Car");
    OffRoadCar orc = new OffRoadCar(40, 12, "Car", 1);
    Transport transport = new Transport(2, 2);
    ArrayList<Transport> list = new ArrayList<>();
    ArrayList<Transport> listIn = new ArrayList<>();
    Path path = Paths.get("/Users/bubusic/IdeaProjects/classwork12/src/FirstPart/file.txt");


    public void readObjects() throws IOException {

        list.add(car);
        list.add(airplane);
        list.add(transport);
        list.add(orc);


        try {
            FileInputStream fis = new FileInputStream(path.toFile());
            ObjectInputStream ois = new ObjectInputStream(fis);
            listIn = (ArrayList<Transport>) ois.readObject();
            ois.close();
        }  catch (EOFException e){
            System.out.println("Write");
            FileOutputStream fos = new FileOutputStream(path.toFile());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Transport transport : listIn) {
            System.out.println(transport);
        }

    }
}
