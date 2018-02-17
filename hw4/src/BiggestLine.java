import java.util.Random;

public class BiggestLine {


    public int[][] createArray() {
        int[][] array = new int[7][4];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(11) - 5;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }

    int maxIndex = 0 ;
    int mult = 1;



    public void biggestLine(int[][] arr){
        int maxMult = 1;


        for(int k = 0; k < 7; k++){
            for(int l = 0; l < 4; l++){
                mult = mult * arr[k][l];
                if(Math.abs(mult) > maxMult){
                    maxMult = Math.abs(mult);
                    maxIndex = k;
                }
            }
            mult = 1;
        }
        System.out.println(maxIndex);
    }

}


