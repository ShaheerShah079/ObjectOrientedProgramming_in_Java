package com.company;

public class methodprac_2 {
    public String name;
    public void paternPrint1(int num){
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
