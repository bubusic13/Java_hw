package FirstPart;

import java.io.*;
import java.util.ArrayList;

public class ObjectList {
    Airplane airplane = new Airplane(120, 12, "Jet");
    Car car = new Car(20, 22, "Car");
    OffRoadCar orc = new OffRoadCar(40, 12, "Car",1);
    Transport transport = new Transport(2, 2);
    ArrayList<Transport> list = new ArrayList<>();
    ArrayList<Transport> inList = new ArrayList<>();
    FileInputStream fis = null;
    ObjectInputStream ois = null;


    public void readObjectsFromFile(File file) throws IOException {

        list.add(car);
        list.add(airplane);
        list.add(transport);
        list.add(orc);

            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            if (ois.available() == 0) {
                oos.writeObject(list);
            }
            else {
                while (ois.available() > 0) {
                    try {
                        inList =(ArrayList<Transport>) ois.readObject();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
            oos.close();
            ois.close();




        for(Transport transport : inList){
            System.out.println(transport);
        }
    }

}
