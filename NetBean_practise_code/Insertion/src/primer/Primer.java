
package primer;

import java.util.Scanner;


public class Primer
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter seq1");
        String s1= in.next();
        System.out.println("Enter 2nd seq");
        String s2 =in.next();
        if(s1.length()>s2.length())
        {
            if(s1.indexOf(s2)==-1)
            System.out.println("Seq not found");
            
            else
            System.out.println("Seq 2 found in seq 1 at index: "+(s1.indexOf(s2)+1));
        }
        else
        {
            if(s2.indexOf(s1)==-1)
            System.out.println("Seq not found");
            
            else
            System.out.println("Seq 1 found in seq 2 at index: "+(s2.indexOf(s1)+1));
        }
    }
    
}
