package com.MultiThreading;

public class MyRunnable1 implements Runnable
{
    @Override
    public void run() {
        Greetings.wish("Amol Bhau");
    }
}
class MyRunnable2 implements Runnable
{
    @Override
    public void run() {
        Greetings.wish("Mahesh Bhau");
    }
}
class MyRunnable3 implements Runnable
{
    @Override
    public void run() {
        Greetings.wish("Sudesh");
    }
}
