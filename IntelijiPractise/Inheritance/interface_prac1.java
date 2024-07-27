package com.company;
import java.util.Scanner;
interface arthmetic{
    int sum(int n);
}
class Divisor_sum implements arthmetic{
    int num;
    public int sum(int n){
        this.num=n;
        int sum=0;
        for(int i=1;i<=this.num;i++){
            if(this.num%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
public class interface_prac1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num <= 100) {
                Divisor_sum a = new Divisor_sum();
                System.out.println(a.sum(num));
                break;
            } else {
                System.out.println("Enter number less than 100");
            }
        }while(true);
        }
    }
