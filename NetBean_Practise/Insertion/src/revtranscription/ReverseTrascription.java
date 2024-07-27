package revtranscription;

import java.util.Scanner;


public class ReverseTrascription
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rna sqe");
        String s1=in.next();
        System.out.println(s1.replace('U', 'T'));
    }
}
