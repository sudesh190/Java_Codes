package com.MultiThreading;

public class MyRunnable implements Runnable
{
    @Override
    public void run() {
        for (int i=0; i<=4; i++)
        {
            System.out.println("Good Morning");
        }
    }

    public static void main(String[] args)
    {
        MyRunnable my = new MyRunnable();
        Thread t = new Thread(my);
        t.start();
    }
}
