package com.company;

public class Main {

    public static void main(String[] args) {
        String greeting = "hello world";
        int length = greeting.length();

        for (int i = 0; i < length; i++) {
            int ch = greeting.charAt(i);
            if(ch != ' ') {
                ch = ch - 32;
                String firstPart = greeting.substring(0, i);
                String secondPart = greeting.substring(i + 1);
                System.out.println(firstPart + (char)ch + secondPart);
            }
        }
    }
}
