package com.FunctionalInterfaceWithlamdaExpression;

import java.util.List;

public class MethodRefference1
{
    public static void main(String[] args)
    {
        List<String> obj = List.of("sudesh","Mahesh","Amol");
        System.out.println("****** Method Reference ***********");
        obj.forEach(System.out::println);  //Method Refference
        System.out.println("******** for each loop **********");
        for (String ref: obj)       //for each
        {
            System.out.println(ref);
        }
        System.out.println("******Lambdaa Expression ***********");
        obj.forEach( ref-> System.out.println(ref));   //Lambda Expression
    }
}
