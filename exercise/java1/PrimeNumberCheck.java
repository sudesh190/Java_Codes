package com.exercise.java1;

public class PrimeNumberCheck
{
    public static void main (String[] args)
    {
        int num = 3;
        int i = 2;
        int count = 0;
        while(num % i != 0)
        {
            count++;
            break;
        }
        if(count==0)
        {
            System.out.println("Given number is not a prime number");
        }
        else
        {
            System.out.println("The number is a prime number");
        }
    }
}
