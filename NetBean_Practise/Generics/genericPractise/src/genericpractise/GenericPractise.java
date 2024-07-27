package genericpractise;

import java.util.InputMismatchException;

public class GenericPractise
{

    public static void main(String[] args)
    {
        
         

    }
    
}
class ClassAbc<DT1,DT2>
{
    DT1 a;
    DT2 b;
    
    public <DT1,DT2> void print(DT1 a,DT2 b)
    {
        System.out.println(a+" "+b);
    }
    
}