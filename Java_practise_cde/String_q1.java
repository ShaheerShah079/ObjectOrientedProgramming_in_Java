package com.company;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class String_q1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Scanner i= new Scanner(System.in);
        String name=s.nextLine();
        do {
            System.out.print("The character at position : ");
            int check=i.nextInt();
            System.out.println(name.charAt(check));
        }while(true);

    }
}
