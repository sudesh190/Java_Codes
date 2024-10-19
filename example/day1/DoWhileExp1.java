package com.example.day1;

public class DoWhileExp1
{
    public static void main(String[] args)
    {
        int i = 1;
        do
        {
            System.out.println("The initial value is :" + i);
            i++;
        }
        while(i<=10);

        System.out.println("***********Descending Loop****************");
        int j = 10;
        do
        {
            System.out.println("The initial value of j is :" + j);
            j--;
        }
           while(j >= 1);
    }
}
