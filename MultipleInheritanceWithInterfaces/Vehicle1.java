package com.MultipleInheritanceWithInterfaces;

public interface Vehicle1
{
    void start();
    void stop();
}
interface Musicplayer1
{
    void StartMusic();
    void StopMusic();
}
class Car implements Vehicle1 , Musicplayer1
{

    @Override
    public void start() {
        System.out.println("Vehicle is starting......");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle Stoped....");
    }

    @Override
    public void StartMusic() {
        System.out.println("Music is On....");
    }

    @Override
    public void StopMusic() {
        System.out.println("Music is Off.....");
    }
    public void display()
    {
        System.out.println("SWIFT DEZIRE ......");
    }
}
class Client1
{
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        c.start();
        c.stop();
        c.StartMusic();
        c.StopMusic();
    }
}
