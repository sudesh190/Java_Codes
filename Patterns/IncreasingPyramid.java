package com.Patterns;

public class IncreasingPyramid
{
    public static int PrintIncreasingPyramid(int n)
    {
        int i,j;
        for(i=0; i<=n; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
        System.out.println();
        return n;
    }

    public static void main(String[] args) {
        PrintIncreasingPyramid(6);
    }
}
