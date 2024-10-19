package com.examples.oops;

public class EncapsulationExp2
{
    private int id;
    private String name;
    private double marks;

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setMarks(double marks)
    {
        this.marks=marks;
    }
    public double getMarks()
    {
        return marks;
    }

    public static void main (String[] args)
    {
        EncapsulationExp2 e1 = new EncapsulationExp2();
        e1.setId(1);
        e1.setMarks(2254.2);
        e1.setName("Sudesh");

        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getMarks());

        System.out.println("********");
        e1.setId(2);
        e1.setMarks(233.2);
        e1.setName("Mahesh");

        System.out.println(e1.getId());
        System.out.println(e1.getName());
        System.out.println(e1.getMarks());
    }
}
