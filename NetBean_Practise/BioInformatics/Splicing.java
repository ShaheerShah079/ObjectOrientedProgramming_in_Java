package com.shaheer;
import java.util.Scanner;
public class Splicing {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String dna;
            System.out.println("Enter sequence of dna ");
            dna = input.next();
            String rna = dna.replace('T', 'U');
            int[] intronFirst = new int[10];
//            intronFirst[0]=0;
            int[] intronLast= new int[10];
//            intronLast[0]=0;
            int position = 0;
            boolean k;
            for(int i=0;i<rna.length()-1;i++)
            {
                int j = 0;
                k=false;
                if((rna.charAt(i)=='G')&&(rna.charAt(i+1)=='U'))
                {
                    intronFirst[position]=i;

                    for(j=i;j<rna.length();j++)
                    {
                        if((rna.charAt(j)=='G')&&(rna.charAt(j+1)=='U'))
                        {
                            intronFirst[position]=j;
                        }
                        else if((rna.charAt(j)=='A')&&(rna.charAt(j+1)=='G'))
                        {
                            intronLast[position]=j+1;
                            position++;
                            k=true;
                            i=j;
                            break;
                        }
                    }
                }
//                if(k)
//                {
//                    i=j;
//                }
            }
            position=0;
            char[] tempExon=new char[rna.length()];
            for(int i=0; i<rna.length();i++)
            {

                if(i>=intronFirst[position]&&intronLast[position]>=i)
                {
                    if(i==intronLast[position]){position++;}
                }
                else
                {
                    tempExon[i]=rna.charAt(i);
                }

            }
            String exon = new String(tempExon);
            System.out.println(exon);

        }
    }
