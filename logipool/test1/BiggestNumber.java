package com.logipool.test1;

import java.util.Scanner;

public class BiggestNumber
{
    public static void main(String[] args)
    {
        System.out.println("Lets check biggest number");
        System.out.println("Enter first num");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter Second number");
        int num2 = sc.nextInt();

        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        if(num1>num2&&num1>num3)
        {
            System.out.println("First number is biggest");
        }
        if(num2>num1&&num2>num3)
        {
            System.out.println("Second number is biggest");
        }
        else
            System.out.println("Third number is biggest");
    }
}
