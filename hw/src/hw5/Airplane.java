package hw5;

public class Airplane extends Transport {

    private String model;

    public Airplane(int speed, int capacity, String model) {
        super(speed, capacity);
        this.model = model;
    }

    @Override
    public void move(int speed, Direction direction) {
        super.move(speed, direction);
    }
}
