import java.util.Random;

public class RandomArray {
    int [][] array;

    public int[][] randomArray(){
        array = new int[8][5];
        Random random = new Random();
        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++){
                array[i][j] = random.nextInt(90) + 10;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;

    }
}
