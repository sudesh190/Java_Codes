package com.logipool.test1;

import java.util.Scanner;

public class VowelOrConsonent
{
   public static void main(String[] args) {
       System.out.println("Check Vowel or consonent");
       System.out.println(" Please Enter the character !!");
       Scanner sc = new Scanner(System.in);
       char ch = sc.next().charAt(0);

       switch (ch)
       {
           case'a' : case'e': case'i': case'o': case'u':
           System.out.println("Its a vowel!");
           break;
           case'A': case'E': case'I': case'O': case'U':
           System.out.println("Its a vowel!");
           break;

           default:
               System.out.println("Its a consonant");
       }
   }
}
