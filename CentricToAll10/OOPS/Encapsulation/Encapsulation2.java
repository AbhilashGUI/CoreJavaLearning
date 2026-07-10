package CentricToAll10.OOPS.Encapsulation;

public class Encapsulation2 {

    public static void main(String[] args)
    {


        Vwologin2 vwologin2= new Vwologin2("Suraj","Sangve");

        boolean check=vwologin2.isloggedin("suraj","sangve");
        System.out.println(check);

        boolean check2= vwologin2.isloggedin("Suraj","Sangve");
        System.out.println(check2);

        vwologin2.setUsername("manish");
        String username=vwologin2.getUsername();
        System.out.println(username);

        boolean check3= vwologin2.isloggedin("manish","sangve");
        System.out.println(check3);
    }


}


class Vwologin2 {


    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    private String Username;
    private String Password;


    public Vwologin2(String username, String password) {
        Username = username;
        Password = password;
    }


    boolean isloggedin(String username, String password) {
        if (username.toLowerCase().equals(username) && password.toLowerCase().equals(password)) {
            System.out.println("User is logged in successfully");
            return true;
        } else {
            System.out.println("Invalid credentials");
            return false;

        }
    }
}

