package com.company;
import java.util.Scanner;
public class pract2_stringWordCheck {
    private static int countword(String name){
        int count=1;
        for (int i=0;i<name.length();i++){
            if(name.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter the string");
        name= input.nextLine();
        int count = countword(name);
        System.out.println("the number of worf you enter is "+count);

    }
}
