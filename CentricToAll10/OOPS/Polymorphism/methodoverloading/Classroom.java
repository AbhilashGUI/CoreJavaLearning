package CentricToAll10.OOPS.Polymorphism.methodoverloading;

public class Classroom
{

    void Students(int i)
    {
        System.out.println("i denotes  no. of students(Male&Female) : " +i);

    }

   void Students(byte b)
    {
        System.out.println(b);
    }


   void Students(short s)
    {
        System.out.println(s);
    }



    void Students(double d)

    {
        System.out.println("d denotes the pass percentage : " + d);
    }



    void Students(String name)
    {
        name="Sundar";
        System.out.println("Topper of the class : " + name);
    }




}
