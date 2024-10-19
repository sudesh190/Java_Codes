package com.exercise.java1;

public class NumberSwapping
{
    public static void main(String[] args)
    {
        int num1 = 34 , num2 = 56;
        int temp;
        System.out.println("Your First provided number is num1 =:" + num1);
        System.out.println("Your second provided number is num2 =:" + num2);

         temp = num1;
         num1 = num2;
         num2 = temp;

        System.out.println("Lets see swapping magic !!!");
        System.out.println("New value of num1 is : " + num1 );
        System.out.println("New value of num2 is :" + num2);

    }
}
