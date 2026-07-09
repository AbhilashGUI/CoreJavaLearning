package CentricToAll9.OOPS.Constructors;

public class Person1
{
    //Attributes
    //Default values of primitive data types
    String name;
    String emailaddress;
    int empid;
    String department;
    long  mobilenumber;
    float experience;
    double salary;



    //Initializing default constructor
    Person1()             //Constructor name Should be same as the class name
    {
    name="Abhilash";
    emailaddress="Abhitestcheck@gmail.com";
    empid=100;
    department="Software Testing";
    mobilenumber=9075632145l;
    experience=4.2f;
    salary=7.5;

    }


    //Behaviour

    static void read()
    {
        System.out.println("Able to read");
    }



    void printdetails() {
        System.out.println(name);
        System.out.println(emailaddress);
        System.out.println(empid);
        System.out.println(department);
        System.out.println(mobilenumber);
        System.out.println(experience);
        System.out.println(salary);


    }
}

