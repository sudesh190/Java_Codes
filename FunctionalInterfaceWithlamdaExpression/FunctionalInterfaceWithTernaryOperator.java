package com.FunctionalInterfaceWithlamdaExpression;

import java.util.ArrayList;

@FunctionalInterface
public interface FunctionalInterfaceWithTernaryOperator
{
    String CheckValid(String Uname , String pass);
}
class TernaryOperator
{
    public static void main(String[] args)
    {
        System.out.println(" ************ Ternary Operator ***************");
        FunctionalInterfaceWithTernaryOperator f3 = (name,pass) -> {return name.equalsIgnoreCase("java")
                                                                    && pass.equals("java@123")
                                                                     ? "Valid User" : "Invalid User" ; };
        System.out.println(f3.CheckValid("java","java@123"));
    }
}
