package com.StringDetails;

public class StringImmutable
{
    public static void main(String[] args)
    {
        String name3 = "Sudesh";    //Immutabe String
        name3.concat("Shinde");     // Orfen value   Means this dos not have any reference variabl

        StringBuilder sb = new StringBuilder("Sudesh");  // Makes string MUTABLE
        sb.append("Shinde");

        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Sudesh");   //Makes string MUTABLE
        sb1.append("Nagarkar");
        System.out.println(sb1);


    }
}
