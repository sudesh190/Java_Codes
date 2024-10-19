package com.StringDetails;

public class StringExp1
{
    public static void main(String[] args) {


        String name1 = "Sudesh";      // Literal String
        String name2 = "Sudesh";        // Literal String

        String s1 = new String("Amol");  // By using new keyword
        String s2 = new String("Ravi");   // By using new keyword


        if (name1 == name2)       // == operator compare address
        {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are different");
        }
        if (s1.equals(s2))  // equals() method compare value
        {
            System.out.println("Strings are equals");
        } else {
            System.out.println("Strings are different");
        }
    }
}
