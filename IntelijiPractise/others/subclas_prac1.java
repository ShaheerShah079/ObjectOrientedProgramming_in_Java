package com.company;
class Rectangle1{
    int length;
    int breadth;

    public Rectangle1(int l, int b){
        length = l;
        breadth = b;
    }

    public void printArea(){
        System.out.println(length*breadth);
    }

    public void printPerimeter(){
        System.out.println(2*(length+breadth));
    }
}

class Square1 extends Rectangle1{
    int side;
    public Square1(int s){
        super(s,s);
    }
}

public class subclas_prac1 {
    public static void main(String[] args) {
//        Rectangle1 r = new Rectangle1(4, 5);
//        r.printArea();
//        r.printPerimeter();

        Square1 s = new Square1(4);
//        s.printArea();
//        s.printPerimeter();

        Square1[] a = new Square1[10];
        int k = 5;
        for (int i = 0; i < 10; i++) {
            a[i] = new Square1(k);
            k++;
        }

        for (int i = 0; i < 10; i++) {
            a[i].printArea();
//            a[i].printPerimeter();
        }
    }
}
