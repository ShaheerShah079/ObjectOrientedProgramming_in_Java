/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.program;


public class methodoverload
{
    int x;
    int y;
    
   static double add(int a ,int b)
    {
        return a+b;
    }
 
  static int add(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
    
    
    public static void main(String[] args)
    {
        
        System.out.println(add(144,20));
        System.out.println(add(19,39,12,45));
        
        
        
        
        
        
        
    }
    
   
    
}
