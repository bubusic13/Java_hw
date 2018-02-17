import java.util.Scanner;

public class DigitsSum {

    public String in;
    public int dSum;

    public DigitsSum(){
        dSum = 0;
    }

    public void calculateDigitSum(){
        Scanner sc = new Scanner(System.in);
        in = sc.nextLine();
        int numberOfDig = in.length();

        for(int i=0; i < numberOfDig; i++){
            dSum += Character.getNumericValue(in.charAt(i));
        }
        System.out.println(dSum);
    }
}
