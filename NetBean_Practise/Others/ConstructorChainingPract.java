package com.shaheer;
class A
{
    int a;
    public A()
    {
        System.out.println("A");
    }

}
class B extends A
{
    int b;


    public B(int x)
    {

        System.out.println(" B");
    }



}
class C extends B
{
    int c;
public C(int x)
{ super(x);
    c=x;
    System.out.println("C");
}


}

public class ConstructorChainingPract {
    public static void main(String[] args) {
        C ob = new C(10);
    }
}
