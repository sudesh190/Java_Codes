package com.FunctionalInterfaceWithlamdaExpression;

@FunctionalInterface
public interface FunctionalInterface1
{
    void display();
}
class Demo{
    public static void main(String[] args) {
        FunctionalInterface1 f1 = () -> {
            System.out.println("Good Morning");
        };
        f1.display();
    }
}
