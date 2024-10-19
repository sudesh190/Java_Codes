package com.example.method2;

public class MethodExample3
{
    int result;
    public int addition(int num1, int num2)   //instance method and we are passing parameters to this method
    {
        result = num1 + num2;
        System.out.println("called by addition methods");
        return result;
    }

    public static void main(String[] args)
    {
        MethodExample3 obj2 = new MethodExample3();
        //int r1 =  obj2.addition(5,90);  <-- This r1 variable is Optional ,
        // Because we have already gave value with object obj2 in print statement given below
        System.out.println(obj2.addition(5,90));
        




    }
}
