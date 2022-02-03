package com.devglan.loop;

import java.util.ArrayList;
import java.util.List;

public class Loops {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        for(String fruit : fruits) {
            if(fruit.equalsIgnoreCase("apple")) {
                break;
            }
            System.out.println(fruit);
        }

        System.out.println("---------------------------------------------");
        for(String fruit : fruits) {
            if(fruit.equalsIgnoreCase("apple")) {
                continue;
            }
            System.out.println(fruit);
        }
    }
}

