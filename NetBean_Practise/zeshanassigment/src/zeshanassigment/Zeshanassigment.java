
package zeshanassigment;

import java.util.Random;

public class Zeshanassigment
{
    public static int countTrue(boolean[][] arr)
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==true)
                    count++;
            }
        }
        
        return count;
    }
    
      public static int[][] replaceNagative(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]<0)
                    arr[i][j]=0;
            }
        }
        
        return arr;
    }
      
      public static int maxLength(int [][] arr)
      {
          int length=arr[0].length;
          for(int i=0;i<arr.length;i++)
          {
              if(arr[i].length>length)
              {
                  length = arr[i].length;
              }
          }
          return length;
      }
      
      public static int[][] randomFill(int [][]arr , int x)
      {
          Random obj = new Random();
          for(int i=0;i<arr.length;i++)
          {
              for(int j=0;j<arr[i].length;j++)
              {
                  arr[i][j]=obj.nextInt(2*x)-x;
              }
          }
          return arr;
      }
      
    public static void main(String[] args)
    {
                                //3
//       boolean [][] arr={{true, false},{true},{true,false,false}};
//        System.out.println(countTrue(arr));
        
                                //4
        
//         int [][] arr1={{10, -5},{12},{-7,5,-3}};
//         int [][]arr2=replaceNagative(arr1);
//for(int i=0;i<arr2.length;i++)
//        {
//            for(int j=0;j<arr2[i].length;j++)
//            {
//                System.out.print(arr2[i][j]+" ");
//            }
//            System.out.println("");
//        }

                                //2
//        int [][] arr3={{10, 5},{12},{7,5,3},{7,5,3,4,3},{7,5,3,4}};
//        System.out.println(maxLength(arr3));
        
        
                                //1
        
//        int[][] arr4=new int [4][5];
//         arr4=randomFill(arr4,7);
//         for(int i=0;i<arr4.length;i++)
//        {
//            for(int j=0;j<arr4[i].length;j++)
//            {
//                System.out.print(arr4[i][j]+" ");
//            }
//            System.out.println("");
//        }
    }
    
}
