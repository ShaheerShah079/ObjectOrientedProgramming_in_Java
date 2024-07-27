package com.company;
import java.util.Scanner;
public class prac3_stringendwith {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1;
    String s2;
        System.out.println("Enter first string");
    s1= input.nextLine();
        System.out.println("Enter second string");
    s2=input.nextLine();
    boolean check = s1.endsWith(s2);
        System.out.println(check);
    }
}
