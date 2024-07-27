/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehanprac6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Personal's PC
 */
public class Filehanprac6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        File f;
     FileReader fr = null;
     BufferedReader br = null;
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
         
             int inc=0,lin=1,let=1;
         for(int i=0;i<line.length();i++)
         {
             if(line.charAt(i)=='\n')lin++;
             if(line.charAt(i)==' '||line.charAt(i)=='\n'){let++;continue;}
             else
             {
                 inc++;
             }
             }
         System.out.println("Leter"+let);
         System.out.println("Character "+inc);
         System.out.println("line "+lin);
                
     }
     catch(Exception e)
     {
         System.out.println(e);        
     }
     finally
     {
         
             try
             {
                 br.close();
             } catch (IOException ex)
             {
                 System.out.println(ex);
             }
         try
         {
             fr.close();
             
         } catch (IOException ex)
         {
            System.out.println(ex);
     
         }
    
      }
   }
}
