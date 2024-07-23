package CentricToAll10.OOPS.Abstraction.Example3;

public class TC_CHROME extends Browser{

    @Override
    String openbrowser() {
        System.out.println("Starting chrome");
        return "";
    }

    @Override
    String closebrowser() {
        System.out.println("Closing chrome");
        return "";
    }

    @Override
    void printlog() {
        super.printlog();
    }
}

