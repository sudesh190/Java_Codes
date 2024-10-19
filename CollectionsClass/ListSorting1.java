package com.CollectionsClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting1
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(12,2,17,1,29);
        System.out.println(numbers);
        System.out.println("**********************");
        System.out.println("max number is: "+ Collections.max(numbers));
        System.out.println("min number is: "+Collections.min(numbers));

        System.out.println("******Sorting elements in ascending order*******");
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("**********Sorting in Reverse order***********");
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);













    }
}
