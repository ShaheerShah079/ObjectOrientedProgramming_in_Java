package com.shaheer;
public class permutation_prac {


    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    // Recursive function to generate all permutations of a string
    private static void permutations(char[] chars, int currentIndex) {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }

        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            System.out.println("Before "+currentIndex+"  "+i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
            System.out.println("AFTER "+currentIndex+"  "+i);
        }
    }


    // generate all permutations of a string in Java
    public static void main(String[] args) {
        String str = "ABC";
        permutations(str.toCharArray(), 0);
    }
}

