package com.company;

public class exceptio_practise {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        if (b > 20) {
            try {
                throw new IllegalArgumentException();

            } catch (IllegalArgumentException e) {
                System.out.println("heheh");
            }
        }
        if (b == 0) {
            try {
                throw new ArithmeticException();
            }  catch (ArithmeticException e) {
                System.out.println("hehehe");
            }
        }
    }
}
