package com.company;

public class VariableArgument_practise {
    public static int sum (int ... arr){
    int sum=0;
        for (int el:arr) {
            sum+=el;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("two  "+sum(1,2));
        System.out.println("three  "+sum(1,2,5));
        System.out.println("four  "+sum(1,2,32,7));
        System.out.println("five  "+sum(1,2,76,12,43));
        System.out.println("one  "+sum(2));

    }
}
