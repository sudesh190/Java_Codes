package com.MultiThreading;

public class Greetings
{
    public static synchronized void wish(String name)
    {
        for (int i=0; i<=4; i++)
        {
            System.out.println("Good Morning" + name);
        }
        try {
            Thread.sleep(1000);    // To stop execution for some time
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
