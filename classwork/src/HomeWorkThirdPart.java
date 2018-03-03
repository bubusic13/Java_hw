import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeWorkThirdPart {
    public void arrayIndex(){
        int i = 0;
        int[] arr = new int[5];
        while(true){
            arr[i] = i;
            i++;
        }
    }

    public void fixArrayIndex(){
        int i = 0;
        int[] arr = new int[5];
        while(i < 5){
            arr[i] = i;
            i++;
        }
    }


    public void classCast(){
        Object character = new Character('c');
        System.out.println((Byte)character);
    }

    public void fixClassCast(){
        Object character = new Character('c');
        if(character instanceof Byte){
            System.out.println((Byte)character);
            System.exit(0);
        }

        System.out.println(character);

    }


    public void nullPointer(String path) throws IOException{
        String[] arr = new String[10];
        BufferedReader reader = new BufferedReader(new FileReader(path));
        for(int i=0; i < 10; i++){
            arr[i] = reader.readLine();
        }

        for(String s : arr){
            System.out.println(s);
        }

    }

    public void fixNullPointer(String path) throws IOException{
        String[] arr = new String[10];
        BufferedReader reader = new BufferedReader(new FileReader(path));
        for(int i=0; i < 10; i++){
            arr[i] = reader.readLine();
        }

        for(String s : arr) {
            if (s != null) {
                System.out.println(s);
            }
        }

    }


    public  void numberFormat(){
        String s = "9,4334";
        double d = Double.parseDouble(s);
    }

    public  void fixNumberFormat(){
        String s = "9,4334";
        double d = Double.parseDouble(s.replace(',' , '.'));
    }
}

/* У меня конечно очень простые примеры, и во всех этих примерах есть возможность избежать обработки исключений.
Думаю что если обрабатывать такие исключения есть смысл, если возникают не по твоей вине, и уместно их обработать именно в
твоем коде. Если есть возможность написать так, что бы они не появлялись, нужно так написать.
 */