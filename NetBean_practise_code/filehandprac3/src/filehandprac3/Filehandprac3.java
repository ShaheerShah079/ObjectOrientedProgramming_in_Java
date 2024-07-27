
package filehandprac3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Filehandprac3
{
    public static void main(String[] args) throws Exception
    {
     File f=new File("D:\\ABC.txt");
     FileReader fr =  new FileReader(f);
     BufferedReader br = new BufferedReader(fr); 
     boolean b = true;
     try{
      b =f.delete();
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
        System.out.println(b);


    }
    
}
