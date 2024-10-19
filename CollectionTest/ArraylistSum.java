package com.CollectionTest;
import java.util.ArrayList;

public class ArraylistSum
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        int sum = 0;

        for(int i=0; i<l1.size(); i++)
        {
            sum+= l1.get(i);
        }
        System.out.println("Sum of all elements in list is: "+ sum);

    }
}
