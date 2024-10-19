package com.SudeshJavaTest;

public class MinValueExp
{
    public static void main(String[] args)
    {
        int[] numbers = {34, 7, 21, 56, 11, 8};
        int smallest=numbers[0];
        for(int i=0; i <numbers.length; i++)
        {
            if(numbers[i] < smallest)
            {
                smallest = numbers[i];
            }
        }
        System.out.println("Minimum value in the given array is :" + smallest);

    }
}
