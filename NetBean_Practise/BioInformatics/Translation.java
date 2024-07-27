package com.shaheer;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inputDna;
        inputDna = input.next();
            StringBuilder forwardDNA = new StringBuilder(inputDna);
            for (int i = 0; i < forwardDNA.length(); i += 4) {
                forwardDNA.insert(i, ' ');
            }
            System.out.println(forwardDNA);
    }
}
