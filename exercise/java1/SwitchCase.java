package com.exercise.java1;

import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args) {
        System.out.println("Enter the day !!");
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        switch (day) {
            case "Monday": case "Tuesday": case "Wednesday":
                System.out.println("Discount is 5%");
                break;

            case "Thursday": case "Friday":
                System.out.println("Discount is 4%");
                break;

            case "Saturday": case "Sunday":
                System.out.println("Discount is 3%");
                break;

            default:
                System.out.println("You have entered wrong choice !!");

        }
    }
}
