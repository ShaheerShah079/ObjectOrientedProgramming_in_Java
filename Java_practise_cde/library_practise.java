package com.company;
class Libprac{
    String [] temp=new String[90];

        }

public class library_practise {
    public static void main(String[] args) {
      Libprac per = new Libprac();
      String [] availableBook=new String[90];
        availableBook[0] = "c language";
        availableBook[1] = null;
        availableBook[2] = "java language";
        availableBook[3] = "python language";
        availableBook[4] = "html language";
        availableBook[5] = "css language";
        availableBook[6] = "react language";
//      per.arrayChange(availableBook);

        for(String el : availableBook){
            System.out.println(el);
        }

    }
}
