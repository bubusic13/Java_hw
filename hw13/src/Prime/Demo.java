package Prime;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("How Many threads? \n" +
                "How many numbers?");
        int nThreads = scaner.nextInt();
        int nNumbers = scaner.nextInt();

        final PrimeFinder[] pThreads = new PrimeFinder[nThreads];

        PrimeFinder.primeList = new ArrayBlockingQueue<>(nNumbers);
        int step = nNumbers / nThreads + 1;
        for (int i = 0; i < nThreads; i++) {
            pThreads[i] = new PrimeFinder(i * step, Math.min(1000, (i + 1) * step - 1));
            pThreads[i].start();
        }

        try {
            for (int i = 0; i < nThreads; i++)
                pThreads[i].join();
        } catch (InterruptedException e) {
        }


        System.out.println(PrimeFinder.primeList.size());
        for(Integer i : PrimeFinder.primeList){
            System.out.println(i);
        }

    }
}
