package com.MultiThreading;

public class MyThread1 extends Thread
{
    @Override
    public void run() {
        Greetings.wish("Sudesh");
    }
}
class MyThread2 extends Thread
{
    @Override
    public void run() {
        Greetings.wish("Mahesh");
    }
}
class MyThread3 extends Thread
{
    @Override
    public void run() {
        Greetings.wish("Amol Bhau");
    }
}
