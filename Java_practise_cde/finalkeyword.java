package com.shaheer;

import java.util.Scanner;

// final class
final class finalclass1
{
    int x;
    public void me()
    {
        System.out.println("hello");
    }
}
// final class cant be extend at all restriction their
//class finalclassinherit extends finalclass1
//{
//
//}


// final method

class finalmehtod1
{
    int x=10;
    // cant use final with constructor
//   final public finalmehtod1()
//    {
//        x=20;
//    }
    final public void me()
    {
        System.out.println("I am me");
    }
}
class finalmethodextend extends finalmehtod1
{
    int a=20;

    // final method cvant be override error
//    @Override
//     public void me ()
//    {
//        System.out.println("i am new me");
//    }
}

class finalvariable1
{
     Scanner in = new Scanner(System.in);
    int a;
    final int b;
    final static int c;
    public finalvariable1()
    {
//        c=20;   // cant ASSIGN STATIC SCOPE THINGS IN construstor
        b=in.nextInt();
    }
    public finalvariable1(int b)
    {
        this.b = b;
        System.out.println("hello");
    }

// cant assign value to blank variable in method only assign in method
//    public void h()
//    {
//        b=10;
//    }

  static
  {
  // just like init  block with static scope
        c=20;
  }

//    public static void ch()
//    {
    // cant assign a static final blanck variable in the static metho2d
//        c=20;
//    }



    public void print()
    {
        System.out.println(b+34);
    }

    public void meth(final int a)
    {
        this.a=a;
        System.out.println(this.a);

    }

}
public class finalkeyword {
    public static void main(String[] args) {
       final finalvariable1 ob = new finalvariable1();
        finalvariable1 ob1 = new finalvariable1();

//        ob=ob1;  cant assign ref of another object this is final now
        ob.print();
        ob.meth(10);
        ob.meth(20);
    }
}
