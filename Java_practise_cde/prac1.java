package com.company;
import  java.util.Scanner;
public class prac1 {
    private static int countTrue(boolean []arr,int lastValue){
        int count=0;
        for(int i=0 ; i<lastValue ; i++){
            if(arr[i]==true){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        boolean [] arr = new boolean[10];
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of bollean expreesion");
        int lastValue = input.nextInt();
        for(int i = 0 ; i<lastValue ; i++){
            System.out.println("Enter true and false ");
            boolean value =input.nextBoolean();
                arr[i]=value;
        }
        int count = countTrue(arr,lastValue);
        System.out.println("You enter "+count+" True value");
    }
}
