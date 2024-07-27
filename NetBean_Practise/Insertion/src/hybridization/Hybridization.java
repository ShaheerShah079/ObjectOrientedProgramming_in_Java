package hybridization;

import java.util.Scanner;

public class Hybridization
{
     public static String complimentGenerator(String dna)
   {
       StringBuilder dnaComp=new StringBuilder(dna);
       for(int i=0;i<dna.length();i++)
       {
           if(dnaComp.charAt(i)=='A')
           {
               dnaComp.setCharAt(i, 'T');
           }
           else if(dnaComp.charAt(i)=='T')
           {
               dnaComp.setCharAt(i, 'A');
           }
           else if(dnaComp.charAt(i)=='C')
           {
               dnaComp.setCharAt(i, 'G');
           }
           else if(dnaComp.charAt(i)=='G')
           {
               dnaComp.setCharAt(i, 'C');
           }
       }
       return dnaComp.toString();
   }
    public static void main(String[] args)
    {
         Scanner in= new Scanner(System.in);
        System.out.println("Enter seq1");
        String s1= in.next();
        System.out.println("Enter 2nd seq");
        String s2 =in.next();
        if(s1.length()>s2.length())
        {
            if(s1.indexOf(complimentGenerator(s2))==-1)
            System.out.println("Seq not found");
            
            else
            System.out.println("Seq 2 found in seq 1 at index: "+(s1.indexOf(complimentGenerator(s2))+1));
        }
        else
        {
            if(s2.indexOf(complimentGenerator(s1))==-1)
            System.out.println("Seq not found");
            
            else
            System.out.println("Seq 1 found in seq 2 at index: "+(s2.indexOf(complimentGenerator(s1))+1));
        }
    }
    
}
