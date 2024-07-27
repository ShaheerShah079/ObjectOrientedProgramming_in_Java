package com.company;

public class prac7_StaticMethod {
    private static String join(String name){
        String temp;
        temp=name+" something is beter";
        return temp;
    }
    public static void main(String[] args) {
        String name = "shaheer";
        System.out.println(join(name));
    }
}
