package com.exercise.java1;

import java.util.Scanner;

public class SumOfTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of given numbers is :" + sum);

    }
}
