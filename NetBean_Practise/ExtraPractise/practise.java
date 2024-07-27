package com.shaheer;

import javax.swing.JOptionPane;

public class practise {

    public static void main(String[] args) {

//        for(int i=1;i<2;i++)


//       Scanner in  = new Scanner(System.in);
//       String inp = new String();
//        inp=in.nextLine();
//      StringBuilder dna = new StringBuilder(inp);
//        for(int i=0;i<3;i++)
//        {
//            if(dna.charAt(i)!=' '&&dna.charAt(i+1)!=' '&&dna.charAt(i+2)!=' ') {
//                break;
//            }
//            else if(dna.charAt(i)!=' '&&dna.charAt(i+1)!=' ')
//            {
//                dna.setCharAt(i,' ');
//                dna.setCharAt((i+1),' ');
//            }
//            else
//                {
//                    dna.setCharAt(i,' ');
//                }
//            }
//        for(int i=(dna.length()-1);i>=(dna.length()-3);i--)
//        {
//            if(dna.charAt(i)!=' '&&dna.charAt(i-1)!=' '&&dna.charAt(i-2)!=' ') {
//                break;
//            }
//           else if(dna.charAt(i)!=' '&&dna.charAt(i-1)!=' ')
//            {
//                dna.setCharAt(i,' ');
//                dna.setCharAt((i-1),' ');
//            }
//            else
//            {
//                dna.setCharAt(i,' ');
//            }
//        }
//        System.out.println(dna);


//        String cl = "    Sh a he      er hsdhxsh";
//        System.out.println(cl.replaceAll("\\W", ""));

//        StringBuilder dnaFrame2 = new StringBuilder(inputDna);
//        for (int i=1 ;i<dnaFrame2.length();i+=4)
//        {
//            dnaFrame2.insert(i,' ');
//
//        }
//        System.out.println("---------Frame 2 -----------");
//        System.out.println(dnaFrame2);
//        reverseProtien=neucleotideTOProtien(dnaFrame2);
//        singleReverseProtien =protienToSingleWordRepresentation(reverseProtien);
//        System.out.println("Protien is "+reverseProtien);
//        System.out.println("One word is "+singleReverseProtien);
//
//        StringBuilder dnaFrame3 = new StringBuilder(inputDna);
//        for (int i=2 ;i<dnaFrame3.length();i+=4)
//        {
//            dnaFrame3.insert(i,' ');
//        }
//        System.out.println("---------Frame 3 -----------");
//        System.out.println(dnaFrame3);
//        protien3=neucleotideTOProtien(dnaFrame3);
//        singleWordProtien3 =protienToSingleWordRepresentation(protien3);
//        System.out.println("Protien is "+protien3);
//        System.out.println("One word is "+singleWordProtien3);


//        int a = 20;
//        String s="";
//        System.out.print(s.toString(a));

//        Scanner in = new Scanner(System.in);
//        int arr[][] = new int[5][4];
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("Enter %d%d array element :", (i + 1), (j + 1));
//                arr[i][j] = in.nextInt();
//            }
//
//        }
//
//
//        for (int i = 0; i < arr[0].length; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                arr[4][i]+=arr[j][i];
//
//            }
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+"  ");
//            }
//            System.out.println();
//
//        }


        // Java Program to Illustrate Static Methods in Abstract
// Class Can be called Independently

// Class 1
// Abstract class


// Class 2
// Main class extending Helper class


                // Calling method inside main()
                // as defined in above class
//                Helper.demofun();





        }



    }


abstract class Helper {

    // Abstract method
    static void demofun()
    {

        // Print statement
        System.out.println("Geeks for Geeks");
    }
}