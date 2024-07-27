package com.company;
class thread1 extends Thread{
    public void meth1(){
        int i=0;
        while(i<1000) {
            System.out.println("THREAD 111111111111111111");
            i++;
        }
    }
    @Override
    public void run(){
        meth1();
    }
}

class thread2 extends Thread{
    public static void meth2(){
        int i=0;
        while(i<1000) {
            System.out.println("THREAD 2222222222222222222222");
            i++;
        }
    }
    @Override
    public void run(){
        meth2();
    }
}

class thread3 extends Thread {
    private static void meth3() throws InterruptedException {
        int i=0;
        while(i<1000) {
            System.out.println("THREAD 333333333333333333333333333333");
//            sleep(445);
            i++;
        }
    }
    @Override
    public void run(){
        try {
            meth3();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class thread4 extends Thread{
    public void meth4(){
        int i=0;
        while(i<1000) {
        System.out.println("THREAD 4444444444444444444444");
            i++;
        }
    }
    @Override
    public void run(){
      meth4();
    }
}
public class threadclass_prac1 {
    public static void main(String[] args) throws InterruptedException {

        Thread a = new thread1();
        thread2 b = new thread2();
        thread3 c = new thread3();
        thread4 d = new thread4();
        b.start();
        b.join();
        a.start();

        c.start();
        d.start();
    }
}
