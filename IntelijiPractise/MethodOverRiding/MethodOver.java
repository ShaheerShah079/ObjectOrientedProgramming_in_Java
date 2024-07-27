package com.shaheer;
class Methods
{
    public void add(double a, double b)
    {
        System.out.println("Double Addition is"+(a+b));
    }
    public void add(double a, double b,double c)
    {
        System.out.println("Addition is"+(a+b+c));
    }

    public void add(double a, double b, double c, double d)
    {
        System.out.println("Addition is"+(a+b+c+d));
    }

    public void add(double a, double b, double c, double d, double e)
    {
        System.out.println("Addition is"+(a+b+c+d+e));
    }

}
public class MethodOver {
    public static void main(String[] args) {
        Methods ob = new Methods();
        ob.add(10,20);
        ob.add(10,23.43);
        ob.add(23.4,43);

//        ob.add(12,23.5f,23.56);




        int i=20;
        double d = i;



    }

}
