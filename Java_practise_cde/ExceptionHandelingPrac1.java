package com.shaheer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandelingPrac1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        try
        {
            a= input.nextInt();
            b=input.nextInt();
            System.out.println(a/b);
        }
        catch(InputMismatchException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
