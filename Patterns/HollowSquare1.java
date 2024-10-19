package com.Patterns;

public class HollowSquare1
{
    public static int PrintPattern(int n)
    {
        int i,j;
        for(i=0; i<=n; i++)   //Handles no. of rows
        {
            for(j=0; j<=n; j++)// Handles no. of columns
            {
                if(i==0 || j==0 || i ==n-1 || j ==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        return n;
    }

    public static void main(String[] args) {
        PrintPattern(6);
    }

}
