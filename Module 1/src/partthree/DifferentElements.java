package partthree;

import java.util.HashSet;

public class DifferentElements {

    int[] array = {1,2,3,4,4,2,1,5,3,2};
    HashSet hashSet = new HashSet();

    public void findNumberOfDifferentElements(){
        for(int a : array){
            hashSet.add(a);
        }
        System.out.println(hashSet.size());
    }

}
