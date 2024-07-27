package com.company;
import java.util.Scanner;
public class prac5_calculator {
    private static float calculate(float a , char c , float b) {
        float ans = 0;
        switch (c) {
            case '+':
               ans=(a + b);
               break;
            case '-':
                ans=(a - b);
                break;
            case '*':
                ans=(a * b);
                break;
            case '/':
//                try {
                    ans=(a / b);
                    break;
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        float first = input.nextInt();
        System.out.println("enter operator");
        char sign = input.next().charAt(0);
        System.out.println("enter 2nd number");
        float second = input.nextInt();
        float answer = calculate(first , sign , second);
        System.out.println("Answer is "+answer);
    }
}
