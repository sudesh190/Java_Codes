package com.example.Arrays;

public class MultidimentionalArray1
{
    public static void main(String[] args)
    {
        int col = 3,   rows = 3;
        int arr[][] = new int[col][rows];
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[0][2] = 13;

        arr[1][0] = 21;
        arr[1][1] = 22;
        arr[1][2] = 23;

        arr[2][0] = 31;
        arr[2][1] = 32;
        arr[2][2] = 33;

        for(int i=0; i < arr.length; i++)
        {
            for(int j=0; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + "\t"); //prints each row first
            }
            System.out.println();     // comes to new line after printing one row
        }
    }
}
