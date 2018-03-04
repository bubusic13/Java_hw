package com.shop.Customer;

import com.shop.bag.Bag;
import com.shop.bag.BagImpl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class Customer {

    HashMap<String, Bag> bags = new HashMap<>();
    HashMap<String, Payment> payment = new HashMap<>();

    public void putBag(Bag bag) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String key = sdf.format(cal.getTime());
        bags.put(key, bag);
        payment.put(key, Payment.OPEN);
    }

    public void payForBag(String key){

        payment.put(key, Payment.PAID);

    }

    public HashMap<String, Bag> getBags(){
        return bags;
    }

    public HashMap<String, Payment> getPayment() {
        return payment;
    }
}
