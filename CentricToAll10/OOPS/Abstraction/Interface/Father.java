package CentricToAll10.OOPS.Abstraction.Interface;


public interface Father
{
    void loan10K();

    default void print()
    {
    }

    static void print2(){
        System.out.println("I am static method!");
    }
}
