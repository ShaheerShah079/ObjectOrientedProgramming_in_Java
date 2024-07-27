package com.company;
class Mythread1 extends Thread{
    public void goodmorning(){
        int i=0;
        while(i<1000) {
            System.out.println("Good Morning");
            i++;
        }
    }
    @Override
    public void run(){
        goodmorning();
    }
}

class Mythread2 extends  Thread {
    public void hello() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Hello");
            i++;
        }
//        System.out.println(getState());
    }

    public void run() {
        hello();
    }

}
public class thread_prac1 {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
//        System.out.println(Thread.currentThread());
        t1.start();
//       System.out.println(t2.getState());
//        System.out.println(Thread.currentThread());
        t2.start();
//        System.out.println(t2.getState());


    }
}
