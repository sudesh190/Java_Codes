package com.constructor.examles;

public class Arithmatic
{
    int num1;
    int num2;
    float result;
    public Arithmatic(int num1 , int num2)
    {
        this();
        this.num1=num1;
        this.num2=num2;
    }
    public Arithmatic()
    {
        System.out.println("***********************************");
        System.out.println(" Welcome to Arithmatic operations");
    }
    public void addition(int num1 , int num2)
    {
        System.out.println("Addition  is :" + (num1+num2));
    }
    public void substraction(int num2 , int num1)
    {
        System.out.println("substaction is :" + (num2 - num1));
    }
    public void multiply(int num1 , int num2)
    {
        System.out.println("Multiplication is :" + (num1*num2));
    }
    public void divide(int num1 , int num2)
    {
        System.out.println("Division is:" + (num1/num2));
    }
    public static void main(String[] args)
    {
        Arithmatic a1 = new Arithmatic(1 , 5);

    }
}
