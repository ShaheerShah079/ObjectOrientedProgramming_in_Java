package com.company;

public class practise_cal {
    public static void main(String[] args) {
        java.util.Scanner inputchar = new java.util.Scanner(System.in);
        System.out.print("Enter operator(+,-,*,/) :  ");
        char operator = inputchar.next().charAt(0);

        System.out.println((operator != '+') && (operator != '-')&& (operator != '*') && (operator != '/'));
    }
}
