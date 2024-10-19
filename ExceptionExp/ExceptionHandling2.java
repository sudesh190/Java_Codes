package com.ExceptionExp;

public class ExceptionHandling2
{
    public static void main(String[] args) {
        System.out.println("Step 1");
        System.out.println("Step 2");
        String name = null;
        try {
            int len = name.length();
            System.out.println(10/0);
        }
        catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }
        
    }
}
