
package InsertionAtGU;

import java.util.Scanner;

public class insertionAtGu
{
    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter seq1");
        String s1 =in.next();
        System.out.println("Enter dna seq2");
        String s2=in.next();
        
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='G'&&s1.charAt(i+1)=='U')
            {
                 StringBuilder ss = new StringBuilder(s1);
                 ss.insert(i+2, s2);
        
                 System.out.println(ss);
 
            }
        }
        
       
    }
}
