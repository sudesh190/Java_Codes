package com.exercise.java1;

public class ForLoopExp4
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 1; i <= 10; i+=2)
        {
            sum = sum + i;
        }
        System.out.println("Sum of the odd numbers 1 to 10 is :" + sum);
    }
}
