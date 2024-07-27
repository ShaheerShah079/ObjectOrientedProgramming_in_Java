package practisese;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//import static practisese.hello.x;


public class Practisese
 {  
//    int x;
//    static{
////        x=10;
//        System.out.println("I am static bloskk");
//    }
//    static {
//        System.out.println("i am simnple block");
//    }
////static Abc ob;
////    static class Abc extends Thread {
////        @Override
////        public void run(){
////            for (int i = 0; i < 10; i++)
////            {
////                System.out.println("hello");
////            }
////        }
////    }
//
//    public static void main(String[] args)
//    {
////       String s= "461";
////       int a=Integer.parseInt(s);
////        System.out.println(a+2);
////Random r = new Random();
////       int num=r.nextInt(10);
////        System.out.println(num);
//        
//        
//        
//           
////        
//        
//        
////        System.out.println('A'-'a');
////       String smallest="";
////       String largest="";
////        String s="ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
////        int k=30;
////        int temp=k;
////        System.out.println(s.length());
////        System.out.println(k-1);
////       String [] sc= new String[(s.length()-(k-1))];
////       for(int i=0;i<(s.length()-(k-1));i++){
////           sc[i]=s.substring(i,temp);
////           System.out.println(sc[i]+" ");
////           temp++;
////       }
////       largest=sc[0];
////       smallest=sc[0];
////       for(int i=0;i<sc.length;i++){
////           if(largest.compareTo(sc[i])<0){
////               largest=sc[i];
////           }
////           else if(smallest.compareTo(sc[i])>0){
////               smallest=sc[i];
////           }
////       }
////        
////        System.out.println("Smallest"+smallest);   
////        System.out.println("largest"+largest);
////        
////        
//////        System.out.println("wel".compareTo(largest));
//      
////          Scanner sc=new Scanner(System.in);
////        String A=sc.next();
////        /* Enter your code here. Print output to STDOUT. */
////        A=A.toLowerCase();
////        if(A.length()<=50){
////        StringBuilder temp = new StringBuilder(A);
////        if(temp.reverse().toString().equals(A))System.out.println("Yes");
////        
////    }
//        
//        
//        
//         Scanner scan = new Scanner(System.in);
////        String s = scan.nextLine();
//        // Write your code here.
//// String s1[]= s.split("[,!?._'@ ]");
//// int space=0;
////       for(int i=0;i<s1.length;i++){
////       if(s1[i].equals("")){
////               space++;
////           }
////       }  
////         System.out.println(s1.length-space);
////       
////       for(int i=0;i<s1.length;i++){
////          if(s1[i].equals("")){}
////          else System.out.println(s1[i]);
//// 
////       }       
//       
//   
////s=s.toLowerCase();
////String [] s1= s.split("[ \n]");
////s="";
////        System.out.println("After");
////Arrays.toString(s1);
////for(int i=0;i<s1.length;i++){
////    for(int j=i+1;j<s1.length;j++){
////    if(s1[i].equalsIgnoreCase(s1[j])){
////        s1[j]="";
////        
////    }       
////}
////    if(s1[i]==""){}
////    else
////    s=s+" "+s1[i];
////}
////        System.out.println("After");
////        s=s.trim();
////        System.out.println(s);
////
//
//
//
//
////        int x,y;
////        try{
////            try{
////            x=scan.nextInt();
////            y=scan.nextInt();
////            }
////            catch(Exception e){
//////            if(x>=2147483647&&x<=-2147483648&&y>=2147483647&&y<=-2147483648){
////                throw new InputMismatchException();}
////            System.out.println(x/y);
////        }
////        catch(InputMismatchException e){
////            System.out.println(e);
////        }
////        catch(ArithmeticException e){
////            System.out.println(e);    
////        }
////        catch(Exception e){
////            System.out.println(e);
////        }
//
//
//
////        int i = scan.nextInt();
////         double d=scan.nextDouble();
////         scan = new Scanner(System.in);
////           String s= scan.nextLine();
////        // Write your code here.
////
////        System.out.println("String: " + s);
////        System.out.println("Double: " + d);
////        System.out.println("Int: " + i);
////        
////        
//
//
////System.out.println("================================");
////            for(int i=0;i<3;i++){
////                String s1=scan.next();
////                int x=scan.nextInt();
////                int space =15-s1.length();
////                String s="";
////                for(int j=0;j<space;j++){
////                      s=s+" ";                  
////                }
////                System.out.println(s);
////                //Complete this line
////                if(Integer.toString(x).length()==1){
////                    System.out.printf("%s%s00%d",s1,s,x);
////                }
////                else if(Integer.toString(x).length()==2){
////                    System.out.printf("%s%s0%d",s1,s,x);
////                } 
////                else{
////                    System.out.printf("%s%s%d",s1,s,x);
////                }
////                System.out.println();
////            }
////            System.out.println("================================");
//
//
//
//
////
////int a = 0;
////            int b = 2;
////            int n = 10;
////            double x=0;
////            
////             for(int j=0;j<n;j++){
////             int k=1;
////            while(k<=j){
//////                if(k==0)break;
////            
////             x=x+(Math.pow(2,k)*(double)b); 
//////                System.out.println("k is "+k+ " x is "+x);
////                k++;
////            }
////            System.out.print((int)(a+(Math.pow(2,0)*(b))+(x))+" ");
////            x=0;
////                 
////        }
//
////try{
//// long x=scan.nextLong();
////                System.out.println(x+" can be fitted in:");
////                if(x>=-128 && x<=127)System.out.println("* byte");
////                if(x>=-32768 && x<=32767)System.out.println("* short");
////                 if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
////                 if(x>=-2.330584301*Math.pow(10,18) && x<=2.330584301*Math.pow(10,18))System.out.println("* long");
////                //Complete the code
////            }
////            catch(Exception e)
////            {
////                System.out.println(scan.next()+" can't be fitted anywhere.");
////            }
//
//
//
//
//
//        Scanner sc = new Scanner(System.in);
//        int counter = 1;
//        System.out.println("Before loop "+sc.hasNextLine());
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine();
//
//            System.out.println(counter + " " + line);
//            counter++;
//            System.out.println("in Loop "+sc.hasNextLine());
//        }
//System.out.println("After loop "+sc.hasNextLine());
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }



       
//       String s2[] = null;
//       String s3[]=null;
//       String s4[] = null;
//       String s5[] = null;
//       String s6[] = null;
//       String s7[] = null;
//       String s8[] = null;
//       for(int i=0;i<s1.length;i++){
////           System.out.print(s1[i]+".  ");
//           s2=s1[i].split("!");  
//           System.out.println("");
//       }
//         for(int i=0;i<s2.length;i++){
////           System.out.print(s2[i]+".  ");
//           s3=s2[i].split(",");
//             System.out.println("");
//       } 
//       
//         for(int i=0;i<s3.length;i++){
////           System.out.print(s3[i]+".  ");
//           s4=s3[i].split("");
//             System.out.println("");
//       } 
//       
//         for(int i=0;i<s4.length;i++){
////           System.out.print(s4[i]+".  ");
//           s5=s4[i].split(".");
//             System.out.println("");
//       } 
//       
//         for(int i=0;i<s5.length;i++){
////           System.out.print(s5[i]+".  ");
//           s6=s5[i].split("_");
//             System.out.println("");
//       }   
//       
//         for(int i=0;i<s6.length;i++){
////           System.out.print(s6[i]+".  ");
//           s7=s6[i].split("'");
//             System.out.println("");
//       }  
//        
//         for(int i=0;i<s7.length;i++){
////           System.out.print(s7[i]+".  ");
//           s8=s7[i].split("@");
//             System.out.println("");
//       }  
//        
//         for(int i=0;i<s8.length;i++){
//           System.out.print(s8[i]+".  ");
//       }  
//        
        
// Write your code here
//static boolean flag=false;
//static int B;
//static int H;
//static{
//    flag=true;
//    B=new Scanner(System.in).nextInt();
//    H=new Scanner(System.in).nextInt();
//    try{
//        if(B<=0||H<=0){
//            throw new Exception("Breadth and height must be positive");
//        }
//    }catch(Exception e){
//         flag=false;
//        System.out.println(e);
//    }
//    
//    
//    
//}
public static void main(String[] args){
//		if(flag){
//			int area=B*H;
//			System.out.print(area);
//		}



 boolean flag=true;
 Scanner scan = new Scanner(System.in);
        long num=scan.nextInt();
        
        for(int i=2;i<num;i++){
            if(num==1) System.out.println("prime");
            else {
           if (num%i==0){
                flag=false;
                System.out.println("not prime"); 
                break;
            }
            }
        }
        if(flag)
        System.out.println("prime");
		
	}//end of main

}//end of clas