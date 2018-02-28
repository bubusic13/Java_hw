package hw5;

public class Car extends Transport {

    private String model;

    public Car(int speed, int capacity, String model) {
        super(speed, capacity);
        this.model = model;
        //перегруженный конструктор
    }

    public void move(int speed, Direction direction, Road road) {
        //прегруженный метод
    }
}
