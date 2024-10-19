package com.exercise.java1;

public class ForLoopExp3
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 2; i <= 10; i+=2)
        {
            sum = sum + i;
        }
        System.out.println("The sum of even numbers 1 to 10 is :" + sum);
    }
}
