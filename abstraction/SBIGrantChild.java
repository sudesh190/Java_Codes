package com.abstraction;

public class SBIGrantChild extends SBIChildClass
{
    public static void main(String[] args)
    {
        SBIGrantChild s3 = new SBIGrantChild();
        s3.getName();
        s3.RateInterest();
        s3.ChildBankName();
        s3.SBIchildInterest();

    }

    @Override
    public void SBIchildInterest()
    {
        System.out.println("Child Bank Interest is 6%");
    }
}
