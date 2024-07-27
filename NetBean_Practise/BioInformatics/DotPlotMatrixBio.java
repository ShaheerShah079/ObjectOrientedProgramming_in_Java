package com.shaheer;
import java.util.Scanner;
public class DotPlotMatrixBio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = new String();
        String s2 = new String();
        System.out.println("Enter First String");
        s1=input.next();
        System.out.println("Enter second String");
        s2 = input.next();
        System.out.print("   ");
        for(int i =0 ;i<s1.length();i++)
        {
            System.out.print(s1.charAt(i)+"  ");
        }
        System.out.println("");
        for(int i=0 ; i <s2.length();i++)
        {System.out.print(s2.charAt(i)+"  ");
            for(int j=0 ; j <s1.length();j++)
            {

                if(s2.charAt(i)==s1.charAt(j))
                {
                    System.out.print(".  ");
                }
                else
                {
                    System.out.print("   ");
                }

            }
            System.out.println("");
        }



    }
}



//FINAL