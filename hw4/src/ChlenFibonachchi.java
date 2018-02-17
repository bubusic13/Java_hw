public class ChlenFibonachchi {

    int a;
    int b;
    int c;

    public ChlenFibonachchi(){
        a = 1;
        b = 1;
    }

    public void showChlen(){
        System.out.println(a);
        for (int i = 0; i < 10; i++){
            System.out.println(b);
            c = b;
            b += a;
            a = c;

        }
    }
}
