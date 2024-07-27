package com.shaheer;

import java.util.Scanner;

public class Bioinformatics_palidrome2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String dna;
        System.out.print("Enter dna sequence  : ");
        dna=in.next();
        System.out.println("Palidrome is  : ");
        for(int i=0;i<dna.length()-2;i++)
        {
                StringBuilder s = new StringBuilder(dna.substring(i,i+3));
                StringBuilder s1 = new StringBuilder(s);
                s1.reverse();
                if(s1.toString().equals(s.toString()))
                {
                    System.out.println(s+"  ");
                }
            }
        }
    }
