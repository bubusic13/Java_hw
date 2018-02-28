package hw5;

public class OffRoadCar extends Car {

    private int roadСlearance;

    public OffRoadCar(int speed, int capacity, String model, int roadСlearance) {
        super(speed, capacity, model);
        this.roadСlearance = roadСlearance;
    }

    public void move(int speed, Direction direction, int roadСlearance) {

    }
}
