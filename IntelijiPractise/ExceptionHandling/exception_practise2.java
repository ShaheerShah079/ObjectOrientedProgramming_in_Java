package com.company;
class MaxException extends Exception{
    @Override
    public String toString() {
        return "Your 5 entries completed!";
    }
}
public class exception_practise2 {
    public static void araynum (int [] aray) throws MaxException{
        java.util.Scanner input = new java.util.Scanner(System.in);
        int i=0;
        while(true&&i<6){
            System.out.println("Enter index");
            int a=input.nextInt();
            if(i==5) {
                    throw new MaxException();
            }
            try {
                System.out.println(aray[a]);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error");
                i++;
            }
        }
    }

    public static void main(String[] args) {

        int [] arr = {12,23,43,54,12};
   try{
       araynum (arr);
   }
 catch(MaxException e){
            System.out.println(e);
        }
            }
}
