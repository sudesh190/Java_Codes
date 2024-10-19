package com.abstraction;

public class Horse extends Meal {

    @Override
    void eat() {
        System.out.println("Horse eats grass");
    }

    public static void main(String[] args) {
        Meal h = new Horse() ;
        h.eat();

    }
}
