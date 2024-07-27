package com.company;
abstract class Bank{
    abstract public int getBalance();
}
class BankA extends Bank{
    public int getBalance(){
        return 100;
    }
}
class BankB extends Bank{
    public int getBalance(){
        return 200;
    }
}
class BankC extends Bank{
    public int getBalance(){
        return 500;
    }
}
public class abstact_prac3 {
    public static void main(String[] args) {
        BankA ba = new BankA();
        System.out.println(ba.getBalance());

        BankB bb = new BankB();
        System.out.println(bb.getBalance());

        BankC bc = new BankC();
        System.out.println(bc.getBalance());

    }
}
