
package filehandlingpractise;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Filehandlingpractise
{

   
    public static void main(String[] args) throws IOException
    {
        char choice;
       File f = new File("D:\\ABC.txt");
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        Scanner in = new Scanner(System.in);
         Scanner in1 = new Scanner(System.in);
        String line = new String();
         String s;
        try{
        fr = new FileReader(f);
        br = new BufferedReader(fr); 
        line=br.readLine();
        while(true)
        {
            String l=br.readLine();
            if(l==null) break;
            line=line+"\n"+l;
        }
        
        fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        do{
            System.out.println("Enter new");
            s =in.nextLine();   
        if(line==null)
            line =s;
        else
         line=line+"\n"+s;
        
            System.out.println("press x to break and any other key to cont..");
        choice=in1.next().charAt(0);
        }while(choice!='x');
    
        }
        catch(IOException e)
        {
            System.out.println(e);            
        }
         finally
        { 
            bw.write(line);     
           try
           {
               bw.close();
           } catch (IOException ex)
           {
               Logger.getLogger(Filehandlingpractise.class.getName()).log(Level.SEVERE, null, ex);
           }
           try
           {
               fw.close();
           } catch (IOException ex)
           {
               Logger.getLogger(Filehandlingpractise.class.getName()).log(Level.SEVERE, null, ex);
           }
        }      
        
    }
    
}
