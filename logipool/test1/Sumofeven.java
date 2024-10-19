package com.logipool.test1;

public class Sumofeven
{
    public static void main(String[] args)
    {
        int i = 2;
        int sum = 0;
        for(i=2;  i<=10; i=i+2)
        {
            sum = sum + i;
        }
        System.out.println("Sum of even numbers is :" + sum);
    }
}
