
package multithreadingprac1;


public class MultiThreadingPrac1
{

  
    public static void main(String[] args)
    {
     Abc ob1= new Abc();
     Xyz ob = new Xyz();
     Thread ob2 = new Thread(ob,"thred 2");
//        System.out.println();
//        System.out.println(ob1.getPriority());
     ob1.start();
     ob2.start();
//        System.out.println(ob2.getName());
//        System.out.println(ob2.getId());
//     
        System.out.println("Hello");
System.out.println(ob1.getState());
    }
    
}
class Abc extends Thread
{
   @Override
    public void run()
    {
        for(int i=1;i<11;i++)
        {
            System.out.print(i+" ");
        }
    }
}
class Xyz implements Runnable
{
   @Override
    public void run()
    {
        for(int i=1;i<11;i++)
        {
            System.out.println(i+" ");
        }
    }
}