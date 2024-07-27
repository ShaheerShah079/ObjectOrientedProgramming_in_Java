/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practises;

import java.util.Scanner;

/**
 *
 * @author Personal's PC
 */
public class Practises
{

  public static void method(String[]name,float[][]matrix,int n,float min,float[]cal)
    {
        int pos=0;   
        float [][]matrix1=new float[n-1][n-1];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<i;j++)
                {
                    if(min == matrix[i][j])
                    {
                        
                      String [] name1= new String[n-1];
                       for(int k=0,l=0;k<n||l<n-1;k++,l++)
                       {
                           if(k==i)
                           {
                               l--;
                               continue;
                           }
                           if(k==j)
                           {
                               name1[l]=name[k]+name[i];
                           }
                           else
                           {    
                           name1[l]=name[k];
                       }    
                       }
                       for(int m=0;m<n-1;m++)
                       {
                       for(int o=0;o<=m;o++)
                       {
                           if(m==o){ matrix1[m][o]=0;}
                           else if(m==j||o==j)
                           {
//                               System.out.println(m+" ."+o);
                               matrix1[m][o]=cal[pos];
                               matrix1[o][m]=20;;
                               pos++;
                           }
                           else
                           {
                               matrix1[m][o]=101;
                               matrix1[o][m]=15;
                           }
                           
                       }    
                       }
                    }
                }
            }
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-1;j++)
                {
                    System.out.print(matrix1[i][j]+" ");
                }
                System.out.println("");
            }
        }
    
  
    public static void main(String[] args)
    {     
Scanner in = new Scanner(System.in);
String [] name={"A","B","C","D"};
      float [][] matrix =new float[name.length][name.length];
     for(int i=0;i<name.length;i++)
     {
         for(int j=0;j<=i;j++)
         {
             if(i==j) matrix[i][j]=0;
             else
             {
                 System.out.print("Enter "+name[i]+" "+name[j]+" Allignment Score : ");
                 matrix[i][j]=in.nextFloat();
                 matrix[j][i]=matrix[i][j];
             }
         }
     }
        for (String item : name)
        {
            System.out.print("  " + item);
        }
        System.out.println("");
     for(int i=0;i<name.length;i++)
     { 
         System.out.print(name[i]+" ");
         for(int j=0;j<name.length;j++)
         {
             System.out.print(matrix[i][j]+" ");   
          }
         System.out.println("");    
         }
     float min=10;
     float []cal={95,55};
         method(name,matrix,name.length,min,cal);












    }
    
}
