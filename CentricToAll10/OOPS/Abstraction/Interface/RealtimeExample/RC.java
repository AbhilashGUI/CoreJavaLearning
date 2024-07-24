package CentricToAll10.OOPS.Abstraction.Interface.RealtimeExample;

import CentricToAll10.OOPS.Abstraction.Interface.Son;

public class RC {
    public static void main(String[] args)
    {
        Son son= new Son();
        son.loan10K();
        son.print();
    }

   //Note:First it prints the static method and at last it prints the default method defined in the main class
}
