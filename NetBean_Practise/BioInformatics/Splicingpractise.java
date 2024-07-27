package com.shaheer;

import java.util.Arrays;
public class Splicingpractise {
    public static String[] swap(String[] a, int i, int j)
    {
        String temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
    public static void permute(String[] str, int l, int r)
    {
        if (l == r)
            System.out.println(Arrays.toString(str));
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }

    }

    public static void main(String[] args) {
        String[] str = {"AAA","BBB","CCC"};
        int n = str.length;
        permute(str,0,n -1);

        StringBuilder s = new StringBuilder("                               ");
        s.setCharAt(0,'H');
        s.setCharAt(1,'E');
        s.setCharAt(2,'L');
        s.setCharAt(3,'L');
        s.setCharAt(4,'O');
        s.setCharAt(5,'O');
        System.out.println(s);


    }

}
