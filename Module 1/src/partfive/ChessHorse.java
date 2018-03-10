package partfive;

import java.util.Scanner;

public class ChessHorse {

    int x;
    int y;
    int tryX;
    int tryY;
    int[] possibleX = {2, 2, -2, -2, 1, -1, 1, -1};
    int[] possibleY = {1, -1, -1, 1, -2, -2, 2, 2};


    public void typeXY() {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();



        tryX = scanner.nextInt();
        tryY = scanner.nextInt();
    }

    public void checkMove() {
        for (int i = 0; i < 8; i++){
            if(tryX - possibleX[i] == x || tryY - possibleY[i] == y){
                System.out.println("Possible move");
            }

        }
    }

}
