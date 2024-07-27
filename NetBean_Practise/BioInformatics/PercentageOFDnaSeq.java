package com.shaheer;

import java.util.Scanner;

public class PercentageOFDnaSeq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =0,t=0,c=0,g=0;
        String dna;
        System.out.print("Enter a DNA sequence : ");
        dna = input.next();
        for(int i=0;i<dna.length();i++)
        {
            if(dna.charAt(i)=='A')
            {
                a++;
            }
            else if(dna.charAt(i)=='T')
            {
                t++;
            }
            else if(dna.charAt(i)=='C')
            {
                c++;
            }
            else if(dna.charAt(i)=='G')
            {
                g++;
            }
        }
        System.out.println("Percentage of A in your sequence is : "+(a/(float)dna.length())*100);
        System.out.println("Percentage of T in your sequence is : "+(t/(float)dna.length())*100);
        System.out.println("Percentage of C in your sequence is : "+(c/(float)dna.length())*100);
        System.out.println("Percentage of G in your sequence is : "+(g/(float)dna.length())*100);
    }
}


//FINAL
