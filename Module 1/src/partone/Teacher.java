package partone;

import java.util.HashMap;

public class Teacher {

    public void grade(String name, Examinations examinations, int[] array){
        HashMap<String, int[]> map = examinations.getMap();
        map.put(name, array);

    }
}
