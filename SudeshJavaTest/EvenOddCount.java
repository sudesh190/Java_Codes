package com.SudeshJavaTest;

public class EvenOddCount
{
    public static void main(String[] args)
    {
        int[] numbers = {13, 42, 27, 33, 18, 56, 23};
        int count1 = 0, count2=0;
        for(int i = 0; i<numbers.length; i++)
        {
            if(numbers[i] % 2==0)
            {
                count1++;
            }
            if(numbers[i] % 2 != 0)
            {
                count2++;
            }
        }
        System.out.println("Count of Even numbers in given array is :" + count1);
        System.out.println("Count of Odd numbers in given array is :" + count2);

    }
}
