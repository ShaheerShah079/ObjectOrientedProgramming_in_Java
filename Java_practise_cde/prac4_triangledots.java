package com.company;
import  java.util.Scanner;
public class prac4_triangledots {
    private static int checkDot(int n){
        if(n==1){
            return 1;
        }
        else{
            return (checkDot(n-1)+n);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the triangle sequence");
        Scanner input = new Scanner(System.in);
        int seq = input.nextInt();
        System.out.println(checkDot(seq));
    }
}
