package CentricToAll10.OOPS.Abstraction.Interface.RealtimeExample;

import CentricToAll10.OOPS.Abstraction.Interface.Founder;

public class Runner implements Founder {
    @Override
    public void earned10cr() {
        System.out.println("I made it 100cr with blessing of ancestors");
        Founder.print2();
    }
}
