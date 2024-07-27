package filehandlingpractise2;

import java.io.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filehandlingpractise2
{
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
             line=line+" "+l;
             
         }
//         System.out.println(line);
        String []s1 = line.split(" "); 
//         System.out.println(Arrays.toString(s1));
         int max =s1[0].length();
         for(int i=0;i<s1.length;i++)
         {
             if(s1[i].length()>max){
                 max=s1[i].length();
                 p = s1[i];
             }
             
             
         }
         System.out.println(p+ " "+max);
         
         
         
     }
     catch(Exception e)
     {
         System.out.println(e);        
     }
     finally
     {
         try
         {
             try
             {
                 br.close();
             } catch (IOException ex)
             {
                 System.out.println(ex);
             }
             fr.close();
             
         } catch (IOException ex)
         {
            System.out.println(ex);
         }
         
     }
     


    }
    
}
