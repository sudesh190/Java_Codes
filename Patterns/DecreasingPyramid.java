package com.Patterns;

public class DecreasingPyramid
{
    public static int PrintDecresingPyramid(int n)
    {
        int i,j;
        for(i=n; i>=1; i--) //Outer loop to fetch no. of rows , and no.of data in first row is maximum ("n")
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(j + ""); //prints value of j
            }
            System.out.println();    //Prints new line for each row
        }
        return n;
    }

    public static void main(String[] args) {
        PrintDecresingPyramid(6);
    }
}
