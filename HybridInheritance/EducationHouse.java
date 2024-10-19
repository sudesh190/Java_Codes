package com.HybridInheritance;

public class EducationHouse
{
    void display()
    {
        System.out.println("UGC");
    }
}
interface University
{
    void Course();
}
interface Institute
{
    void Admission();
}
class College extends EducationHouse implements University , Institute
{

    @Override
    public void Course() {
        System.out.println("This course better.....");
    }

    @Override
    public void Admission() {
        System.out.println("Admissions are started.....");
    }
}
class Department extends College
{
    void Teaching()
    {
        System.out.println("Teaching is good....");
    }
}
class Office extends College
{
    void Functions()
    {
        System.out.println(" College's Office is goood ......");
    }
}
class Other3
{
    public static void main(String[] args) {
        Department d = new Department();
        d.display();
        d.Course();
        d.Admission();
        d.Teaching();

        Office o = new Office();
        o.display();
        o.Admission();
        o.Course();
        o.Functions();
    }
}
