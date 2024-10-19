package com.example.day1;

public class OperatorsExample {
    public static void main(String[] args){

        System.out.println("Example of Arithmatic operators");
        // (1) Addition operator

        int num1 = 34 , num2 = 45;
        System.out.println("Addition of numbers is :" + (num1 + num2));

        // (2) Subtraction operator
        System.out.println("Subtraction of numbers is :" + (num2 - num1));

        // (3) Multiplication operator
        System.out.println("Multiplication of numbers is :" + (num1 * num2));

        //(4) Division operator
        float num3 = 20f , num4 = 2f;
        System.out.println("Division of numbers is :" + (num3 / num4));

        //(5) Modular operator
        System.out.println("Modular is : " + (num3 % num4));

        System.out.println("*********************************************");

        System.out.println("Example of Relational operator");

        System.out.println("num1 == num2 :" + (num1 == num2));
        System.out.println("num1 < num2 :" + (num1 < num2));
        System.out.println("num1 > num2 :" + (num1 > num2));
        System.out.println("num1 >= num2 :" + (num1 >= num2));

        System.out.println("***************************************************");
        System.out.println("Example of logical operators");

        boolean b = num1 < num2 && num1 > num2;
        System.out.println(" First result is :" + b);

        boolean a = num1 < num2 || num1 > num2;
        System.out.println("Second result is :" + a);

        System.out.println("********************************************");

        System.out.println("Example of increment operator");
        int d =  20, j = 5;
        j+=20;
        d++;
        System.out.println("New value of j is :" + j);
        System.out.println("New value of d is :" + d);

        System.out.println("Example of decrement operator");
        int g = 30 , h = 40;
        g-=10;
        h--;
        System.out.println("New value of g :" + g);
        System.out.println("New value of h :" + h);

        System.out.println("*****************************************");
        System.out.println("Thank You");

    }
}
