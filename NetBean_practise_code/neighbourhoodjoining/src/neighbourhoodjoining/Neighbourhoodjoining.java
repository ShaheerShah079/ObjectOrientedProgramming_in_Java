package neighbourhoodjoining;
import java.util.Scanner;
public class Neighbourhoodjoining
{
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of oraganism"); 
        String name = in.next();
        int [][] matrix=new int[name.length()][name.length()];
         int [][] M=new int[name.length()][name.length()];
        int [] r = new int [name.length()];
        float [] s = new float [name.length()];
        int first=0,second=0;
        for(int i=0;i<name.length();i++){
            for(int j=0;j<=i;j++){
                if(name.charAt(i)==name.charAt(j)) {
                    matrix[i][j]=0;
                }   
                else
                {
                  System.out.println("Enter number of "+name.charAt(i)+" "+name.charAt(j)+" Alligment");
                  matrix[i][j]=in.nextInt();
                  matrix[j][i]=matrix[i][j];
                }
             }
        }
         for(int j=0;j<name.length();j++){
                 System.out.print("  "+name.charAt(j));
            }
         System.out.println("");
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
            for(int j=0;j<name.length();j++){
                 System.out.print(matrix[i][j]+"  ");
                 r[i]+=matrix[j][i];
            }
            System.out.println(""); 
        }
        System.out.println("");
         for(int i=0;i<name.length();i++){
            
             System.out.println("r"+name.charAt(i)+" = "+r[i]+"  "); 
        }
         System.out.println("");
             for(int j=0;j<name.length();j++){
                 System.out.print("  "+name.charAt(j)+"  ");
            } 
             System.out.println("");
          for(int i=0;i<name.length();i++){
              System.out.print(name.charAt(i)+" ");
            for(int j=0;j<i;j++){
                M[i][j]=(matrix[i][j])-((r[i]+r[j])/(name.length()-2));
                 System.out.print(M[i][j]+"  ");
            }
            System.out.println(""); 
        }
          System.out.println("");
          int min = M[0][0];
         for(int i=0;i<name.length();i++){
            for(int j=0;j<i;j++){
                if(min>M[i][j])
                {
                    min=M[i][j];
                }
            } 
        }    
           System.out.println("minimum "+min);  
           boolean temp = false;
        for(int i=0;i<name.length();i++){
            for(int j=0;j<i;j++){
                if(M[i][j]==min)
                {
                  first=i;
                  second=j;
                  temp=true;
                  s[0]=(matrix[i][j]/(float)2)+((r[i]-r[j])/(float)(2*(name.length()-2)));
                  s[1]=matrix[i][j]-s[0];
                  System.out.println("S"+name.charAt(j)+"U - "+s[0]);
                  System.out.println("S"+name.charAt(i)+"U - "+s[1]);
                    break;
                }
            } 
            if(temp)
            {
                break;
            }
        }
     
        for(int i=0,j=2;i<name.length()&&j<name.length();i++,j++){
              if(i==first||i==second) 
              {
                  j--;
                  continue;
              }
            s[j]=(matrix[i][first]+matrix[i][second]-matrix[first][second])/(float)2; 
            System.out.println("S"+name.charAt(i)+"U - "+s[j]);    
        }
             
    }    
}
