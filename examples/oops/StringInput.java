package com.examples.oops;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the your name.....");
      //  String name = sc.next();
      //  char cr = sc.next().charAt(0);
        String name = sc.nextLine();

        System.out.println("my name is  " +name);
    }

}

