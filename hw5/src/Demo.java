import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] array = new int[100];
        for (int i=0; i<100; i++) {
                array[i] = generator.nextInt(100);
            }

        for (int i=0; i<100; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        QuickSort qs = new QuickSort();
        int[] sortArray = qs.quickSort(array);

        for (int i=0; i<100; i++) {
            System.out.print(sortArray[i] + ", ");
        }
    }
}
