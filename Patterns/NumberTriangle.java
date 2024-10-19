package com.Patterns;

public class NumberTriangle
{
    public static int PrintNumberTriangle(int n)
    {
        int i,j;
        for(i=1; i<=n; i++)     //Outer loop to handle the no. of rows
        {
            for(j=1; j<=n-i; j++)
            {
                System.out.print(" ");  //inner loop for Print blank spaces
            }
            for (j=1; j<=i; j++)
            {
                System.out.print(i +" "); //Inner loop to  print number or "*" in triangle pattern
            }
            System.out.println(); //Prints new line for each row
        }

        return n;
    }

    public static void main(String[] args) {
        PrintNumberTriangle(6);
    }
}
