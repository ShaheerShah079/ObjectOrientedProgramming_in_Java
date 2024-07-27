package com.company;

import java.util.Scanner;

abstract class shape{
    abstract int recarea(int l ,int b);
    abstract int sqarea(int s);
    abstract float cirarea(float r);
}
class area extends  shape{
    int recarea(int l, int b){
        return l*b;
    }
    int sqarea(int s){
        return s*s;
    }
    float cirarea(float r){
        return (float)(3.14*r*r);
    }
}
public class abstract_prac6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputfloat = new Scanner(System.in);
        area a1=new area();
        area a2=new area();
        area a3=new area();
        area a4=new area();
        area a5=new area();
        area[] a = {a1,a2,a3,a4,a5};
        for (int i = 0; i < 6; i++) {
            System.out.println("enter radius of circle.");
            float r = inputfloat.nextFloat();
            System.out.println(a[0].cirarea(r));
            if(i==5) {
                continue;
            }
            System.out.println("enter length and breadth of rec.");
            int l = input.nextInt();
            int b = input.nextInt();
            System.out.println(a[0].recarea(l, b));
            System.out.println("enter side of square.");
            int s = input.nextInt();
            System.out.println(a[0].sqarea(s));
        }
    }
}