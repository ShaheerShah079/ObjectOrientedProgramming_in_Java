package com.company;
import java.util.Scanner;
public class Loop_q1 {

    public static void main(String[] args) {
                 // Q1
//       for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }

                  //Q2
//        int sum=0;
//        for(int i=1;i<=10;i++){
//            sum+=i;
//        }
//        System.out.println(sum);



                    //Q3
//       Scanner input = new Scanner(System.in);
//       int table=input.nextInt();
//       for(int i=1;i<=10;i++){
//           System.out.println(table+"X"+i+" = "+table*i);
//       }


                // Q4
        // Scanner input = new Scanner(System.in);
//      int num=input.nextInt();
//      int fact=1;
//        for(int i=1;i<=num;i++){
//          fact*=i;
//       }
//        System.out.println(fact);



                //Q5
//        Scanner input = new Scanner(System.in);
//     int num=input.nextInt();
//     int pow=input.nextInt();
//     int ans=1;
//     for(int i=1;i<=pow;i++){
//         ans*=num;
//     }
//        System.out.println(ans);



                //Q6
//        Scanner input = new Scanner(System.in);
//        int numb=input.nextInt();
//        int divider=10;
//        while(numb!=0){
//            System.out.print(numb%divider);
//            numb/=10;
//        }




                //Q7
//        Scanner input = new Scanner(System.in);
//        int sumeven=0,sumodd=0;
//        char choice;
//        do{
//          System.out.print("Enter integer : ");
//          int num = input.nextInt();
//          if (num%2==0)
//          {
//              sumeven +=num;
//          }
//          else {
//              sumodd+=num;
//          }
//          System.out.println("Enter y to continue again");
//            choice=input.next().charAt(0);
//      }while((choice == 'y')||(choice=='Y'));
//        System.out.println("Sum of even number is "+ sumeven);
//        System.out.println("Sum of odd number is "+ sumodd);





                    //Q8
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number");
//        int num = input.nextInt();
//        int check=0;
//        for (int i=2;i<num;i++){
//            if (num%i==0){
//                check++;
//            }
//        }
//        if(check==0){
//            System.out.println("Prime number");
//        }
//        else{
//            System.out.println("Not a prime");
//        }


                            //Q9 HCF
//        Scanner input =new Scanner(System.in);
//        System.out.println("Enter first number");
//        int num1 =input.nextInt();
//        System.out.println("Enter second number");
//        int num2 = input.nextInt();
//        int [] arr1= new int [99];
//        int ar1=0;
//        int [] arr2= new int [99];
//        int ar2=0;
//        while(num1!=1){
//            for(int i=2;i<99;i++){
//                if(num1%i==0){
//                    arr1[ar1]=i;
//                    ar1++;
//                num1/=i;
//                i=1;
//                }
//            }
//        }
//
//        while(num2!=1){
//            for(int i=2;i<99;i++){
//                if(num2%i==0){
//                    arr2[ar2]=i;
//                    ar2++;
//                    num2/=i;
//                    i=1;
//                }
//            }
//        }
//        int hcf=1;
//        for(int i=0;i<ar1;i++){
//            for(int j=0;j<ar2;j++){
//             if(arr1[i]==arr2[j]){
//               hcf*=arr1[i];
//               arr1[i]=0;
//               arr2[j]=0;
//
//             }
//            }
//        }
//        System.out.println(hcf);





                    //Q10
//Scanner input = new Scanner(System.in);
//char choice;
//do {
//    System.out.println("Enter two number");
//    int num1=input.nextInt();
//    int num2=input.nextInt();
//    System.out.println("The sum of two number is "+(num1+num2));
//    System.out.println("Press Y and y to continue again");
//    choice = input.next().charAt(0);
//}while(choice=='Y'||choice=='y');
//        System.out.println("GOOD BYE");



                    //Q11
//int countposi=0,countneg=0,countzero=0;
//char choice;
//Scanner input = new Scanner(System.in);
//do {
//    System.out.print("Enter a number : ");
//    int num = input.nextInt();
//    if (num == 0)
//        countzero++;
//    else if (num > 0)
//        countposi++;
//    else
//        countneg++;
//
//    System.out.println("Press Yes to continue");
//    choice = input.next().charAt(0);
//}while(choice=='Y'||choice=='y');
//        System.out.printf("Number of positive number is %d \nNumber of negative number is %d \n" +
//                "Number of zero is %d \n",countposi,countneg,countzero);





                    //Q12
//        Scanner input = new Scanner(System.in);
//        int max=0,min=10000;
//        int num1;
//        do {
//    System.out.print("Enter number and press -999 ton stop processing : ");
//    num1 = input.nextInt();
//    if (num1==-999)
//    {
//        break;
//    }
//    if (num1 > max)
//    { max = num1;}
//    if (num1 < min)
//    { min =num1;}
//
//}while(true);
//        System.out.println("Maximum number is "+max+" Minimum number is "+min);




                    //Q12
//        Scanner input = new Scanner(System.in);
//        int ans,sum=0;
//        System.out.println("Enter a number to check its armstrong or not");
//        int armnum =input.nextInt();
//        int num=armnum;
//        while(num!=0)
//        {
//            ans = num%10;
//            sum+=(ans*ans*ans);
//            num/=10;
//        }
//        System.out.println(sum);
//        if(sum==armnum){
//            System.out.println("Armstrong");
//        }
//        else{
//            System.out.println("Not a Armstrong");
//        }




                            //Q14
        int num1=0,num2=1,num3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the term of series of fibonici : ");
        int limit=input.nextInt();
        System.out.print(num1+" , "+num2+" , ");
        for(int i=1;i<=limit-2;i++){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(num3+" , ");
        }


                        //Q15
//        Scanner input = new Scanner(System.in);
//        float sum=0.0f;
//        System.out.print("Enter the last num of series : ");
//        int limit=input.nextInt();
//        for(int i=1;i<=limit;i++){
//            sum+=((float)1/i);
//        }
//        System.out.print(sum);




                    // Q16


    }

}
