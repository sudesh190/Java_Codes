package com.MultiThreading;

public class MyRunnableCalled
{
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 my1 = new MyRunnable1();
        Thread t1 = new Thread(my1);
        t1.start();

        t1.join();
        MyRunnable2 my2 = new MyRunnable2();
        Thread t2 = new Thread(my2);
        t2.start();

        t2.join();
        MyRunnable3 my3 = new MyRunnable3();
        Thread t3 = new Thread(my3);
        t3.start();
    }
}
