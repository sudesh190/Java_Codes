package com.example.accessmodifiers;

public class FirstExample
{
    int i = 20;
    int num = 30;
    String name = "Sudesh";
    public void add()
    {
        System.out.println("public method");
        System.out.println("Addition is: " + (num+i));
    }
    private void subtract()
    {
        System.out.println("private method");
        System.out.println("Substraction is :" + (num-i));
    }
    protected void multiply()
    {
        System.out.println("protected method");
        System.out.println("Multiplication is :" + (num*i));
    }
    void div()
    {
        System.out.println("default method");
        System.out.println("division is :" + (num/i));
    }
    public void getName()
    {
        System.out.println("Name is" + name);
    }
    public static void main(String[] args)
    {
        FirstExample first = new FirstExample();
        first.add();
        first.div();
        first.multiply();
        first.subtract();
        first.getName();
    }
}
