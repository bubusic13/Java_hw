
package partfour;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TopPasswords  {

    HashMap<String, Integer> map = new HashMap<>();
    BufferedReader reader = new BufferedReader(new FileReader("/Users/bubusic/IdeaProjects/Module 1/src/partfour/1.txt"));

    public TopPasswords() throws FileNotFoundException {
    }

    public void readPasswords() throws IOException {
        String string = reader.readLine();
        String key = string.substring(string.indexOf(" ") + 1);
        while (key != null) {
            if(map.containsKey(key)){
                map.put(key , map.get(key) + 1);
                key = reader.readLine();
            }
            else {
                map.put(key, 1);
                String string = reader.readLine();
                String key = string.substring(string.indexOf(" ") + 1);
            }
        }
    }




    public HashMap<String, Integer> getMap(){
        return map;
    }



}





