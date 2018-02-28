package com.shop.bag;

import com.shop.position.Position;
import com.shop.position.impl.SortByPrice;

import java.util.Arrays;

/**
 * Created by cube on 21.02.2018.
 */
public class ATBPacket implements Bag {
    private static final int SIZE = 100000;

    private Position[] positions = new Position[SIZE];

    private int realIndex = 0;

    private int iteratorIndex = 0;

    @Override
    public int getNotUsedSize() {
        return SIZE - realIndex;
    }

    public void add(Position position) {
        positions[realIndex++] = position;
    }

    public boolean haveNext(int i) {
        return iteratorIndex < realIndex - i;
    }

    public Position next() {
        return positions[iteratorIndex++];
    }

    public void initIterator() {
        iteratorIndex = 0;
    }

    public void sortBag() {
        Arrays.sort(positions, new SortByPrice());
    }


    public int checkAkciya(){
        int i = 0;
        int j = 0;
        for(Position p : positions){
            if(p != null){
                j++;
            }
        }
        return i + j / 3;
    }



}