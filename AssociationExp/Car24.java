package com.AssociationExp;

public class Car24
{
    private String Cname1;
    private String Company;
    private Engine engine;

    public Car24(String cname1, String company, String Type , String Eprice)
    {
        Cname1 = cname1;
        Company = company;
        this.engine = new Engine(Type,Eprice);      // Composition
    }

    @Override
    public String toString() {
        return "Car24{" +
                "Cname1='" + Cname1 + '\'' +
                ", Company='" + Company + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args)
    {
        // Composition
        Car24 c1 = new Car24("Swift","Maruti","4-Stroke engine","14k");
        System.out.println(c1);
    }
}
class Engine
{
    private String Type;
    private String Eprice;

    public Engine(String type, String eprice)
    {
        Type = type;
        Eprice = eprice;
    }

    @Override
    public String toString()
    {
        return "Engine{" +
                "Type='" + Type + '\'' +
                ", Eprice='" + Eprice + '\'' +
                '}';
    }
}
