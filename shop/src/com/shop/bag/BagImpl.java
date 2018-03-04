package com.shop.bag;

import com.shop.position.Position;
import com.shop.position.impl.SortByPrice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


/**
 * Created by cube on 21.02.2018.
 */
public class BagImpl implements Bag {
    private static final int SIZE = 10;

    private ArrayList<Position> positions = new ArrayList<>();

    private int realIndex = 0;

    private int iteratorIndex = 0;

    @Override
    public int getNotUsedSize() {
        return SIZE - realIndex;
    }

    public void add(Position position) {
        if (position != null) {
            positions.add(position);
            realIndex++;
        }
    }

    public boolean haveNext(int i) {
        return iteratorIndex < realIndex - i;
    }

    public Position next() {
        return positions.get(iteratorIndex++);
    }

    public void initIterator() {
        iteratorIndex = 0;
    }

    public void sortBag() {
        Collections.sort(positions);
    }

    public int checkAkciya(){
        return (int)positions.size()/3;
    }






}
