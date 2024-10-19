package com.exercise.java1;

import java.util.Scanner;

public class NestedIfElse
{
    public static void main(String[] args)
    {
        System.out.println("Enter the numer you want to check !!");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num >0 && num % 2 == 0)
        {
            System.out.println("The number is positive and even");
        } else if (num > 0 && num % 2 != 0)
        {
            System.out.println("The number is positive and odd");
        } else if (num < 0 && num % 2 == 0)
         {
             System.out.println("The number is negative and even");
         } else if (num < 0 && num % 2 !=0)
         {
             System.out.println("The number is negative and odd");
         }
    }
}
