package CentricToAll10.OOPS.Encapsulation;

public class Encapsulation1 {

    public static void main(String[] args) {

        vwologin vwologin = new vwologin("Abhilash", "Learning");

        boolean check = vwologin.isloggedin("abhilash", "learning");
        System.out.println(check);

        boolean check2 =vwologin.isloggedin("Abhilash","Learning");
        System.out.println(check2);

        boolean check3=vwologin.isloggedin("ABHILASH","LEARNING");
        System.out.println(check3);


        vwologin.username="Vicky";
        vwologin.password="Notinterested";

        //Since, we have declared username and password in public. User is able to manipulate them.

        boolean check4=vwologin.isloggedin("vicky","notinterested");
        System.out.println(check4);

        boolean check5=vwologin.isloggedin("VICKY","NOTINTERESTED");
        System.out.println(check5);
    }
}
    class vwologin {

        public String username;
        public String password;


        public vwologin(String username, String password) {
            this.username = username;
            this.password = password;
        }

        //Creating the function

        boolean isloggedin(String username, String password) {
            if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
                System.out.println("User loggedin successfully");
                return true;


            } else {
                System.out.println("Invalid credentials");
                return false;
            }

        }
    }







