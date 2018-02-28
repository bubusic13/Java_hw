package com.shop.bag;

import com.shop.position.Position;

/**
 * Created by cube on 21.02.2018.
 */
public interface Bag {
    int getNotUsedSize();

    void add(Position position);

    boolean haveNext(int i);

    Position next();

    void initIterator();

    void sortBag();

    int checkAkciya();



}
