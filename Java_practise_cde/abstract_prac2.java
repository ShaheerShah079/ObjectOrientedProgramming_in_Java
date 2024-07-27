package com.company;
abstract class parent{
    abstract public void messeage();
}
class child1 extends  parent{
    public void messeage(){
        System.out.println("i am child 1");
    }
}
class child2 extends  parent{
    public void messeage(){
        System.out.println("i am child 2");
    }
}
public class abstract_prac2 {
    public static void main(String[] args) {
        child1 c1= new  child1();
        c1.messeage();
        child2 c2 = new child2();
        c2.messeage();;

    }
}
