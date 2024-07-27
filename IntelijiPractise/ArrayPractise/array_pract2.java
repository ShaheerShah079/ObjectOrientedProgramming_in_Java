package com.company;
import  java.util.Scanner;

public class array_pract2 {
    public static void isAcept(int[] aray) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < aray.length; i++) {
            System.out.println("Enter " + (i + 1) + " Element");
            aray[i] = input.nextInt();
        }
    }

    public static void isPrint(int[] aray) {
        for (int i = 0; i < aray.length; i++) {
            System.out.print(aray[i] + "   ");
        }
    }

    public static boolean isCheck(int[] aray, int num) {
        for (int i = 0; i < aray.length; i++) {
            if (num == aray[i]) {
                return true;
            }
        }
        return false;
    }

    public static void isAcept2d(int[][] aray) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < aray.length; i++) {
            for (int j = 0; j < aray[i].length; j++) {
                System.out.println("Enter row" + (i + 1) + " Colom" + (j + 1) + " Element");
                aray[i][j] = input.nextInt();
            }
        }
    }

    public static void isPrint2d(int[][] aray) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < aray.length; i++) {
            for (int j = 0; j < aray[i].length; j++) {
                System.out.print(aray[i][j] + "   ");
            }
            System.out.println("");
        }
    }

    public static void row2d(int[][] aray) {
        int sum = 0;
        for (int i = 0; i < aray.length; i++) {
            for (int j = 0; j < aray[i].length; j++) {
                sum += aray[i][j];

            }
            System.out.println("Row " + (i + 1) + " Sum is " + sum);
            sum = 0;
        }
    }

    public static void colom2d(int[][] aray) {
        int sum = 0;
        for (int i = 0; i < aray[0].length; i++) {
            for (int j = 0; j < aray.length; j++) {
                sum += aray[j][i];
            }
            System.out.println("colom " + (i + 1) + " Sum is " + sum);
            sum = 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//                            //Q1
//        String[] day={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
////       // print string using foreach loop
////        for(String name:day){
////            System.out.print(name+"   ");
////        }
//        for(int i=0;i<day.length;i++){
//            System.out.print(day[i]+"   ");
//        }


//                        //Q2
//        int [] arr=new int[10];
//        isAcept(arr);
//        isPrint(arr);
//        System.out.println("");
//        System.out.println("Enter an element you want to search in array");
//int num = input.nextInt();
//if(isCheck(arr,num)){
//    System.out.println("Given number is in the array");
//}
//else {
//    System.out.println("Given number is not in the array");
//
//}


        //Q3
//        System.out.println("Enter the row of square matrix.");
//        int sumleft=0,sumright=0;
////        int row= input.nextInt();
//        int [][]arr ={{1,2,3,4,5},
//                      {2,5,3,6,34},
//                      {1,4,23,7,3},
//                     {4,6,43,76,34},
//                     {3,6,4,87,32}};
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                if(i==j){
//                    sumleft+=arr[i][j];
//                }
//            }
//        }
//        System.out.println("The sum of left diagnal is "+ sumleft);
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                if(j==(((arr.length)-1)-i)){
//                    sumright+=arr[i][j];
//                }
//            }
//        }
//        System.out.println("The sum of right diagnal is "+ sumright);


                      //Q4
//        System.out.println("Enter row and colmn of 2d array.");
//        int row =input.nextInt();
//        int colom= input.nextInt();
//        int [][] arr=new int[row][colom];
//        isAcept2d(arr);
//        isPrint2d(arr);
//        System.out.println("");
//       row2d(arr);
//       colom2d(arr);


                        //Q5
//        int[][] arr = {{2, 3, 1, 5, 0},
//                {7, 1, 5, 3, 1},
//                {2, 5, 7, 8, 1},
//                {0, 1, 5, 0, 1},
//                {3, 4, 9, 1, 5}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (j >= i) {
//                    System.out.print(arr[i][j] + "  ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println("");
//        }




//                        //Q6
//        int[][] arr = {{2, 3, 1, 5, 0},
//                       {7, 1, 5, 3, 1},
//                       {2, 5, 7, 8, 1},
//                       {0, 1, 5, 0, 1},
//                       {3, 4, 9, 1, 5}};
//        System.out.println("Row element");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == 2) {
//                    System.out.print(arr[i][j] + "  ");
//                }
//            }
//        }
//        System.out.println("");
//
//        System.out.println("Colom element");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (j == 2) {
//                    System.out.print(arr[i][j] + "  ");
//                }
//            }
//        }
//        System.out.println("");

    }
}