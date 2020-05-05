package com.company;

import java.util.WeakHashMap;


public class Animal {


    String species;
    String species="dog";
    private Double weight;

    public Animal() {
        @@ -30,4 +30,8 @@ void takeForAWalk(){
            System.out.println("Mordo, jestem za chudy!!!");
        }
    }

    public String toString(){
        return species+" "+weight;
    }
}