/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalalligment2;

import java.util.Scanner;

/**
 *
 * @author Personal's PC
 */
public class Globalalligment2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
Scanner in = new Scanner(System.in);
        System.out.println("Enter first sequence");
        String temp1 = in.next();
        System.out.println("Enter second sequence");
        String temp2= in.next();
        System.out.println("Enter score of gap");
        int gap=in.nextInt();
        System.out.println("Enter score of match");
        int match=in.nextInt();
        System.out.println("Enter score of mismatch");
        int misMatch=in.nextInt();
        StringBuilder s1 = new StringBuilder(temp1);
        StringBuilder s2 = new StringBuilder(temp2);
        s1.insert(0, ' ');
        s2.insert(0,' ');
        s1.insert(1, ' ');
        s2.insert(1,' ');
        String [][] matrix = new String [s2.length()+1][s1.length()+1];
        String horizontal,vertical,daignol,max;
        
       for(int i=0 ;i<s1.length();i++)
        {
            matrix[0][i]=Character.toString(s1.charAt(i));
        }
        
        for(int i=0 ;i<s2.length();i++)
        {
            matrix[i][0]=Character.toString(s2.charAt(i));
        }
        matrix[1][1]="0";
        for(int i=2 ;i<s1.length();i++)
        {
            matrix[1][i]=Integer.toString((i-1)*-1);
        }
        
        for(int i=2 ;i<s2.length();i++)
        {
            matrix[i][1]=Integer.toString((i-1)*-1);
        }
        
        for(int i=2;i<s2.length();i++)
        {
            for(int j=2;j<s1.length();j++)
            {
                horizontal = Integer.toString(Integer.parseInt(matrix[i][j-1])+gap);
                vertical = Integer.toString(Integer.parseInt(matrix[i-1][j])+gap);
                if(s1.charAt(j)==s2.charAt(i)) daignol=Integer.toString(Integer.parseInt(matrix[i-1][j])+match);
                else daignol=Integer.toString(Integer.parseInt(matrix[i-1][j])+misMatch);
           
                max = horizontal;
                if(Integer.parseInt(vertical)>Integer.parseInt(max))  max = vertical;
                if(Integer.parseInt(daignol)>Integer.parseInt(max))   max = daignol;
                
                matrix[i][j]=max;
            }
        }
        System.out.println("");
        
        for(int i=0;i<s2.length();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        
        
    }
        }
    