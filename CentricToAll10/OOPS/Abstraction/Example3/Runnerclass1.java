package CentricToAll10.OOPS.Abstraction.Example3;

public class Runnerclass1 {

    public static void main(String[] args) {

        TC_CHROME tc_chrome= new TC_CHROME();
        tc_chrome.openbrowser();
        tc_chrome.search();
        tc_chrome.closebrowser();
        tc_chrome.printlog();

        TC_FIREFOX tc_firefox=new TC_FIREFOX();
        tc_firefox.openbrowser();
        tc_firefox.search();
        tc_firefox.closebrowser();
        tc_firefox.printlog();
    }

    }