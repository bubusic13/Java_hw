package FirstPart;

import java.io.Serializable;

public class OffRoadCar extends Car implements Serializable{

    public int roadСlearance;

    public OffRoadCar(int speed, int capacity, String model, int roadСlearance) {
        super(speed, capacity, model);
        this.roadСlearance = roadСlearance;
    }

    public OffRoadCar() {
    }

    public void move(int speed, int roadСlearance) {

    }
}
