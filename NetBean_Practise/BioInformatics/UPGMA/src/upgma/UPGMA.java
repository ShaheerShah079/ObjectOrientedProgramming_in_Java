package upgma;
import java.util.Scanner;
public class UPGMA
{
    public static float[] calculation(float[][] matrix ,int n,int f,int s)
    {
        float[] cal=new float [n-2];
        int pos=0;
        for(int i=0;i<n;i++)
        {
        
            if(i==f||i==s) continue;
            else
            {   
            cal[pos]=(matrix[f][i]+matrix[s][i])/(float)2;    
            }
            
           pos++;
        }
        return cal;
    }
    
    public static float min(float[][] matrix)
    {
        float min = matrix[1][0];
         for(int i=0;i<matrix.length;i++)
     {
         for(int j=0;j<i;j++)
         {
             if(matrix[i][j]<min) min=matrix[i][j];
             
         }
     }
         return min;
    }
    
    public static void method(String[]name,float[][]matrix,int n)
    {
        String [] name1= new String[n-1];
        float [][]matrix1=new float[n-1][n-1];
        if(n==2) 
        {
            return;
        }
        else
        {   
            float min=min(matrix);
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<i;j++)
                {
                    if(min == matrix[i][j])
                    {
                       int pos=0;
                       float [] cal=calculation(matrix,n,i,j);  
                       // combine nodes
                       for(int k=0,l=0;k<n||l<n-1;k++,l++)
                       {
                           if(k==i)
                           {
                               l--;
                               continue;
                           }
                           if(k==j)
                           {
                               name1[l]=name[k]+name[i];
                           }
                           else
                           {
                           name1[l]=name[k];
                       }
                       }
                       // end of combining nodes
                       
                       
                       for(int m=0;m<n-1;m++)
                       {
                       for(int o=0;o<=m;o++)
                       {
                           if(m==o)matrix1[m][o]=0;
                           else if(m==j||o==j)
                           {
                               matrix1[m][o]=cal[pos];
                               matrix1[o][m]=matrix1[m][o];
                               pos++;
                           }
                           else
                           {
                               for(int m1=0;m1<n;m1++)
                               {
                                   for(int o1=0;o1<m1;o1++)
                                   {
                                       if(name1[m]==name[m1]&&name1[o]==name[o1])
                                       {
                                           matrix1[m][o]=matrix[m1][o1];
                                           matrix1[o][m]=matrix1[m][o];
                                       }
                                   }
                               }
                              
                           }
                           
                       }    
                       }                
                    }
                }
            }
            for(int i=0;i<n-1;i++)
            {
                System.out.print("  "+name1[i]+" ");
            }
            System.out.println("");
            for(int i=0;i<n-1;i++)
            {
                System.out.print(name1[i]+" ");
                for(int j=0;j<n-1;j++)
                {
                    System.out.print(matrix1[i][j]+" ");
                }
                System.out.println("");
            }
        }
        
          method(name1,matrix1,name1.length);
    }

    public static void main(String[] args)
    {
     Scanner in =new Scanner(System.in);
        System.out.println("Enter the length of organism");
        int len=in.nextInt();
      String [] name=new String[len];
      for(int i=0;i<name.length;i++)
      {
          System.out.println("Enter the "+(i+1)+" name of organisms");
          name[i]=in.next();
      }
      
      float [][] matrix =new float[name.length][name.length];
     for(int i=0;i<name.length;i++)
     {
         for(int j=0;j<=i;j++)
         {
             if(i==j) matrix[i][j]=0;
             else
             {
                 System.out.print("Enter "+name[i]+" "+name[j]+" Allignment Score : ");
                 matrix[i][j]=in.nextFloat();
                 matrix[j][i]=matrix[i][j];
             }
         }
     }
        for (String item : name)
        {
            System.out.print("  " + item);
        }
        System.out.println("");
     for(int i=0;i<name.length;i++)
     { 
         System.out.print(name[i]+" ");
         for(int j=0;j<name.length;j++)
         {
             System.out.print(matrix[i][j]+" ");   
          }
         System.out.println("");    
         }
     
         method(name,matrix,name.length);
     
    }
    
}
