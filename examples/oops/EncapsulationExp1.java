package com.examples.oops;

import java.util.Scanner;

public class EncapsulationExp1
{

    private int pass ;

    private String name;
    private double balance ;

    @Override
    public String toString() {
        return "EncapsulationExp1{" +
                "pass=" + pass +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void setPass(int pass)
     {
         this.pass = pass;
     }
     public int getPass()
     {
         return pass;
     }
     public void setName(String name)
     {
         this.name = name;
     }

    public String getName()
    {
        return name;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        EncapsulationExp1 e1 = new EncapsulationExp1();
        EncapsulationExp1 e2 = new EncapsulationExp1();


//        sc.nextLine(e1.setName());
        System.out.println("enter the user name...");
        e1.setName(sc.nextLine());  //takes input from user

        System.out.println("enter the user password...");
        e1.setPass(sc.nextInt());

//        e1.setBalance(sc.nextDouble());
//        e1.setPass(9826524);
//        e1.setName("Sudesh");
       e1.setBalance(233000.63);

//
//        e2.setPass(6355112);
//        e2.setName("Mahesh");
//        e2.setBalance(5866.25);

        System.out.println(e1.toString());
//        System.out.println("*********");
//        System.out.println(e2.toString());



    }
}
