package com.SudeshJavaTest;

public class MaxValueExp
{
    public static void main(String[] args)
    {
        int[] numbers = {12,45,67,23,9,56};
        int largest = numbers[0];
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i] > largest )
            {
                largest = numbers[i];
            }

        }
        System.out.println("largest number in array is :" + largest);

    }
}
