package filinffinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Filinffinal
{
    public static void main(String[] args) 
    {
        String line;
    File f = new File("D:\\ABC.txt");
    try
    {
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    line =br.readLine();
    while(line!=null)
    {
        System.out.println(line);
        line = br.readLine();
        
    }
    
    br.close();
    fr.close();
    FileWriter fw=new FileWriter(f);
    BufferedWriter bw = new BufferedWriter(fw);
    
    java.util.Scanner in = new java.util.Scanner(System.in);
    String line1 =in.next();
    
    bw.write(line1);
    bw.close();
    fw.close();
    
     
    }
    catch(Exception e){}
    
    
    
    
    }
    
}
