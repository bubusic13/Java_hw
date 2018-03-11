package partthree;

import java.util.HashSet;

public class DifferentElements {

    int[] array = {1,4,5,1,1,3};
    HashSet hashSet = new HashSet();

    public void findNumberOfDifferentElements(){
        for(int a : array){
            hashSet.add(a);
        }
        System.out.println(hashSet.size());
    }

}
