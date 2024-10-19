package com.ExceptionExp;

import java.util.Scanner;

public class ExceptionHandling1
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Step 1");
        System.out.println("Step 2");

        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println();
        }
    }
}
