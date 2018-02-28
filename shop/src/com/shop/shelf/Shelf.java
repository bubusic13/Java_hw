package com.shop.shelf;

import com.shop.position.impl.abst.AbstractPosition;

public interface Shelf {

    final static int capacity = 10;

    void put(AbstractPosition position);


    AbstractPosition get();
    boolean checkAvailable();

}
