package com.example.day1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name here !!");

        // Accept the String input from user
        String name = scanner.next();

        System.out.println("Your entered name is : " + name);

        System.out.println("Enter your age here !!");

        //Accept the Integer input  from user
        int age = scanner.nextInt();

        System.out.println("Your entered age is :" + age);
    }
}
