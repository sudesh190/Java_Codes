package com.example.method;

public class Fruits
{
    String color;
    String name;
    double price;

    public void display()
    {
        System.out.println("Color of the fruits is :" + color);
        System.out.println("Fruit name is :" + name);
        System.out.println("Price is :" + price);
    }
    public static void main(String[] args)
    {
        Fruits f1 = new Fruits();
                f1.color="Red";
                f1.name="Apple";
                f1.price=45.3;
                f1.display();

        System.out.println("******************************");

                Fruits f2 = new Fruits();
                 f2.color="yellow";
                 f2.name="Mango";
                 f2.price=45.50;
                 f2.display();

    }
}
