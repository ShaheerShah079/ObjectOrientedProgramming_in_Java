package com.shaheer;

import java.util.Scanner;

public class Bioinformatics_palidrome_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dna;
        System.out.print("Enter dna sequence  : ");
        dna=in.next();
        System.out.println("Palidrome is  : ");
        for(int i=0;i<dna.length();i++)
        {
            for(int j= dna.length();j>i+2;j--)
            {
                StringBuilder s = new StringBuilder(dna.substring(i,j));
                StringBuilder s1 = new StringBuilder(s);
                s1.reverse();
                if(s1.toString().equals(s.toString()))
                {
                    System.out.println(s+"    ");
                    i=j;
                    break;
                }
            }
        }
    }
}


//Final