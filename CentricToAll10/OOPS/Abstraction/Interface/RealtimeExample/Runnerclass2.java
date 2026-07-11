package CentricToAll10.OOPS.Abstraction.Interface.RealtimeExample;

import CentricToAll10.OOPS.Abstraction.Interface.Son;

public class Runnerclass2 extends Son{
    public static void main(String[] args)
    {
        Son son= new Son();
        son.print();
        son.loan10K();

    }

   //Note:First it prints the static method and at last it prints the default method defined in the main class
}
