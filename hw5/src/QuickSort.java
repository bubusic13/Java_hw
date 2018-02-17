public class QuickSort {
    public static int[] quickSort(int[] array){
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(startIndex, endIndex, array);
        return array;
    }
    private static void doSort(int start, int end, int[] array){
        if(start >= end){
            return;
        }
        int i = start;
        int j = end;
        int cur = i - (i - j)/2;

        while (i < j){
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if(i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if(i == cur){
                    cur = j;
                }
                else if(j == cur){
                    cur = i;
                }
            }
        }
        doSort(start, cur, array);
        doSort(cur+1, end, array);
    }
}
