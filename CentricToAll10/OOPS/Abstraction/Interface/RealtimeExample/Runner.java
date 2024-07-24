package CentricToAll10.OOPS.Abstraction.Interface.RealtimeExample;

import CentricToAll10.OOPS.Abstraction.Interface.Founder;

public class Runner implements Founder {
    @Override
    public void earned100cr() {
        System.out.println("I made it 10000cr with blessing of ancestors");
        Founder.print2();
    }
}
