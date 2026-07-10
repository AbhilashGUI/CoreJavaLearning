package CentricToAll10.OOPS.Polymorphism.methodoverloading;

public class Lab160
{
    public static void main(String[] args)
    {

        new Person().Gift("Abhilash");
        new Person().Gift('c');
        new Person().Gift(142);    //Integer
        new Person().Gift(4.37);   //Double/float
        new Person().Gift(123654987685434L);

  //Since, byte, short are int type and float is decimal type, which is already declared.



    }

}
