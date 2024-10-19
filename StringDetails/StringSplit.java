package com.StringDetails;

public class StringSplit
{
    public static void main(String[] args)
    {
        String name4 = "Core Java Class";
        System.out.println(name4);

        String[] str1 = name4.split(" ");  //Split Function
        System.out.println(str1[0]);
        System.out.println(str1[1]);
        System.out.println(str1[2]);

        for(int i=str1.length-1; i>=0; i--)   //To print String in reverse order
        {
            System.out.print(str1[i] + " ");   //print used to print str1 in single line
        }


    }
}