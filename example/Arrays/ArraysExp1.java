package com.example.Arrays;

public class ArraysExp1
{
    public static void main(String[] args)
    {
        int a[] = new int[5];   //Declaration
        a[0] = 1;       //Initialization
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        //Print or iteration by for loop
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);          // Printing an array
        }
        System.out.println("**************************");
        System.out.println(a[3]);   //Access Single element
        System.out.println("***************************");
        //for each loop
        for (int ref : a)
        {
            System.out.println(ref);    // 'ref' is reference  for object stored in 'a'.
        }
    }
}
