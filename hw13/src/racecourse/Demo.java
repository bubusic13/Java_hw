package racecourse;

public class Demo {
    public static void main(String[] args) {

        Thread[] horses = new Thread[5];
        for (int i = 0; i < 5; i++) {
            horses[i] = new Thread(new Horse("Horse " + i, "Mister " + i));
        }

        for (Thread thread : horses) {
            thread.start();
        }
    }
}
