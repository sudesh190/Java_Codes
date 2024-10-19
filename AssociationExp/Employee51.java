package com.AssociationExp;

public class Employee51
{
    //We will see about Aggregation in Employee51 class
    private int eId;
    private String Ename;
    private Address address;    //Aggregation

    public Employee51(int eId, String ename, Address address) {
        this.eId = eId;
        Ename = ename;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee51{" +
                "eId=" + eId +
                ", Ename='" + Ename + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args)
    {
        Address addr = new Address("12","Warje", "Pune", "414603");// Aggregation
        Employee51 e = new Employee51(101,"Sudesh",addr);
        System.out.println(e);
        Employee51 e2 = new Employee51(102,"Amol",addr);
        System.out.println(e2);

        // Below Student56 constructor is showing Composition
        Student56 s = new Student56(201,"Sudesh","13","Pune","Warje","456733");
        System.out.println(s);

    }
}
class Address
{
    private String Bno;
    private String City;
    private String area;
    private String pincode;

    public Address(String bno, String city, String area, String pincode)
    {
        Bno= bno;
        City = city;
        this.area = area;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Bno='" + Bno + '\'' +
                ", City='" + City + '\'' +
                ", area='" + area + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

}
class Student56
{
  //We will see About Composition in this Student56 class

    private int stdId;
    private String stdName;
    private Address address;    //Composition

    public Student56(int stdId, String stdName, String bNo , String city,String area, String pincode) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.address = new Address(bNo,city,area,pincode);     // Composition
    }

    @Override
    public String toString() {
        return "Student56{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", address=" + address +
                '}';
    }

}


