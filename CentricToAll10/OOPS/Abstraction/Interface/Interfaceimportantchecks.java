package CentricToAll10.OOPS.Abstraction.Interface;

public class Interfaceimportantchecks
{
    public static void main(String[] args)
    {

       hello h= new hello();
       h.say();
       h.hello();  //It prints the child function by default. If it is not declared, then it prints the default(parent) function.

       I i=new hello(); //Child object to parent class
       i.hello();//It prints the child function by default. If it not declared, then it prints the default(parent) function.



    }

}
 interface I{
    void say();   //incomplete function
    default void hello()
    {
        System.out.println("Hello default");
    }
 }
 interface b{ }        //empty class


class hello implements I
{

    @Override
    public void say() {
        System.out.println("Say!!");
    }

    @Override
    public void hello() {
        System.out.println("Hello of hello");
    }
}