package com.devglan.exception;

import java.io.File;

public class CheckedExceptionExample {

    public String sayHello() {
        //print("Hello");
        return "Hello";
    }

    public File readFile(String fileName) throws Exception {
        return new File(fileName);
    }

    public void print(String string) throws Exception{
        readFile("myfile.txt");
    }

    public void printAgain(){
        try {
            print("");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        CheckedExceptionExample exceptionExample = new CheckedExceptionExample();
        exceptionExample.sayHello();
        CheckedExceptionExample1 checkedExceptionExample1 = new CheckedExceptionExample1();
        checkedExceptionExample1.sayHello();
        exceptionExample.printAgain();
    }
}
