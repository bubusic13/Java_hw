package prime;

import java.util.concurrent.ArrayBlockingQueue;

public class PrimeFinder extends Thread {

    static ArrayBlockingQueue<Integer> primeList;
    private int s;
    private int end;
    private boolean prime;

    public PrimeFinder(int s, int end){
        this.s = s;
        this.end = end;
    }

    public void run() {
        for (int i = s; i <= end; i++) {
            prime = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime && i != 0 && i !=1) {
                primeList.add(i);
            }
        }
    }
}
