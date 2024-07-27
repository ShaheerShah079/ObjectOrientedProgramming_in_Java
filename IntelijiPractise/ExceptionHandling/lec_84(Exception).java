package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative! enter posi";
    }
}

public class lec_84 {

    public static double area(int r) {
        if (r<0){
            try {
                throw new NegativeRadiusException();
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
        double result = Math.PI * r * r;
        return result;

    }

    public static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        // Made By Harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
//        try{
//            int c = divide(6,0);
            double ar = area(-6);
            System.out.println(ar);
//        }
//        catch(Exception e){
//            System.out.println("Exception is "+e);
//        }
    }
}

