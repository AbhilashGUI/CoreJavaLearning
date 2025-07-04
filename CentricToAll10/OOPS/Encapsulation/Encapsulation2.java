package CentricToAll10.OOPS.Encapsulation;

public class Encapsulation2

{
    public static void main(String[] args)
    {
        //Enabling the Getter and Setter condition
       Vwologin2 vwologin2=new Vwologin2("Abhilash","Learning");

       boolean check=vwologin2.isLoggedin("Abhilash","learning"); //It should thro
       System.out.println(check);


       vwologin2.setUsername("vicky");
       //Note: Unable to set the password , user is allowed to set  and get the password
        String username=vwologin2.getUsername();

        System.out.println(username);

        boolean check2= vwologin2.isLoggedin("vicky","learning");
        System.out.println(check2);



    }
}

//Concept of encapsulation
class Vwologin2 {

    public void setUsername(String username) {    //Allowing the user to set the username
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    private String username;
    private String password;


    public Vwologin2(String username, String password) {
        this.username = username;
        this.password = password;


    }

    boolean isLoggedin(String username, String password) {
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {
            System.out.println("LoggedIn Successfully");
            return true;
        }
        else
        {
            System.out.println("Wrong Credentials");
            return false;
        }
    }
}
