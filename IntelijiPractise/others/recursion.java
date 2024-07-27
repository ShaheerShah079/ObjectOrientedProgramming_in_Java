package com.company;

public class recursion {
    public static int fab(int n){
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return (fab(n-1)+fab(n-2));
        }

    }

    public static void main(String[] args) {
        System.out.println(fab(10));
    }
}
