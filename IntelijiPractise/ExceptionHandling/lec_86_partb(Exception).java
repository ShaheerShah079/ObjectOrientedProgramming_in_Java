package com.company;

public class lec_86_partb {
    public static void main(String[] args) {
        int a= 6,b=0;
        try {

            System.out.println(a / b);

        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("I am finally for value of b = " + b);
        }
    }
}
