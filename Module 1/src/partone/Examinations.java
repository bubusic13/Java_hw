package partone;

import java.util.HashMap;

public class Examinations {
    HashMap<String, int[]> map = new HashMap<>();

    public void setExam(String name, int[] array ){
        map.put(name, array);
    }

    public HashMap<String, int[]> getMap(){
        return map;
    }

}
