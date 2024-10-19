package com.exercise.java1;

import java.util.Scanner;

public class StudentAverageMarks
{
    public static void main(String[] args)
    {
        System.out.println("Hello !!! Lets See  result !! ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Student name is Sudesh Shinde");
        System.out.println("Enter marks in Social");
        int marks1 = sc.nextInt();
        System.out.println("Enter marks in Science");
        int marks2 = sc.nextInt();
        System.out.println("Enter marks in Maths");
        int marks3 = sc.nextInt();

        int sum = marks1 + marks2 + marks3;
        double avg = sum / 3 ;
        if (avg >= 50)
        {
            System.out.println("You have passed with total marks :" + sum);
            System.out.println("And Your percentage is :" + avg);
        }
        else
        {
            System.out.println("You have failed with total marks :" + sum);
            System.out.println("And your percentage is :" + avg);
        }

    }
}
