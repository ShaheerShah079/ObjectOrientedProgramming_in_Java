package com.company;
abstract class Marks{
    abstract public float getPer();
}
class StudentA extends  Marks{
    float s1,s2,s3;
    public StudentA(int a,int b,int c){
        s1=a;
        s2=b;
        s3=c;
    }
    public float getPer(){
        return (float)((s1+s2+s3)/3);
    }
}
class StudentB extends  Marks{
   float s1,s2,s3,s4;
    public StudentB(int a,int b,int c,int d){
        s1=a;
        s2=b;
        s3=c;
        s4=d;
    }
    public float getPer(){
        return (float)((s1+s2+s3+s4)/4);
    }
}
public class abstarct_prac4 {
    public static void main(String[] args) {
   StudentA sa= new StudentA(45,48,50);
        System.out.println(sa.getPer());
   StudentB sb = new StudentB(50 ,55,45,67);
        System.out.println(sb.getPer());
    }
}
