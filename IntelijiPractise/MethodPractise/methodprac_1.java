package com.company;

import java.util.Scanner;

public class methodprac_1 {
    public static void tablePrint(int numb){
        for(int i =1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",numb,i,numb*i);
        }
    }

    public static void paternPrint(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static int sumPrint(int num){
        if(num==1){
            return 1;
        }
        else{
            return num+sumPrint(num-1);
        }
    }

//    public static void paternPrint1(int num){
//        for(int i=num;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
 public static float averagePrint(int ... arr){
        int sum=0;
        for (int el:arr){
            sum+=el;
        }
        float aver;
        aver = (float) sum / arr.length;
        return aver;
 }

public static void paternRec(int num){
        if (num>0){
            paternRec(num-1);
            for(int i=1;i<=num;i++){
                System.out.print("*");
            }
            System.out.println();
        }
}
    public static void paternRec2(int num) {
        if (num > 0) {
            for(int i=1;i<=num;i++){
                System.out.print("*");
            }
            System.out.println();
            paternRec2(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


                    //Q1
//        int num= input.nextInt();
//        tablePrint(num);



                        //Q2
//        int num= input.nextInt();
//        paternPrint(num);


                        //Q3
//        int num= input.nextInt();
//        System.out.println(sumPrint(num));



                        //Q4
//        methodprac_2 myobj = new methodprac_2();
//        int num= input.nextInt();
//        myobj.paternPrint1(num);
//        String name = myobj.name;
//        name=input.nextLine();
//        System.out.println(name);
                        //Q5
//        System.out.println("average of two number is : "+averagePrint(2,5));
//        System.out.println("average of three number is : "+averagePrint(2,5,6));
//        System.out.println("average of four number is : "+averagePrint(2,5,8,4));
//        System.out.println("average of five number is : "+averagePrint(2,5,5,9,2));
//        System.out.println("average of six number is : "+averagePrint(2,5,5,8,1,6));
//        System.out.println("average of seven number is : "+averagePrint(2,5,5,8,4,1,8));


                    //Q6
//        paternRec(5);
//        System.out.println("");
//        paternRec2(6);
    }
}
