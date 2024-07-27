package com.shaheer;

import java.util.Scanner;
class Abs
{
    int cal (int a,int b) throws ArithmeticException
    {
        if(b==0)
            throw new ArithmeticException("Hello mine");
        return a/b;
    }

}
public class exceptionprac3 {
    public static void main(String[] args) {
//        int a;
//        Scanner in = new Scanner(System.in);
//        a=in.nextInt();
//        if(a==0) {
//            try {
//                throw new Exception("divide zero");
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//        else
//        {
//            System.out.println(12/a);
//        }
//        System.out.println("Hello");
        Abs ob =new Abs();
       int c=ob.cal(4,0);
        System.out.println(c);

        System.out.println("hello");

    }
}
