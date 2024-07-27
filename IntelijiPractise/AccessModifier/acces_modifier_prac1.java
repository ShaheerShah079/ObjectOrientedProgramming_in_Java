package com.company;

import java.util.Scanner;

class Cylinder{
    int radius;
    int height;
    public void set(int ... n){
        radius = n[0];
        height=n[1];
    }
    public int getRadius(){return radius;}
    public int getHeight(){return height;}
    public float surfaceArea() { return (float) (2*3.14*radius*height);}
    public float volume() { return (float) (3.14*radius*radius*height);}
}

class CylinderConstrutor{
    float radius;
    int height;
    int length;
    public void set(int ... n){
        radius = n[0];
        height=n[1];
    }
    public CylinderConstrutor(float r, int h){
        radius = r;
        height=h;
    }
    public CylinderConstrutor(int l, int b){
        System.out.println("I am l an b construtor");
        length = l;
        height=b;
    }
    public CylinderConstrutor(){
        System.out.println("I am cylinder constructor");
    }
    public float getRadius(){return radius;}
    public int getHeight(){return height;}
    public float surfaceArea() { return (float) (2*3.14*radius*height);}
    public float volume() { return (float) (3.14*radius*radius*height);}
    public float surfaceArearec() { return (float) (length*height);}
}
public class acces_modifier_prac1 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Cylinder c1 = new Cylinder();
//        System.out.println("Enter radius then Height");
//        int a=input.nextInt();
//        int b=input.nextInt();
//        c1.set(a,b);
//        System.out.println("Surface area is "+c1.surfaceArea()+" Volume is "+c1.volume());



//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter radius then Height");
//        float a=input.nextFloat();
//        int b=input.nextInt();
//        CylinderConstrutor c1 = new CylinderConstrutor(a,b);
//        System.out.println("Surface area is "+c1.surfaceArea()+" Volume is "+c1.volume());
//        System.out.println("Enter lenth of rec");
//        int c=input.nextInt();
//        CylinderConstrutor c2 = new CylinderConstrutor(c,b);
//        System.out.println("Surface area of rec is "+c2.surfaceArearec());


//        Scanner input = new Scanner(System.in);
//        CylinderConstrutor c3 = new CylinderConstrutor(12.9f,54);
//        System.out.println("Enter radius then Height");
//       int a=input.nextInt();
//        int b=input.nextInt();
//        c3.set(a,b);
//        System.out.println("Surface area is "+c3.surfaceArea()+" Volume is "+c3.volume());


        Scanner input = new Scanner(System.in);
        CylinderConstrutor c3 = new CylinderConstrutor();
        System.out.println("Enter radius then Height");
        int a=input.nextInt();
        int b=input.nextInt();
        c3.set(a,b);
        System.out.println("Surface area is "+c3.surfaceArea()+" Volume is "+c3.volume());






    }
}
