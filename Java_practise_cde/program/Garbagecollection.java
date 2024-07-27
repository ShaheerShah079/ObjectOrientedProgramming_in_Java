
package my.program;

class Abc
{
 String name;
 Abc(String a)
 {
     name=a;
 }
 
 //
 
 @Override
 protected void finalize()
 {
     System.out.println("Object "+name); 
 }
}
public class Garbagecollection
{
    public static void main(String[] args)
    {
        Abc obj = new Abc("object1");
        Abc obj1 = new Abc("object2");
        Abc obj2 = new Abc("object3");
        
        obj=null;    //
        
        
        obj1=obj2;   //
        
        
        new Abc("Anoy");  //
        
   System.gc();
        
        
    }
 
   
    
    
}
