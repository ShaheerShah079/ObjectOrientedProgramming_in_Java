package com.company;
abstract class aclass{
    public aclass() {
        System.out.println("I am contrutpr of abstract class");
    }
    public void b_method(){
        System.out.println("I am normal method of abstract");
    }
    abstract public void a_method();
}
class bclass extends aclass{
    public void a_method(){
        System.out.println("I am subclass method");
    }
}
public class abstract_prac5 {
    public static void main(String[] args) {
        bclass b = new bclass();

        b.b_method();
        b.a_method();
    }
}
