package parttwo;

import java.util.Random;
import java.util.Scanner;

public class TryToGuess {

    int n;
    int k;
    Scanner scanner = new Scanner(System.in);

    public void typeNK() {

        n = scanner.nextInt();
        k = scanner.nextInt();
    }

    public void tryGuess(){
        Random random = new Random();
        int number = random.nextInt(n-1) + 1;
        for(int i = 0; i < k; i++){
            System.out.println("Type number");
            int guessNumber = scanner.nextInt();
            if(number == guessNumber){
                System.out.println("You guess");
                System.exit(0);
            }
            if(number > guessNumber){
                System.out.println("Number bigger");
            }
            else {
                System.out.println("Number less");
            }
        }
        System.out.println("Attempts ended");
    }






}
