package com.Collection;

import java.util.ArrayList;
import java.util.List;

//ArrayList Program using User Defined class - EmployeeData
public class ArrayList4
{
    public static void main(String[] args) {

       EmployeData e1 = new EmployeData(101,"Sudesh",50000.8);
       EmployeData e2 = new EmployeData(102,"Mahesh", 60000.6);
       EmployeData e3 = new EmployeData(103,"Amol", 70000.6);

       //Add objects in list through constructor
       ArrayList<EmployeData> obj1 = new ArrayList<>(List.of(e1,e2,e3 , new EmployeData(104,"Kartik",80000.6)));

        for (EmployeData temp : obj1)    //for each loop to print object in the list
        {
            System.out.println(temp.id+" "+temp.name+" "+temp.salary);
        }
        System.out.println("**************");
        EmployeData e4 = new EmployeData(1001,"Sarthak", 80000.5);
        EmployeData e5 = new EmployeData(1002,"Swaraj",80000.4);

        ArrayList<EmployeData> obj2 = new ArrayList<>();  //Another Object
        //Add object in obj2 by .add method
        obj2.add(e4);
        obj2.add(e5);
        obj2.add(new EmployeData(1003,"Suraj", 90000.4));   //nameless object
        obj2.addAll(obj1);
        System.out.println("*****for each loop*************");
        for (EmployeData temp2 : obj2)  //for each loop
        {
            System.out.println(temp2.id+" "+temp2.name+" "+ temp2.salary);
        }
        System.out.println("**************");
        System.out.println("Lamda expression");
        //Lambda expression to print objects in the list obj2
        obj2.forEach(temp2 -> System.out.println(temp2.id+" "+temp2.name+" "+ temp2.salary));
    }
}
