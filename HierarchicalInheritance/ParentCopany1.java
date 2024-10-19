package com.HierarchicalInheritance;

public class ParentCopany1
{
    String CompanyName;
    int CompanyId;
    int id;
    public ParentCopany1(){

    }
    public ParentCopany1(int id)
    {
        this.id = id;
    }

    public ParentCopany1(String CompanyName , int CompanyId)
    {
        this.CompanyId = CompanyId;
        this.CompanyName=CompanyName;
    }
    void disp()
    {
        System.out.println("This is parent company"+CompanyName+"company id"+CompanyId);
    }

}
class Itcompany extends ParentCopany1
{
         int ITid;
    public Itcompany(String CompanyName, int CompanyId , int ITid)
    {
        super(CompanyName,CompanyId);    //super(); invokes or calls the constructor of parent class in the costructor of child class
        this.ITid=ITid;
    }
    void disp1()
    {
        super.disp();
        System.out.println("ITCompany Name" + CompanyName);
        System.out.println("Disp and disp1 methods"+ITid);
    }
}
class HRcompany extends ParentCopany1
{
    String HRname;
    int HRid;
    String HrCompName;
    public HRcompany( String CompanyName , int CompanyId , int HRid)
    {
       super(CompanyName,CompanyId);
        this.HRname = HRname;
        this.HRid=HRid;
        this.HrCompName= HrCompName;
    }
    void disp2()
    {
        super.disp();        // (super.) keyword calls the method of parent class in method of child class
        System.out.println("This is HRcompany" + CompanyName);
        System.out.println("Hrname" + HRname);
    }
}
class cliient {
    public static void main(String[] args)
    {
        Itcompany i1 = new Itcompany("Technogrowth" , 101, 1);
        i1.disp();
        i1.disp1();

        HRcompany hr = new HRcompany("Logipool"  , 102 , 2);
        hr.disp();
        hr.disp2();
    }
}
