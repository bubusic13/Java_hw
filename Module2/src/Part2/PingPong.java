package Part2;

import java.util.Scanner;

public class PingPong {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Thread ballThread = new Thread(ball);
        ballThread.start();
        Scanner scanner = new Scanner(System.in);

        while (ballThread.isAlive()) {
            String command = null;
            command = scanner.nextLine();
            if(command != null){
                ball.beatBall();
            }

        }
        scanner.close();
    }
}
