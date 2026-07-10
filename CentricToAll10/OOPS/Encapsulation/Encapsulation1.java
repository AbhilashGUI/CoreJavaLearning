package CentricToAll10.OOPS.Encapsulation;

public class Encapsulation1 {

    public static void main(String[] args) {

        Vwologin vwologin = new Vwologin("Abhilash", "Testcheck");

        boolean check = vwologin.isloggedin("abhilash", "testcheck");
        System.out.println(check);

        boolean check2 = vwologin.isloggedin("ABHILASH", "TESTCHECK");
        System.out.println(check2);

        boolean check3 = vwologin.isloggedin("Abhilash", "Testcheck");
        System.out.println(check3);

        String username="vicky";
        String password="test";

        boolean check4= vwologin.isloggedin("vicky","test");
        System.out.println(check4);


    }


}
class Vwologin {


    public String Username;
    public String Password;


    Vwologin(String username, String password) {
        Username = username;
        Password = password;
    }

    //Creating a function
    boolean isloggedin(String username, String password) {
        if (username.toLowerCase().equals(username) && password.toLowerCase().equals(password)) {
            System.out.println("User is loggedin Successfully");
            return true;
        } else {
            System.out.println("Invalid crdentials");
            return false;
        }
    }
}
