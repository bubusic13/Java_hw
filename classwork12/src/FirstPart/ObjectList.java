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


    public void readObjectsFromFile() throws IOException {

        list.add(car);
        list.add(airplane);
        list.add(transport);
        list.add(orc);

        Path path = Paths.get("/Users/bubusic/IdeaProjects/classwork12/src/FirstPart/file.txt");
        FileOutputStream fos = new FileOutputStream(path.toFile());
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        FileInputStream fis = new FileInputStream(path.toFile());
        ObjectInputStream ois = new ObjectInputStream(fis);


        try {
            listIn = (ArrayList<Transport>) ois.readObject();
        }  catch (EOFException e){
            System.out.println("Write");
            oos.writeObject(list);
            oos.writeObject(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            listIn = (ArrayList<Transport>) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        oos.close();
        ois.close();


        for (Transport transport : listIn) {
            System.out.println(transport);
        }

    }

}
