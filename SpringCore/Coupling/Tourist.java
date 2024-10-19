package com.SpringCore.Coupling;

public interface Tourist
{
    void Travel();
}
class BusTraveller implements Tourist
{
    @Override
    public void Travel()
    {
        System.out.println("Tourists are Traveling on the bus....");
    }
}
class CarTraveller implements Tourist
{
    @Override
    public void Travel()
    {
        System.out.println("Tourists are Traveling in the Car ");
    }
}
class Tour
{
    Tourist tourist;

    public static void main(String[] args)
    {
        Tour t1 = new Tour();
        // Tourist making his Tour with Bus
        t1.tourist = new BusTraveller();
        t1.tourist.Travel();

        //Tourist making his Tour with Car
        t1.tourist = new CarTraveller();
        t1.tourist.Travel();
    }
}
