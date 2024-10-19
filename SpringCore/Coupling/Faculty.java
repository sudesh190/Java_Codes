package com.SpringCore.Coupling;

// Tight Coupling Example
public class Faculty
{
    public static void main(String[] args)
    {
       Students1 s = new Students1();
       s.learn();
    }
}
class Students1
{
    public void learn()
    {
        System.out.println("Students are learning....");
    }
}
