package com.FunctionalInterfaceWithlamdaExpression;

import java.util.ArrayList;

public class ArrayListBook
{
    public static void main(String[] args) {
        ArrayList<book1> arr = new ArrayList<>();
        arr.add(new book1(101,"Core Java","James kotlin"));
        arr.add(new book1(102,"Advance Java","Johnson" ));
        //User defined class object prints all data at a time because of toString() method of object class in book1 class
        arr.forEach( (ref) -> System.out.println(ref));
    }
}
