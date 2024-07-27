package com.shaheer;

class Vari {
    int x;
    static int y;
    public int add(int a , int b)
    {
        x=10;
        y=12;
        int c = a+b;
        return c;
    }
    public static int multiply(int a , int b)
    {
        y=12;
//        x=20;
        int c = a*b;
        return c;
    }

}
public class VariableLecture
{
    public static void main(String[] args) {
        Vari.y=10;
        Vari.multiply(12,13);


        Vari obj = new Vari();
        Vari ob2 = new Vari();
        System.out.println(ob2.y);


    }

}
