package com.MultiThreading;

public class MyThreads extends Thread
{
    public void display()
    {
        System.out.println("Display Method Executed..");
    }

    @Override
    public void run() {      //used to define thread logic
        super.run();
        for (int i=0; i<=4; i++)
        {
            System.out.println("Overridden run() method of Thread Class...");
        }
        display();       // To Follow Concept of MultiThreading
                        // All User defined methods should be called in run() method of Thread Class
    }

    public static void main(String[] args) {    // main() is also known as main Thread
        System.out.println(Thread.currentThread().getName());    // main

        MyThreads m = new MyThreads();
        System.out.println(m.getName());
        m.setName("Sudesh");
        System.out.println(m.getName());
        m.start();
    }
}
