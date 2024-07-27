package com.company;
import java.util.Scanner;
public class prac6 {
    private static boolean highCheck(int [] arr , int num){
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]>=num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] number = new int[20];
        System.out.println("enter number to store in array and press -1 to stop");
        for(int i=0 ; i<number.length;i++){
            int store = input.nextInt();
            if(store!=-1){
                number[i]=store;
            }
            else{
                break;
            }
        }
        System.out.println("enter number to check wheather its heights value present or not");
        int num = input.nextInt();
        boolean check = highCheck(number , num);
        System.out.println(check);
    }
}
