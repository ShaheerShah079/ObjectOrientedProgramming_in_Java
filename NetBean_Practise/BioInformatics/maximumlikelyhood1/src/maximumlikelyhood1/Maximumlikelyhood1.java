package maximumlikelyhood1;
import java.util.Scanner;
public class Maximumlikelyhood1
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of organisms");
        String name=in.next();
        System.out.println("Enter the character of organism");
        String character = in.next();
        System.out.println("Enter 1 if specific chracter is found in an organism otherwise 0");
        int [][] arr = new int[name.length()][character.length()];
        
        for(int i=0;i<name.length();i++)
        {
            for(int j=0;j<character.length();j++)
            {
                System.out.println("organism "+name.charAt(i)+" "+"character "+character.charAt(j));
                arr[i][j]=in.nextInt();
            }
        }           
        System.out.print("  ");
        
        for(int i=0;i<character.length();i++)
        {
            System.out.print(character.charAt(i)+" ");
        }
        System.out.println("");
        for(int i=0;i<name.length();i++)
        {
            System.out.print(name.charAt(i)+" ");
            for(int j=0;j<character.length();j++)
            {
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println("");
        }
          
        for(int i=0;i<character.length();i++)
        {
            System.out.print(character.charAt(i)+" ");
            for(int j=0;j<name.length();j++)
            {
                if(arr[j][i]==1)
                {
                    System.out.print(name.charAt(j)+" ");
                }
            }
            System.out.println("");
        }         
    }
}
    
