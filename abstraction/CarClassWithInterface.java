package com.abstraction;

public class CarClassWithInterface implements VehicleInterface , WheelInterface
{

    @Override
    public void run() {
        System.out.println("Speed is  " + VehicleInterface.speed);
    }

    @Override
    public void wheels() {
        System.out.println("This car is 4 wheelar");
    }

    public static void main(String[] args) {
        CarClassWithInterface c = new CarClassWithInterface();
        c.run();
        c.wheels();

        }
    }

