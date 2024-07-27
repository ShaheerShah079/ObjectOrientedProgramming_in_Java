package com.company;
class A{
    private int a;
    public void methods1(){
        System.out.println("A");
  }
}
class B extends  A{

    int b;
    public void methods12(){
        System.out.println("B");
        super.methods1();
    }

    }
public class methodoveride_prac1 {
    public static void main(String[] args) {
        B b = new B();
        b.methods12();

    }
}


