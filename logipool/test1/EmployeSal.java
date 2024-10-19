package com.logipool.test1;

import java.util.Scanner;

public class EmployeSal
{
    public static void main(String[] args)
    {
        System.out.println("employee info");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = sc.next();
        System.out.println("Enter Salary");
        int sal = sc.nextInt();

        if(sal>50000)
        {
            System.out.println(name +": has a best job");
        }
        if(sal<50000)
        {
            System.out.println(name + ": has a good job");
        }

    }
}
