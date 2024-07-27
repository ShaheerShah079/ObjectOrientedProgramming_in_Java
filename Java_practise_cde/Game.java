package com.shaheer;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] symbolsForCons={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'};
        GameClass ob = new GameClass(symbolsForCons);
        for(int i=1;i<=3;i++){
            ob.maintosub();
            ob.print();
            System.out.print("Enter the number of Array in which your choose symbol exist  :   ");
            int check = input.nextInt();
            ob.subtomain(check);
        }
        System.out.println("\nThe number you choose is "+ ob.mainaray[10]);
    }
}
class GameClass
{
    char mainaray[];
    char subaray1[] = new char[7];
    char subaray2[] = new char[7];
    char subaray3[] = new char[7];
    int j,k,l;
    public GameClass(char[] temp)
    {
        mainaray=temp;
    }
   public void maintosub(){
        int s=0;
        j=0;k=0;l=0;
        for(int i=0;i<21;i++){
            if(s==0) {
                subaray1[j] = mainaray[i];
                j++;
            }
            else if(s==1) {
                subaray2[k] = mainaray[i];
                k++;
            }
            if(s==2) {
                subaray3[l] = mainaray[i];
                l++;
            }
            s++;
            if(s==3)s=0;
        }
    }
    public void print(){
        System.out.println("   Array 1         Array 2         Array 3");
            for(int i=0;i<7;i++){
            System.out.println("    "+subaray1[i]+"               "+subaray2[i]+"               "+subaray3[i]);
        }
    }
   public void subtomain(int ch) {
        if(ch==1){
            j=0;k=0;l=0;
            for(int i=0;i<21;i++){
                if(i>=0&&i<=6) {
                    mainaray[i]=subaray2[j];
                    j++;
                }
                else if(i>=7&&i<=13) {
                    mainaray[i]=subaray1[k];
                    k++;
                }
                if(i>=14&&i<=20) {
                    mainaray[i]=subaray3[l];
                    l++;
                }
            }
        }
        if(ch==2){
            j=0;k=0;l=0;
            for(int i=0;i<21;i++){
                if(i>=0&&i<=6) {
                    mainaray[i]=subaray1[j];
                    j++;
                }
                else if(i>=7&&i<=13) {
                    mainaray[i]=subaray2[k];
                    k++;
                }
                if(i>=14&&i<=20) {
                    mainaray[i]=subaray3[l];
                    l++;
                }
            }
        }
        if(ch==3){
            j=0;k=0;l=0;
            for(int i=0;i<21;i++){
                if(i>=0&&i<=6) {
                    mainaray[i]=subaray1[j];
                    j++;
                }
                else if(i>=7&&i<=13) {
                    mainaray[i]=subaray3[k];
                    k++;
                }
                if(i>=14&&i<=20) {
                    mainaray[i]=subaray2[l];
                    l++;
                }
            }
        }
    }
}
