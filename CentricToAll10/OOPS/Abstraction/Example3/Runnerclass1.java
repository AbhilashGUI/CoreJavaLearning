package CentricToAll10.OOPS.Abstraction.Example3;

public class Runnerclass1
{
    public static void main(String[] args)
    {
        TC_CHROME tc=new TC_CHROME();
        tc.openbrowser();
        tc.closebrowser();
        tc.printlog();


        TC_FIREFOX tc1= new TC_FIREFOX();
        tc1.openbrowser();
        tc1.closebrowser();
        tc1.printlog();

    }
}
