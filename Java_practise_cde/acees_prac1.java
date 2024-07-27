package com.company;
class aces{
    public  int a=10;
    protected int b =11;
    int c=12;
    private int d=11;
        }
class aces2 extends aces{
    public void run(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class acees_prac1 {
    public static void main(String[] args) {
aces2 a = new aces2();
a.run();
    }
}
