package com.example.day1;

public class JumpStatementExp1
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            if(i == 6)
            {
                break; // same for continue statement
            }
            System.out.println("the number is :" + i);
        }
        System.out.println("***********************************");

        for(int j = 1; j <=10; j++)
        {
            if(j == 6)
            {
                continue;
            }
            System.out.println("The value of j is :" + j);
        }
    }
}
