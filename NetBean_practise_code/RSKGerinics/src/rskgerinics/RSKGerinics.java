
package rskgerinics;


public class RSKGerinics
{
    
    public static void main(String[] args)
    {
//        int []a={2,3,5,1,6,12,7,9,8};
////        //////////////////////////////////
////        int max=MaxInArray(a); 
////        
////        ////////////////////////////////////
////        int []b=generateNewArray(max,a);
////        
////        ////////////////////////////////////
////          overRide(b,a);
////          
////        //////////////////////////////////////
////         print(a);
//        
//        int x=7; 
//        int index=search(x,a);
//        System.out.println("index"+index);
//        delete(index,a); 
//        print(a);

//       prime2to50();
        
//        System.out.println(add(2,4));
//        int a=10,b=11,c=14,d=9,e=17;
//        System.out.println("A has "+a+" b has "+b+" c has "+c+" c has "+c);
//
//        System.out.printf("A has {0} b has {1} c has {2} d had {3} e has {4} ",a,b,c,d,e);
        
//        String s1="Sheri jani";
//        for (int i = 0; i <s1.length() ; i++)
//        {
//          char ch=s1.charAt(i);  
//          System.out.print(ch+" ");
//        }
//        
//        
//        int n =-1234;
//        Posneg(n);
//        
//     }
//    public static void Posneg(int n){
//          String  s=Integer.toString(n);  
//          
//        if(s.charAt(0)=='-')
//        {
//            System.out.println("Negative number");
//        }
//        else
//            
//        {
//            System.out.println("Positve number");
//        }
    
//             byte count = 123;
//            count = (byte)(count*count);

               char c='x';
               byte b=11;
               
    
    }
    
    public static int smallest(int ...arr)
    {
        int smallest=arr[0];
        for (int i = 0; i < arr.length; i++)
        {
          if(smallest>arr[i]) 
          {
              smallest=arr[i];
          }
        }
        return smallest;
    }
    public static int add(int ... arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    
    
    
    public static void prime2to50(){
        for (int i = 2; i <=50; i++)
        {    
        int prime=prime(i);
       printPrime(i,prime);
        }
    }
    public static void printPrime(int x,int p){
        if(p==0)
        {
            System.out.println(x+" Non Prime");
        }
        else
        {
            System.out.println(x+" Prime");
        }  
    }
    
public static int prime(int n)   
{
   
    for(int i=2;i<=n-1;i++)
    {
        if(n%i==0)
        {
            return 0;
        }
    }
    return 1;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void delete(int i,int []a){
        
        for (int j = i; j <=a.length-2; j++)
        {
            a[j]=a[j+1];
        }
        
    }
    
    public static int search(int x,int []a){
         for (int i = 0; i < a.length; i++)
        {
            if(x==a[i]){
              return i;  
              
            }
        }
         return -1;
    }
    
    public static void print(int []a){
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+"  ");
        }
        System.out.println("");
    }
    public static int MaxInArray(int []a){
        int max=a[0];
        for (int i = 0; i < a.length; i++)
        {
            if(max<a[i]){
                max=a[i];
            }
    
        }
        return max;
    }
    
    public static int[] generateNewArray(int max,int []a){
        int b[]= new int[max+1];   
        for (int i = 0; i < a.length; i++)
        {
            b[a[i]]=1;
        }
        return b;
    }
    
    public static void overRide(int []b,int []a){
        int count=0;
        for (int i = 0; i < b.length; i++)
        {
            if(b[i]==1){
                a[count]=i;
                count++;
            }
        }
    }
   
}
        
       
