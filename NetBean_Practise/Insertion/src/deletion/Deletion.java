
package deletion;

import java.util.Scanner;


public class Deletion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter seq1");
        String s1 =in.next();
        System.out.println("Enter dna seq2");
        String s2=in.next();
        StringBuilder ss = new StringBuilder(s1);
        ss.delete(s1.indexOf(s2),s1.indexOf(s2)+s2.length());
      
        System.out.println(ss);
 
 
    }
}
