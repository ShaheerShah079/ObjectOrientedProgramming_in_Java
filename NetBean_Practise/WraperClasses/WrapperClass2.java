package com.shaheer;

public class WrapperClass2 {
    public static void main(String[] args) {
        int a= 10;   // variable
        Integer obA = 20;
        //obA. multipl function on that integer object

        String s=obA.toString();   // convert int to string
        Byte b =obA.byteValue();   // convert int to byte
        int c=obA.compareTo(15);   //  compare to int and return in int 0 , 1 ,-1
        System.out.println(c);

        Character obCh = 'd';
        char cc=obCh.charValue();
        System.out.println(cc);

    }
}
