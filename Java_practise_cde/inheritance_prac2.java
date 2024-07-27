package com.company;
import java.util.Scanner;
abstract class abarea{
    public abstract float area();
}
class Circle1 extends abarea{
    private float radius;

    public float getRadius() {
        return radius;
    }

    public Circle1(int r){
        radius=r;
    }
    public float area(){return (float) (3.14*radius*radius);}
    public float circum(){return (float)(2*3.14*radius);}

}
class Cylinder1 extends Circle1{
    int height;
    public Cylinder1(int r,int h){
        super(r);
        height =h;
    }
    public float volume(){
        return (float)(area()*height);
        }

    public float area(){
        return (float)(circum()*(height*getRadius()));
    }
        }

  class Rec1{
    int length;
    int breath;
    public Rec1(int l, int b){
        length=l;
        breath=b;
    }
    public int area(){return length*breath;}
      public int para(){return 2*(length+breath);}
  }
  class cuboid extends Rec1{
    int height;
    public cuboid(int l, int b , int h){
        super(l,b);
        height=h;
    }
    public int volume(){return area()*height;}

  }
public class inheritance_prac2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        //q1
        System.out.println("Enter radius and height of cylinder");
        int r=input.nextInt();
        int h=input.nextInt();
Cylinder1 c = new Cylinder1(r,h);
        System.out.println(c.volume());
//        System.out.println(c.surArea());




        //q2
//    System.out.println("Enter length breath and height of cuboid");
//    int l=input.nextInt();
//    int b=input.nextInt();
//    int h=input.nextInt();
//   cuboid c = new cuboid(l,b,h);
//        System.out.println(c.volume());


    }
}
