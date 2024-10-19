package com.constructor.examles;

public class Students {
    int roll;
    String name;
    double marks;

    public Students(int roll, String name, double marks)
    {
      this(); // <<-----------to access the zero parameterised constructor
      this.roll = roll; // <<--------------this keyword act as object
                            // it is used to eliminate the
                            //confusion betn parameters and class attributes having same name
        this.name = name;
        this.marks = marks;
    }

    public Students()
    {
        System.out.println("**********************************************");
        System.out.println("Constructor with zero parameters");
    }
    public void display()
    {
        System.out.println("name is :" + name);
        System.out.println("marks :" + marks);
        System.out.println("roll :" + roll);
    }
    public static void main(String[] args)
    {
        Students s1 = new Students(1 , "Sudesh" , 78.2);
        s1.display();
        Students s2 = new Students(2 , "Mahesh" , 98.4);
        s2.display();
        Students s3 = new Students(3 , "Amol" , 99.4);
        s3.display();
    }
}
