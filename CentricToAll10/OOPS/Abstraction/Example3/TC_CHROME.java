package CentricToAll10.OOPS.Abstraction.Example3;

public class TC_CHROME extends Browser{


    @Override
    String openbrowser() {
        System.out.println("Browser is navigating to respective page");
        return "";
    }

    @Override
    String search() {
        System.out.println("Encrypt the search history");
        return "";
    }

    @Override
    String closebrowser() {
        System.out.println("Browser is closed successfully");
        return "";
    }


}