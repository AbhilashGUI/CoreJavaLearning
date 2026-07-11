package CentricToAll10.OOPS.Abstraction.Example1;


public abstract class Animal
{
    Animal()
    {
        System.out.println("I'm a default constructor");
    }

    void domesticanimal()
    {
        System.out.println("I'm a domestic animal");
    }

    abstract void pet();
}
