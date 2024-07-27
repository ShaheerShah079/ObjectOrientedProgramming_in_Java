package com.shaheer;

import java.util.Arrays;
import java.util.Scanner;

public class splicingpractise2 {
    static String [][] alternatesplicing = new String[15][50];
    static int p=0;
    public static String[] swap(String[] a, int i, int j)
    {
        String temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
    public static void permute(String[] str, int l, int r)
    {
        if (l == r)
        {
            alternatesplicing[p] = str;
            p++;
        }        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String dna;
        System.out.println("Enter sequence of dna ");
        dna = input.next();
        String rna = dna.replace('T', 'U');
        int[] intron = new int[20];
        intron[0] = 0;
        int position = 1;
        boolean k;
        for (int i = 0; i < rna.length(); i++) {
            int j = 0;
            k = false;
            if ((rna.charAt(i) == 'G') && (rna.charAt(i + 1) == 'U')) {
                intron[position] = i;
                for (j = i; j < rna.length(); j++) {
                    if ((rna.charAt(j) == 'G') && (rna.charAt(j + 1) == 'U')) {
                        intron[position] = j;
                    } else if ((rna.charAt(j) == 'A') && (rna.charAt(j + 1) == 'G')) {
                        position++;
                        intron[position] = j + 2;
                        position++;
                        k = true;
                        break;
                    }
                }
            }
            if (k) {
                i = j+2;
            }

        }
        intron[position]=(rna.length());
        int[] in = new int[position+1];
        for(int i=0;(i<position+1);i++)
        {
            in[i]=intron[i];
        }
        intron=in;

        int j=0;
        String[] exon = new String[(position+1)/2];
        for(int i=0;i<intron.length;i+=2)
        {
            exon[j]=rna.substring(intron[i],intron[i+1]);
            j++;
        }
        int n = exon.length;
        permute(exon,0,n -1);


        System.out.println(Arrays.deepToString(alternatesplicing));
    }
}



//FINAL