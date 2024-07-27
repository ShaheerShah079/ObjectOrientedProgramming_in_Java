package com.shaheer;


interface IntA
{
    public void method1();
}
interface IntC
{
    public void hello();
}

interface IntD extends IntC
{

    public void hello();
}
interface IntB extends IntA,IntD,IntC
{
    public void hello();
    void method2();
}
interface IntE
{
     int x=10;
    public void method3();
    default public void he()
    {
        System.out.println("I am he");
    }
}
abstract class Absclass
{
    public void hello()
    {
        System.out.println("Hello");
    }
    protected abstract void display();
    public abstract double calculate(int a ,int b);
}
class MyClass extends Absclass implements IntB,IntE
{
    @Override
    public void hello()
    {
        System.out.println("b jbhdx ");
    }
    @Override
    protected void display()
    {
        System.out.println("In My Class");
    }
    @Override
    public double calculate(int x , int y)
    {
     return (x+y);
    }
    @Override
    public void method2()
    {
        System.out.println();
    }
    @Override
    public void method1()
    {
        System.out.println("method1");
    }
    @Override
    public void method3()
    {
        System.out.println("heehne");
    }
//    @Override
//    public void he()
//    {
//        System.out.println("i am over he");
//    }

}

public class AbstractionPractise1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.he();
        obj.hello();
    }


}
