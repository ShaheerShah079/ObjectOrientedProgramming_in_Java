package com.shaheer;

public class Exceptonhandligprac2 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        try
        {
            for(int i=0;i<7;i++)
            {
                System.out.println(a[i]);
            }
        }
        catch(IndexOutOfBoundsException ex)
        {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }


    }
}
