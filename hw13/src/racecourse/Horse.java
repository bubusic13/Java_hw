package racecourse;

import java.util.Random;

public class Horse implements Runnable  {

    private int step;
    private  int distance = 1000;
    private String name;
    private String nameOfFan;


    public Horse(String name, String nameOfFan){
        this.name = name;
        this.nameOfFan = nameOfFan;
    }

    @Override
    public void run() {
        while (distance > 0) {
            Random random = new Random();
            step = random.nextInt(6) + 45;
            distance -= step;
            try {
                Thread.sleep(random.nextInt(101) + 300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Horse " + name + " finish.\n"
                + nameOfFan + " place bet on this horse");
    }


}
