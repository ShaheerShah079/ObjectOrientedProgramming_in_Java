package com.company;

import java.util.Scanner;

public class prac3Part2_stringendwith {
    private static boolean endswith(String s1 , String s2) {
        for (int i = 0, j = (s1.length()-s2.length()); i < s2.length()&&j<s1.length(); i++,j++) {
            if(s2.charAt(i)==s1.charAt(j)){

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        String s1;
        String s2;
        System.out.println("Enter first string");
        s1= input.nextLine();
        System.out.println("Enter second string");
        s2=input.nextLine();
        boolean check = endswith(s1,s2);
        System.out.println(check);
    }
}
