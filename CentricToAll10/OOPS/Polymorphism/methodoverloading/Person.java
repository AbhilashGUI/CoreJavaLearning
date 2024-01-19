package CentricToAll10.OOPS.Polymorphism.methodoverloading;

public class Person
{

    //Method Overloading: Multiple methods with same names, But different argument.



       void Gift(char a)
       {
           System.out.println("C is a character :" + a);
       }

       void Gift(String name)
       {
           name="Abhilash";
           System.out.println("Name is a String :" + name);
       }


      byte Gift(byte b)
      {
          System.out.println("b is a byte :" + b);
          return b;
      }


     int Gift(int i)
    {
        System.out.println("i is an integer :" + i);
        return i;
    }

    short Gift(short s)
    {
        System.out.println("s is a short :"+ s );
        return  s;
    }

  long Gift(long l)
  {
      System.out.println("l is  a long :" + l);
      return l;
  }

  double Gift(double d)
  {
      System.out.println("d is a decimal number :"+ d);
      return d;
  }

 float Gift(float f)
 {
     System.out.println("f is a decimal number :"+f);
     return f;
 }

}
