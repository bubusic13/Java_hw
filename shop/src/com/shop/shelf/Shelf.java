package com.shop.shelf;


import com.shop.position.Position;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shelf <T extends Position> {

        private static final int CAPACITY = 10;

        private ArrayList arrayList = new ArrayList();

        private int realIndex =0;

        public void put(T  pos) {
            if (realIndex < CAPACITY){
                arrayList.add(pos);
                realIndex++;
            }
        }

        public T get() {
            if(checkAvailable()) {
                T pos = (T) arrayList.get(realIndex-1);
                arrayList.remove(pos);
                realIndex--;
                return pos;
            }
            return null;
        }

        public boolean checkAvailable() {
            return realIndex != 0;
        }
    }

