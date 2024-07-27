package com.company;

public class exception_prac5 {
    public static void main(String[] args) {
        try{
            System.out.println(6/0);
            try{
                System.out.println(4/0);
            }
            catch(Exception e){
                System.out.println("Nested try exception "+e);
            }
        }
        catch(Exception e){
            try{
                System.out.println(5/0);
            }
            catch(Exception w){
                System.out.println("Nested catch exception "+w);
            }
            System.out.println(e);
        }
    }
}
