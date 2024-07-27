package com.company;

import java.util.Scanner;

public class method_prac {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
        public static boolean checkVowel(char num) {
            if (num == 'a'||num == 'e'||num == 'i'||num == 'o'||num == 'u'||
                    num == 'A'||num == 'E'||num == 'I'||num == 'O'||num == 'U') {
                return true;
            }
            else {
                return false;
            }
        }

        public static boolean isPrime(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum++;
            }
        }
        if(sum==2){
            return true;
        }
        else{
            return false;
        }

        }
public static boolean isPalidrome(int num){
        int temp =num;
        int remind,rev=0;
        while(temp>0)
        {
            remind=temp%10;
            temp/=10;
            rev=(rev*10)+remind;
        }
        if(rev==num){
            return true;
        }
        return false;
}





    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


                    //Q1
//        System.out.println("enter a number");
//        int num =input.nextInt();
//        if(isEven(num)){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }




                        //Q2
//        int sum=0;
//        char cond;
//        do {
//            System.out.println("Enter a character");
//            char vowel = input.next().charAt(0);
//            if (checkVowel(vowel)) {
//                System.out.printf("Enter number is vowel ");
//                sum++;
//            }
//            else {
//                System.out.println("Enter number is constant");
//            }
//            System.out.println("press y to contiue again");
//            cond = input.next().charAt(0);
//        }while(cond=='y'||cond=='Y');
//        System.out.println("Number of vowel you enter is "+sum);





                        //Q3
//        for(int i=1;i<500;i++){
//            if(isPrime(i)){
//                System.out.print(i+"  ");
//            }
//        }



                            //Q4
//        System.out.println("Enter a number to check its palidrome or not.");
//        int num = input.nextInt();
//        if(isPalidrome(num)){
//            System.out.println("Number is palidrome");
//        }
//        else{
//            System.out.println("Number is not palidrome");
//        }






    }
}
