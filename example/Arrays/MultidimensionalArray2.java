package com.example.Arrays;

import java.util.Scanner;

public class MultidimensionalArray2
{
    public static void main(String[] args) {

        int col =3, rows = 2;
        int arr2[][] = new int[rows][col];

        arr2[0][0] = 11;
        arr2[0][1] = 12;
        arr2[0][2] = 13;

        arr2[1][0] = 21;
        arr2[1][1] = 22;
        arr2[1][2] = 23;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
