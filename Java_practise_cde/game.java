package com.shaheer;
import java.util.Scanner;
public class game {

static void maintosub(char main[],char s1[],char s2[],char s3[]){
    int j=0,k=0,l=0,s=1;
    for(int i=0;i<21;i++){
        if(s==1) {
            s1[j] = main[i];
            j++;
        }
        else if(s==2) {
            s2[k] = main[i];
            k++;
        }
        if(s==3) {
            s3[l] = main[i];
            l++;
        }
        s++;
        if(s==4)  s=1;
    }
    }

    static void print(char s1[],char s2[],char s3[]){
        System.out.println("Sub Array 1     Sub Array 2     Sub Array 3");
    for(int i=0;i<7;i++){
        System.out.println("    "+s1[i]+"               "+s2[i]+"               "+s3[i]);
    }
    }

    static void subtomain(char main[],char s1[],char s2[],char s3[],int ch) {
    if(ch==1){
            int j=0,k=0,l=0;
            for(int i=0;i<21;i++){
                if(i>=0&&i<=6) {
                    main[i]=s2[j];
                    j++;
                }
                else if(i>=7&&i<=13) {
                    main[i]=s1[k];
                    k++;
                }
                if(i>=14&&i<=20) {
                    main[i]=s3[l];
                    l++;
                }
            }
        }

        if(ch==2){
            int j=0,k=0,l=0;
            for(int i=0;i<21;i++){
                if(i>=0&&i<=6) {
                    main[i]=s1[j];
                    j++;
                }
                else if(i>=7&&i<=13) {
                    main[i]=s2[k];
                    k++;
                }
                if(i>=14&&i<=20) {
                    main[i]=s3[l];
                    l++;
                }
            }
        }

        if(ch==3){
            int j=0,k=0,l=0;
            for(int i=0;i<21;i++){
                if(i>=0&&i<=6) {
                    main[i]=s1[j];
                    j++;
                }
                else if(i>=7&&i<=13) {
                    main[i]=s3[k];
                    k++;
                }
                if(i>=14&&i<=20) {
                    main[i]=s2[l];
                    l++;
                }
            }
        }

    }

    public static void main() {

    Scanner input = new Scanner(System.in);
    char mainaray[]={'!','@','#','$','%','^','&','*','|','(','-',')','?','<','=','>',';','_','+','.',','};
    char subaray1[] = new char[7];
    char subaray2[] = new char[7];
    char subaray3[] = new char[7];

    for(int i=1;i<=3;i++){
        maintosub(mainaray,subaray1,subaray2,subaray3);
        print(subaray1,subaray2,subaray3);
        System.out.print("Enter the sub Array in which your chose symbol exit  :   ");
     int check = input.nextInt();
        subtomain(mainaray,subaray1,subaray2,subaray3,check);
    }

        System.out.println("The number you chose is "+ mainaray[10]);
    }
}