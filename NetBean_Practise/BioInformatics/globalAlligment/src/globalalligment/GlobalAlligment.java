package globalalligment;
import java.util.Scanner;
public class GlobalAlligment
{ 
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
        int [][] matrix = new int [s2.length()][s1.length()];
        int horizontal,vertical,daignol,max;
        
        for(int i=1,j=1 ;i<s1.length()&&j<s2.length();i++,j++)
        {
          if(i<s1.length())matrix[0][i]=i*-1;
          if(j<s2.length())matrix[i][0]=i*-1;
        }
//        for(int i=1 ;i<s2.length();i++)
//        {
//            matrix[i][0]=i*-1;
//        }
//        
        for(int i=1;i<s2.length();i++)
        {
            for(int j=1;j<s1.length();j++)
            {
                horizontal = matrix[i][j-1]+gap;
                vertical = matrix[i-1][j]+gap;
                if(s1.charAt(j)==s2.charAt(i)) daignol=matrix[i-1][j-1]+match;
                else daignol=matrix[i-1][j-1]+misMatch;
           
                max = horizontal;
                if(vertical>max)  max = vertical;
                if(daignol>max)   max = daignol;
                
                matrix[i][j]=max;
            }
        }

        for(int i=0;i<s1.length();i++)
        {
            
            System.out.print(" "+s1.charAt(i));
        }
       System.out.println("");
        
        for(int i=0;i<s2.length();i++)
        {
            System.out.print(s2.charAt(i)+" ");
            for(int j=0;j<s1.length();j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }       
    }
}
