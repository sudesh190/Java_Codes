package com.example.day1;

public class FactorialWithRecursion
{
   static int factrial(int num )
    {
        if(num==0){
            return 1;
        }
        int fuct =1;
        fuct = num * factrial(num-1);

        return fuct   ;
    }

    public static void main(String[] args) {
        System.out.println(  factrial(5));
    }
}
