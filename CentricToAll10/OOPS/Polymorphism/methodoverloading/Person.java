package CentricToAll10.OOPS.Polymorphism.methodoverloading;

public class Person
{

    //Method Overloading: Multiple methods with same names, But different argument.



       void Gift(char a)
       {
           System.out.println("Character is :" + a);
       }

       void Gift(String name)
       {

           System.out.println("String is :" + name);
       }


      byte Gift(byte b)
      {
          System.out.println("Byte is :" + b);
          return b;
      }


     int Gift(int i)
    {
        System.out.println("Integer is:" + i);
        return i;
    }

    short Gift(short s)
    {
        System.out.println("Short is :"+ s );
        return  s;
    }

  long Gift(long l)
  {
      System.out.println("Long is :" + l);
      return l;
  }

  double Gift(double d)
  {
      System.out.println("Decimal number/double :"+ d);
      return d;
  }

 float Gift(float f)
 {
     System.out.println("Decimal number/float :"+f);
     return f;
 }

}
