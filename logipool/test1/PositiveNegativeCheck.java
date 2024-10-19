package com.logipool.test1;

import java.util.Scanner;

public class PositiveNegativeCheck
{
    public static void main(String[] args)
    {
        System.out.println("Positive or Negative Check !!!!!");
        System.out.println("Please enter the number");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("Number is positive");
        }
        else if (num < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("This number is Neither positive nor Negative");
        }


    }
}
