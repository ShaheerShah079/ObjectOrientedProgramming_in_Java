package com.company;
import java.util.Scanner;
class EmployPractiseQ{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public String setname(){
        name="harry";
        return name;
    }
}
class Square{
    int side;

    public Square(int i) {
    }

    public int area() {
        return side *side;
    }
    public int para(){
        return 2*(side+side);
    }
}
class  Rectangle{
    int side1;
    int side2;
    public int area() {
        return side1 *side2;
    }
    public int para(){
        return 2*(side1+side2);
    }
}
class Circle{
    int radius;
    public float area() {
        return (float) (3.14*radius*radius);
    }
    public float para() {
        return (float)(2*3.14 *radius);
    }
}
public class class_oop_prac2 {
    public static void main(String[] args) {


                        //Q1
//        EmployPractiseQ shaheer = new EmployPractiseQ();
//       shaheer.salary=3400;
//       int sal = shaheer.getsalary();
//        System.out.println(sal);
//        shaheer.name="Shahg";
//        String na= shaheer.getname();
//        System.out.println(na);
//        System.out.println(shaheer.setname());
//        System.out.println(shaheer.name);




                            //Q2
//        Square sqbox = new Square();
//        Scanner input = new Scanner(System.in);
//        sqbox.side=input.nextInt();
//        int sqar=sqbox.area();
//        int sqpa=sqbox.para();
//        System.out.println(sqar);
//        System.out.println(sqpa);



                        //Q3
//        Rectangle recbox = new Rectangle();
//        recbox.side1=input.nextInt();
//        recbox.side2=input.nextInt();
//        int recar=recbox.area();
//        int recpa=recbox.para();
//        System.out.println(recar);
//        System.out.println(recpa);




                    //Q4
//        Circle cir= new Circle();
//        cir.radius=input.nextInt();
//        System.out.println(cir.area());
//        System.out.println(cir.para());















    }
}
