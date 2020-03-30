package com.brendanprogramming;

public class Main {

    public static void main(String[] args) {
        helloWorld();
        int number = getTheNumberFive();
        System.out.println(number);
    }

    private static void helloWorld() {
        char a = 'a';
        String message = "Hello Brend" + a + "n!";
        System.out.println(message);
    }

    private static int getTheNumberFive() {
        int five = 5;

        return five;
    }
}
