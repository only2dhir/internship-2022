package com.devglan.exception;

public class TryCatch {

    //try, catch, finally, throw, throws

    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana"};


            for (int i = 0; i <= fruits.length; i++) {
                try {
                    //throw new IndexOutOfBoundsException();
                    //System.out.println("dkdjjkd");
                    System.out.println(fruits[i]);
                    System.out.println(i +1);
                    //throw new RuntimeException("run time exception");

                    //HTTP API call
                    //DB call
                } catch (ArrayIndexOutOfBoundsException exp) {
                    System.out.println(exp.getMessage());
                } catch (RuntimeException e) {
                    System.out.println("runtime exception");
                } catch (Exception e) {
                    System.out.println("exception occurred");
                }
                System.out.println("printed" + i + " element");

        }

    }

    /*try{
        //statements
    }catch(Exception e) {

    }*/
}
