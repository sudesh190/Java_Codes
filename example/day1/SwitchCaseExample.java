package com.example.day1;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args)
    {
        System.out.println("Enter the language name :");
        Scanner sc = new Scanner(System.in);
        String language = sc.next();


        switch (language)
        {
            case "English" : case "Hindi" : case "Marathi" :
            System.out.println("Spoken Language");
            break;

            case "java": case "c++" :case "Kotlin" :
            System.out.println("Programming Language");
            break;

            default:
                System.out.println("Invalid Selection");
        }
    }
}
