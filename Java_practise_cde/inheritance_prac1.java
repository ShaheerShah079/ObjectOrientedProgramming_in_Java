package com.company;

class Cylindrname extends CylinderConstrutor{
    String na;
public Cylindrname(String myname){
    System.out.println(super.length);;
    na = myname;
}
    public String getName() {
        return na;
    }

    public void setName(String name) {
        this.na = name;
    }
}
public class inheritance_prac1 {
    public static void main(String[] args) {
        Cylindrname c = new Cylindrname("myClinder");
       // c.setName("myClinder");
      //  c.(12,45);
        //System.out.println(c.getName()+" "+c.surfaceArea());

    }
}
