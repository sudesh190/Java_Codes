package com.abstraction;

public class Elephant1 extends Animal1
{

    @Override
    void walk() {
        System.out.println("Elephant is walking");
    }

    public static void main(String[] args) {
        Animal1 e = new Elephant1();  // Parent class can hold object of child class
        Animal1 t = new Tiger();     // Parent class can hold object of child class
        e.walk();
        t.walk();


    }
}
