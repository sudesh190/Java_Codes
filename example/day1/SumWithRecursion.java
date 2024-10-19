package com.example.day1;

public class SumWithRecursion
{
    static int Sum(int i)
    {
        if(i==0)
        {
            return 0;
        }
        int sum1=0;
            sum1 = i + Sum(i-1);
        return sum1;

    }
    public static void main(String[] args)
    {
        System.out.println("Sum is :" + Sum(10));
    }
}
