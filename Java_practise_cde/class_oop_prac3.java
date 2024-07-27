package com.company;
import java.util.Scanner;

class CirclePrivate{
    boolean check = true;
    private int radius;
    public void getRadius(int r){
        if(r<=10) {
            this.radius = r;
        }
        else {
            System.out.println("Radius must less than 10");
            check =false;
        }
    }
    public float area() {
        return (float) (3.14*radius*radius);
    }
    public float para() {
        return (float)(2*3.14 *radius);
    }
    public void print(){
        if(check) {
            System.out.println(area());
            System.out.println(para());
        }
    }

}

public class class_oop_prac3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CirclePrivate cir= new CirclePrivate();
        int rad;
        rad=input.nextInt();
        cir.getRadius(rad);
       cir.print();


    }

    boolean check = false;
}
