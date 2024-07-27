/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandlingprac5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Personal's PC
 */
public class Filehandlingprac5
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       
    Scanner in = new Scanner(System.in);
         Scanner in1 = new Scanner(System.in);
    File f;
     FileReader fr = null;
     BufferedReader br = null;
          FileWriter fw = null;
        BufferedWriter bw = null;
     String line= new String();
     String l;
     String p=new String();
     try
     {
         f = new File("D:\\ABC.txt");
         fr= new FileReader(f);
         br = new BufferedReader(fr);
         line =br.readLine();
         while(true&&line!=null)
         {
             l=br.readLine();
             if(l==null) break;
             line=line+"\n"+l;
             
         }
         System.out.println(line);
         System.out.println("Enter string you want to replace");
         String s1 = in.nextLine();
         System.out.println("Enter another string ");
         String s2=in.nextLine();
         if(line.contains(s1))
         {
             line =line.replaceFirst(s1, s2);
         }
         fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        bw.write(line);
        
         
     }
     catch(Exception e)
     {
         System.out.println(e+" 1");        
     }
     finally
     {
         try
         {
             try
             {
                 br.close();
                 bw.close();
             } catch (Exception ex)
             {
                 System.out.println(ex+" 2");
             }
             fr.close();
             fw.close();
             
         } catch (Exception ex)
         {
            System.out.println(ex+" 3");
      }
    
}
    }
    
}
