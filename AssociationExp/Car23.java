package com.AssociationExp;

public class Car23
{
    private String Cname;
    private String brand;
    private String price;
    private MusicPlayer mp;

    public Car23(String cname, String brand, String price, MusicPlayer mp)
    {
        Cname = cname;
        this.brand = brand;
        this.price = price;
        this.mp = mp;
    }

    @Override
    public String toString()
    {
        return "Car23{" +
                "Cname='" + Cname + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", mp=" + mp +
                '}';
    }

    public static void main(String[] args)
    {
        MusicPlayer m = new MusicPlayer("89.33","DJ");
        Car23 c = new Car23("Swift","Maruti","5.4L",m);  //Aggregation
        System.out.println(c);
    }
}
class MusicPlayer
{
    private String Mprice;
    private String Mbrand;

    public MusicPlayer(String mprice, String mbrand)
    {
        Mprice = mprice;
        Mbrand = mbrand;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "Mprice='" + Mprice + '\'' +
                ", Mbrand='" + Mbrand + '\'' +
                '}';
    }
}
