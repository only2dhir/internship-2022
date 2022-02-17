package com.devglan.basics;

import java.util.HashMap;
//The == operator returns true if the objects are the same object. There is not access to hashCode() or equals() here.
public class StringExample {

    public static void main(String[] args) {
        /*String string = "ram";
        String anotherString = "ram";

        System.out.println(string.equals(anotherString));
        System.out.println(string == anotherString);*/

        Department ece = new Department("ECE", "Electronics");
        Department ece1 = new Department("ECE", "Electronics");

        System.out.println(ece.equals(ece1));
        System.out.println(ece == ece1);

        System.out.println(ece.hashCode());
        System.out.println(ece1.hashCode());

        HashMap<Object, String> hashMap = new HashMap<>();
        hashMap.put(ece, "abc");//-1660974447
        hashMap.put(ece1, "def");//-1660974447

        System.out.println(hashMap.get(ece));
        System.out.println(hashMap.get(ece1));

    }
}
