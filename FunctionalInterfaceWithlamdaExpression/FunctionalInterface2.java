package com.FunctionalInterfaceWithlamdaExpression;
@FunctionalInterface
public interface FunctionalInterface2
{
    int add(int a, int b);
}
class Demo1{
    public static void main(String[] args) {
        FunctionalInterface2 f2 = (x,y) -> {return (x+y);};
        System.out.println(f2.add(2,4));
    }
}
