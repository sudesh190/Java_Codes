package com.example.Arrays;

public class GreatestNumberofArray1 {
    public static void main(String[] args) {
        int[] arr = {11,12,98,95,1};
        int i = 0;
        int largeno = arr[0];

        for (i = 1; i < arr.length; i++) {
            if (arr[i] > largeno) {
                largeno = arr[i];
            }
        }
        System.out.println("Greatest no is :" + largeno);
    }
}