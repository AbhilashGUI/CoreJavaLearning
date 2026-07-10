package CentricToAll10.OOPS.Polymorphism.methodoverloading;

public class Classroom
{


    void Students(char c)
    {
        System.out.println("A is the highest grade :"+ c);
    }
    void Students(int i)
    {
        System.out.println("i denotes  total no. of students :" + i);

    }

   void Students(byte b)
    {
        System.out.println("b denotes no. of male students :"+ b);
    }


   void Students(short s)
    {
        System.out.println("s denotes no. of female students :"+ s);
    }



    void Students(double d)

    {
        System.out.println("d denotes the pass percentage :" + d);
    }



    void Students(String name)
    {
        System.out.println("Topper of the class : " + name);
    }




}
