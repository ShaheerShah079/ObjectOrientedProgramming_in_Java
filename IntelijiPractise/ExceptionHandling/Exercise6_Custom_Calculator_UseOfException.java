package com.company;
// Exception class 1
class InvalidInputException extends  Exception{
    private String showDisplay;
    public InvalidInputException(String n){
        this.showDisplay=n;
    }
    @Override
    public String toString() {
        return showDisplay;
    }
}
//Exception class 2
class CantDivide0Exception extends  Exception{
    @Override
    public String toString() {
        return "Second number is not be 0!";
    }
}
//Exception class 3
class MaxInputException extends  Exception{
    private String showDisplay;
    public MaxInputException(String n){
        this.showDisplay=n;
    }
    @Override
    public String toString() {
        return showDisplay;
    }
}
//Exception class 4
class MaxMultiplicationException extends  Exception{
    @Override
    public String toString() {
        return "Multiplication answer must less than 20000 :";
    }
}

public class Exercise6_Custom_Calculator_UseOfException {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        java.util.Scanner inputchar = new java.util.Scanner(System.in);
        //Greeting
        System.out.println("Welcome to Shaheer calculator");
        while(true){
        //Take number and operatons
        System.out.print("Enter first number :  ");
        int num1 = input.nextInt();
        System.out.print("Enter operator(+,-,*,/) :  ");
        char operator = inputchar.next().charAt(0);
        System.out.print("Enter second number :  ");
        int num2 = input.nextInt();
        // Invalid input exception check
        if ((operator != '+') && (operator != '-')&& (operator != '*') && (operator != '/')) {
            try {
                throw new InvalidInputException("Invalid Operator!Plz enter correct operator(+,-,*,/)");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
        //Max input exception check
         else if(num1>1000||num2>1000){
            try {
                throw new MaxInputException("Input value are less than 1000!");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
         // if II exc and MI exc cant hapened by user then procced this
         else{
             switch (operator) {
                 case '+':
                     System.out.println("The addition of these number is : " + (num1 + num2));
                     break;
                 case '-':
                     System.out.println("The substraction of these number is : " + (num1 - num2));
                     break;
                 case '*':
                     int multipliyer = num1 * num2;
                     // Max Multiplier Exception check
                     if (multipliyer > 20000) {
                         try {
                             throw new MaxMultiplicationException();
                         } catch (Exception e) {
                             e.printStackTrace();
                             System.out.println(e);
                             break;
                         }
                     } else {
                         System.out.println("The multiplcaition of these number is : " + multipliyer);
                         break;
                     }
                 case '/':
                     //Cant divide by zero exception check
                     if (num2 == 0) {
                         try {
                             throw new CantDivide0Exception();
                         }
                         catch(Exception e){
                                 e.printStackTrace();
                             System.out.println(e);
                                 break;

                             }
                     } else {
                         System.out.println("The division of these number is : " + ((float) num1 / (float) num2));
                         break;
                     }
             }
             if(((num2!=0)&&(operator!='*'))||(((num1*num2)<20000)&&operator=='*'))
                break;
             }
        }





    }
}
