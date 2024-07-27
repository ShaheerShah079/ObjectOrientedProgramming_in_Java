package com.company;

import java.util.Scanner;

public class exeption_prac {
    public static void main(String[] args) {
boolean b;
        do {
            int[] mark = {12, 223, 34, 324, 325, 134, 909, 234, 342, 68};
            System.out.println("enter the index");
            Scanner input = new Scanner(System.in);
            int ind = input.nextInt();
            try {
                System.out.println(mark[ind]);
                b=false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("out of index exception try again");
                b=true;
            }
        }while(b);
    }
    }

