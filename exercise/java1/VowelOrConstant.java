package com.exercise.java1;

import java.util.Scanner;

public class VowelOrConstant
{
    public static void main(String[] args)
    {
        System.out.println("Enter the character");
        Scanner sc = new Scanner(System.in);

        char  character = sc.next().charAt(0);
        switch (character)
        {
            case 'a' : case 'e': case 'i': case 'o': case 'u':
            System.out.println("Entered character is a vowel");
            break;

            case 'A': case  'E': case 'I': case 'O': case 'U':
            System.out.println("Entered character is a vowel");
            break;

            default:
                System.out.println("Its a consonet !!");

        }

    }
}
