package com.shop.shelf;

import com.shop.position.impl.abst.AbstractPosition;

public class AppleShelf implements Shelf {

    private AbstractPosition [] apples = new AbstractPosition[capacity-1];

    private int realIndex =0;

    @Override
    public void put(AbstractPosition  apple) {
        if (realIndex < capacity){
            apples[realIndex++] = apple;
        }
        else {
            System.out.println("Polka zabita");
        }
    }

    @Override
    public AbstractPosition get() {
        if(realIndex != 0) {
            AbstractPosition apple = apples[realIndex-1];
            apples[realIndex--] = null;
            return  apple;
        }
        return null;
    }

    @Override
    public boolean checkAvailable() {
        return realIndex != 0;
    }
}
