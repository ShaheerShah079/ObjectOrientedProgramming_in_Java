package com.company;
class Mythread3 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class Mythread4 extends  Thread{
    public void run(){
        int i=0;
        while (i<1000) {
            try {
                sleep(200);
                System.out.println("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }

    }
}

public class thread_prac2 {
    public static void main(String[] args) {
        Mythread3 t1 = new Mythread3();
        Mythread4 t2 = new Mythread4();
        t1.start();
        t2.start();
    }
}
