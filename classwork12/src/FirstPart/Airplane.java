package FirstPart;

import java.io.Serializable;

public class Airplane extends Transport implements Serializable{

    public String model;

    public Airplane() {
    }

    public Airplane(int speed, int capacity, String model) {
        super(speed, capacity);
        this.model = model;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }
}
