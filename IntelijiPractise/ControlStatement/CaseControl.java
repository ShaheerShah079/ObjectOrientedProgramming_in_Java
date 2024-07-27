package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
        switch (a) {
            case 1 -> System.out.println("In 1");
            case 2 -> System.out.println("In 2");
            case 3 -> System.out.println("In 3");
            case 4 -> System.out.println("In 4");
            case 5 -> System.out.println("In 5");
            default -> System.out.println("I am in default");
        }
    }
}
