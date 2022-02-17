package com.devglan.exception;

public class UnCheckedExceptionExample {

    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana"};


        for (int i = 0; i <= fruits.length; i++) {
            System.out.println(fruits[i]);
            System.out.println(i +1);
            //throw new RuntimeException("run time exception");
            throw new NotFoundException(400, "Not found");
            //HTTP API call
            //DB call
            //System.out.println("printed" + i + " element");

        }

    }
}
