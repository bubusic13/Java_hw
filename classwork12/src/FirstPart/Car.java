package FirstPart;

import java.io.Serializable;

public class Car extends Transport implements Serializable{

    public String model;

    public Car() {
    }

    public Car(int speed, int capacity, String model) {
        super(speed, capacity);
        this.model = model;
        //перегруженный конструктор
    }

    public void move(int speed) {
        //прегруженный метод
    }
}
