package com.example.method;

public class Vehicle
{
    String name;
    String color;
    double prize;

    public void display()
    {
        System.out.println("Vehicles name is :" + name);
        System.out.println("Vehicles color is :" + color);
        System.out.println("Vehicle  prize is :" + prize);
    }
    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle();
        v1.name="Car";
        v1.color="white";
        v1.prize=45.65;
        v1.display();
        System.out.println("****************************************");
        Vehicle v2 = new Vehicle();
        v2.name="bike";
        v2.color="black";
        v2.prize=56.65;
        v2.display();
    }
}
