package com.SpringCore.Coupling;

// Tight Coupling Example
public class Vehicles
{
    public static void main(String[] args)
    {
        Bikes b = new Bikes();
        b.Drive();
    }
}
class Bikes
{
    public void Drive()
    {
        System.out.println("Bike Ridding.....");
    }
}
