//package com.company;
//
//interface box{
//    int area();
//    int para();
//}
//class rectangle implements box{
//    int length;
//    int breath;
//    public rectangle(int l, int b){
//        length=l;
//        breath=b;
//    }
//    public int area(){
//        return length*breath;
//    }
//    public int para(){
//        return 2*(length+breath);
//    }
//}
//class square extends rectangle{
//    public  square(int s){
//        super(s,s);
//    }
//}
//class circle {
//    public float radius;
//    public circle(float r){
//        radius=r;
//    }
//    public float circum(){
//        return (float) (2*3.141592653589793*radius);
//    }
//    public float area(){
//        return (float) (3.141592653589793*radius*radius);
//    }
//}
//
//
//class cylinder extends circle {
//    int height;
//    public cylinder(int r,int h){
//        super(r);
//        height=h;
//    }
//    public float volume(){
//        return (float) area()*height;
//    }
//    public float areacy(){
//        return (float) circum()*height;
//    }
//}
//
//class sphere extends circle{
//    public sphere(float r){
//        super(r);
//    }
//    public float volume(){
//        return (float) ((area()*4*radius)/3);
//    }
//    public float areasp(){
//        return (float) (area()*4);
//    }
//}
//public class prac_shape{
//    public static void main(String[] args) {
//        rectangle r = new rectangle(4,5);
//        System.out.println("The area of rec is "+r.area()+" and para is "+r.para());
//        square s = new  square(5);
//        System.out.println("The area of square is "+s.area()+" and para is "+s.para());
//
//        circle c = new  circle(6);
//        System.out.println("The area of circle is "+c.area()+" and circum is "+c.circum());
//
//        cylinder cy = new  cylinder(5,6);
//        System.out.println("The volume of cylinder is "+cy.volume()+" and area is "+cy.areacy());
//
//        sphere sp = new  sphere(6);
//        System.out.println("The volume of sphere is "+sp.volume()+" and area is "+sp.areasp());
//
//
//
//
//
//    }
//}