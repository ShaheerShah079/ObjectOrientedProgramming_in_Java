package com.company;
abstract class Base{
    int length;
    int breath;
    public Base(int l, int b){
        length=l;
        breath=b;
    }
    public int area(){return length*breath;}
    public int para(){return 2*(length+breath);}
    abstract public void Hello();
}
class Derived extends  Base{
    public Derived(int l, int b) {
        super(l, b);
    }
    public void Hello(){
        System.out.println("Hello world");
    }
    public void Hello1(){
        System.out.println("Hello1 world");
    }

}
abstract class Derived1 extends Base{
    public Derived1(int l, int b) {
        super(l, b);
    }
}
class Derive2 extends  Derived1{
    public Derive2(int l, int b) {
        super(l, b);
    }

    public void Hello(){
        System.out.println("Hello world Derived 2");
    }
}
public class abstract_prac1 {
    public static void main(String[] args) {
//    Derived d = new Derived(2,4);
//        Base b = new Derived(2,4);
//        b.Hello();
//        System.out.println(b.area());
//        Derived1 d2 = new Derive2(2,4);
//        d2.

    }
}
