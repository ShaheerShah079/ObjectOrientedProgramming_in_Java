package com.shaheer;

public class nestedclasspractise {
    public static void main(String[] args) {
        outer.Iner ob = new outer.Iner();
        outer ob1 = new outer();
        outer.Iner2 ob2 = ob1.new Iner2();


    }
}

class outer// outer class
{
    static class Iner //static nested class
    {

    }
    class Iner2 // inner class
    {

    }
    public static void method()
    {

        class Iner3     //local class
        {
            int x;
        }

    }
    Abc ob3 = new Abc() {

        public void meth() {
            System.out.println("Hello");
        }
    };
    Abc ob4 = new Abc() {

        public void meth() {
            System.out.println("Bye");
        }
    };
    }


abstract  class Abc
{
    public abstract void meth();
}
