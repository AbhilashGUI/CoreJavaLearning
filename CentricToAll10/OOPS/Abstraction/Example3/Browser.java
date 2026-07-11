package CentricToAll10.OOPS.Abstraction.Example3;

public abstract class Browser{

    abstract String openbrowser();
    abstract String search();
    abstract String closebrowser();

    void printlog()
    {
        System.out.println("After browsing, delete the cookies");
    }
}