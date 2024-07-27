package insertion;

import java.util.Scanner;

public class Insertion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter seq1");
        String s1 =in.next();
        System.out.println("Enter dna seq2");
        String s2=in.next();
        StringBuilder ss = new StringBuilder(s1);
        System.out.println("At which index you insert seq");
        int ins=in.nextInt();
        ss.insert(ins, s2);
        
        System.out.println(ss);
 
    
    }
    
}
