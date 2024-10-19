package com.example.day1;

import java.util.Scanner;

public class factorial
{

    public static void main(String[] args) {
        int num = 5;
        int fact =1;
        for (int i = 1; i<=num; i++)
        {
            fact = fact*i;

        }
        System.out.println("Factorial of 5 is " + fact);
    }
}
