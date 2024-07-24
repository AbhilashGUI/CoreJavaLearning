package CentricToAll10.OOPS.Abstraction.Interface;
interface FatherInterface
{
    void loan10K();

    default void print()
    {
        System.out.println("I am default method");
    }

    static void print2(){
        System.out.println("I am static method!");
    }
}
