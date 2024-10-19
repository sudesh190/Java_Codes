package com.example.day1;

public class FactorialWithRecursion2
{

    static int Factorial2(int num2)
    {
        if(num2==0)
        {
            return 1;
        }
        int Fact2 = 1;
        Fact2 = num2 * Factorial2(num2 - 1);
        return Fact2;
    }

    public static void main(String[] args) {
        System.out.println("Factirial of 6 is :" +Factorial2(6));
    }
}
