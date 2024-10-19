package com.example.Arrays;

import java.util.Scanner;

public class MultidimensionalArray4
{
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter no of colunms");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];


        for (int i = 0; i< rows; i++)
        {
            for (int j=0; j<col; j++)
            {
                System.out.println("Enter element here ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<col; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
