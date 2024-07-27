package com.shaheer;

public class WrapperClass1 {
    public static void main(String[] args) {
//        Wrap<Integer> ob = new Wrap<>();
//        ob.setData(12,89);
//        ob.printData();
//
//        Wrap<String> ob1 = new Wrap<>();
//        ob1.setData("hello","bro");
//        ob1.printData();
//
//        Wrap<Double> ob2 = new Wrap<>();
//        ob2.setData(12.5,89.56);
//        ob2.printData();
//
//        Wrap<Character> ob3 = new Wrap<>();
//        ob3.setData('a','b');
//        ob3.printData();
//
//        Wrap<Boolean> ob4 = new Wrap<>();
//        ob4.setData(true,false);
//        ob4.printData();



        Wrap2<Integer,String> ob5 = new Wrap2<>();
        ob5.setData(10,"hello");
        ob5.printData();

        Wrap2<Character,Boolean> ob6 = new Wrap2<>();
        ob6.setData('a',true);
        ob6.printData();
    }
}

class Wrap<DT>    // one parameter wrap class
{
    DT a;
    DT b;
    public void setData(DT a ,DT b)
    {
        this.a= a;
        this.b=b;
    }
    public void printData()
    {
        System.out.println(a+" "+b);
    }

}


class Wrap2<DT ,U>   // two parameter wrap class
{
    DT a;
    U b;
    public void setData(DT a ,U b)
    {
        this.a= a;
        this.b=b;
    }
    public void printData()
    {
        System.out.println(a+" "+b);
    }
}
