package com.shop.position.impl;

import com.shop.position.Position;

import java.util.Comparator;

public class SortByPrice implements Comparator<Position> {
    @Override
    public int compare(Position o1, Position o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }
        return (int)(o2.getPrice() - o1.getPrice());
    }

}
