package FirstPart;

import java.io.Serializable;

public class Transport implements Serializable {

    public int speed;

    public int capacity;

    public Transport() {
    }

    public Transport(int speed, int capacity){
        this.capacity = capacity;
        this.speed = speed;
    }



    public void move(int speed){

    }
}
