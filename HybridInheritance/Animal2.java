package com.HybridInheritance;

public class Animal2{
    void eat()
    {
        System.out.println("Animal is eating");
    }

}
interface pet
{
    void play();

}
interface legs
{
    void legs();
}
class Cow extends Animal2 implements pet , legs
{

    @Override
    public void play() {
        System.out.println("This Animal is Pet and he is playing......");
    }

    @Override
    public void legs() {
        System.out.println("That Pet is Cow and she have four legs....");
    }

}
class Other2
{
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.eat();
        c1.play();
        c1.legs();
    }
}
