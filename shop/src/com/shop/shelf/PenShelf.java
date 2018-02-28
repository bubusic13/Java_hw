package com.shop.shelf;

import com.shop.position.impl.abst.AbstractPosition;

public class PenShelf implements Shelf {
    private AbstractPosition[] pens = new AbstractPosition[capacity];

    private int realIndex =0;

    @Override
    public void put(AbstractPosition  pen) {
        if (realIndex < capacity){
            pens[realIndex++] = pen;
        }
    }

    @Override
    public AbstractPosition get() {
        if(checkAvailable()) {
            AbstractPosition pen = pens[realIndex-1];
            pens[--realIndex] = null;
            return pen;
        }
        return null;
    }

    @Override
    public boolean checkAvailable() {
        return realIndex != 0;
    }
}
