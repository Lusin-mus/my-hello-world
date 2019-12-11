package com.company;

public class Main {

    public static void main(String[] args) {
        String greeting = "hello world";
        int length = greeting.length();
        while (true) {
            for (int i = 0; i < length; i++) {
                int ch = greeting.charAt(i);
                if (ch != ' ') {
                    ch = ch - 32;
                    String firstPart = greeting.substring(0, i);
                    String secondPart = greeting.substring(i + 1);
                    System.out.println(firstPart + (char) ch + secondPart);
                }
            }
            for (int j = greeting.length() - 2; j > 0; j--) {
                int ch = greeting.charAt(j);
                if (ch != ' ') {
                    ch = ch - 32;
                    String firstPart = greeting.substring(0, j);
                    String secondPart = greeting.substring(j + 1);
                    System.out.println(firstPart + (char) ch + secondPart);
                }
            }
        }
    }
}
