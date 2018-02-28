package com.shop.manager;

import com.shop.bag.Bag;

/**
 * Created by cube on 21.02.2018.
 */
public class ShopManager {

    public int sum(Bag bag) throws InterruptedException {
        int sum = 0;
        bag.initIterator();
        bag.sortBag();
        int i = bag.checkAkciya();
        while (bag.haveNext(i)){
            System.out.println("PICK!!");
            sum +=bag.next().getPrice();
            Thread.sleep(100);
        }
        System.out.println("vvasha suma sostavlaet " + sum);
        return sum;
    }
}
