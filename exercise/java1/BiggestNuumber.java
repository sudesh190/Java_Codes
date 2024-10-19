package com.exercise.java1;

import java.util.Scanner;

public class BiggestNuumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number here !!");
        int num1 = sc.nextInt();
        System.out.println("Enter your Second number here !!");
        int num2 = sc.nextInt();
        System.out.println("Enter your Third number here !!");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println("First number is greatest");
        } else if (num2 >= num1 && num2 >= num3 )
        {
            System.out.println("Second number is greatest");
        }
        else
        {
            System.out.println("Third number is greatest");
        }
    }
}

