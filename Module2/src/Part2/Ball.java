package Part2;

public class Ball implements Runnable {

    private int gameOn = 1;
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        while(play()){
            System.out.println("Bamp!");
            gameOn = 0;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Your loose! HA-HA-HA!");
    }

    private boolean play(){
        return gameOn > 0;
    }

    public void beatBall(){
        gameOn = 1;
    }

}
