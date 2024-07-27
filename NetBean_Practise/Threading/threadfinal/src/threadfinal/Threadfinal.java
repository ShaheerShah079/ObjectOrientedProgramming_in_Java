
package threadfinal;

public class Threadfinal
{

    public static void main(String[] args)
    {
     
//     A ob = new A();
//     B ob1 = new B();
//ob.start();
//ob1.start();
        
        String on="ABCDEF";
        String two ="Ab";
                System.out.println(on.contains(two));

          two=on.substring(3,on.length());
            System.out.println(two);    
                
    }
    
}



class A extends Thread
{
    @Override
    public void run()
    {
        me();
    }
    public void me()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Hello");
        }
    }
    
}


class B extends Thread
{
    @Override
    public void run()
    {
        me1();
    }
    public void me1()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("yes");
        }
    }
    
}

