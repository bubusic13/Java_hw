package com.shop;

import com.shop.Customer.Customer;
import com.shop.bag.ATBPacket;
import com.shop.bag.Bag;
import com.shop.bag.BagImpl;
import com.shop.manager.ShopManager;
import com.shop.position.impl.Apple;
import com.shop.position.impl.Pen;
import com.shop.shelf.Shelf;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by cube on 21.02.2018.
 */
public class Main {

    public static void main(String[] args) {

        Shelf<Apple> appleShelf = new Shelf<>();
        appleShelf.put(new Apple(25, "Iabloc"));
        appleShelf.put(new Apple(25, "Iabloc"));
        appleShelf.put(new Apple(25, "Iabloc"));
        appleShelf.put(new Apple(25, "Iabloc"));
        appleShelf.put(new Apple(25, "Iabloc"));
        appleShelf.put(new Apple(25, "Iabloc"));


        Shelf<Pen> penShelf = new Shelf<>();
        penShelf.put(new Pen(10,"karandashik"));
        penShelf.put(new Pen(10,"karandashik"));

            Scanner scanner = new Scanner(System.in);
            Bag bag;
            Customer customer = new Customer();
            System.out.println("S chem poidem vasia?");
            System.out.println("1: ATB power");
            System.out.println("2: Standart edition Galia");
            switch (scanner.nextInt()) {
                case 1:
                    bag = new ATBPacket();
                    break;
                case 2:
                    bag = new BagImpl();
                    break;
                default:
                    System.out.println("sho zirkaech? pognali s rukzacom");
                    bag = new BagImpl();
            }



        while (true){
            System.out.println("Shito delaem desy?");
            System.out.println("1: go za pokupkami person-san");
            System.out.println("2: go na cassu");
            System.out.println("3: noviy paket");
            switch (scanner.nextInt()){
                case 1:
                    doPokupki(bag, appleShelf, penShelf);
                    break;
                case 2:
                    goNaCassu(customer);
                    customer.putBag(bag);
                    break;
                case 3:
                    customer.putBag(bag);
                    bag = new BagImpl();
                    break;

                default:
                    System.out.println("dich. ti vtiraech mne dich");
            }
        }
    }

    private static void doPokupki(Bag bag, Shelf appleShelf, Shelf penShelf){
        Scanner scanner = new Scanner(System.in);
        while(bag.getNotUsedSize() != 0){
            if(penShelf.checkAvailable()){
                System.out.println("1:Pen");
            }
            if(appleShelf.checkAvailable()){
                System.out.println("2:Apple");
            }
            System.out.println("3:dumay");
            switch (scanner.nextInt()){
                case 1: bag.add(penShelf.get());break;
                case 2: bag.add(appleShelf.get()); break;
                case 3: return;
                default:
                    System.out.println("dich. ti vtiraech mne dich");
            }
        }
        System.out.println("Galia, I te sho grushick");
    }

    private static void goNaCassu(Customer customer){

        System.out.println("Viberi chto oplatit' ");

        for(String key : customer.getPayment().keySet()){
            System.out.println(key + " status: " + customer.getPayment().get(key));
        }
        System.out.println("Vvedi vibraniy paket");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        customer.payForBag(key);
        Bag bag = customer.getBags().get(key);
        ShopManager babaGala = new ShopManager();
        try {
            babaGala.sum(bag);
            System.out.println("oi mama, hera tac dorogo");
            System.exit(0);
        } catch (InterruptedException e) {
            System.out.println("SCORUYY!!BABA GALA ");
        }
    }

}
