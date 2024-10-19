package com.MultiThreading;

public class DemoThread
{
    public static void main(String[] args) throws InterruptedException {
        MyThread1 m1 = new MyThread1();
        m1.start();

        m1.join();
        MyThread2 m2 = new MyThread2();
        m2.start();

        m2.join();
        MyThread3 m3 = new MyThread3();
        m3.start();
    }
}
