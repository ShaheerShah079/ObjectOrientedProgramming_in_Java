package exceptionpracfinall;

import java.util.Scanner;

public class Exceptionpracfinall
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
      
      int arr[]= new int[5];
      
//      ob=null;
      String dna=in.next();
      
        try
        {
            
//            for (int i = 0; i <dna.length(); i++)
//            {
//                if(dna.charAt(i)!='A'&&dna.charAt(i)!='T'&&
//                   dna.charAt(i)!='C'&&dna.charAt(i)!='G')
//                {
//                
//                    throw new Exception();
//                    
//                } 
//                    
//                    
//            }
//            
            System.out.println(12/0);
            
            
        }
        catch(NullPointerException e)
        {
            System.out.println("Öther dna seq");
        }
        finally
        {
            System.out.println("finallly");    
        }


 
      
       
       







    }
    
}
