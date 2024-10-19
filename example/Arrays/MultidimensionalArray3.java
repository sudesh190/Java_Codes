package com.example.Arrays;

import java.util.Scanner;

public class MultidimensionalArray3
{
    public static void main(String[] args)
    {
        System.out.println("Enter no. of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter no. of columns");
        int col = sc.nextInt();
        int arr3[][] = new int[rows][col];

        System.out.println("Enter the elements");
        for(int i=0; i<rows; i++)
        {
            for (int j=0; j < col; j++)
            {
                System.out.println("Enter Element here");
                arr3[i][j] = sc.nextInt();              // Scans the entered elements
            }
        }
        for (int i = 0; i <rows; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(arr3[i][j] + "\t");      //Prints that array
            }
            System.out.println();    // New row Starts after completing one row
        }

    }
}
