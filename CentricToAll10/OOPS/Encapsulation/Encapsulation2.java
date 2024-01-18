package CentricToAll10.OOPS.Encapsulation;

public class Encapsulation2
{

    public static void main(String[] args)
    {
    //Error correcting  example of encapsulation

    vwologin login = new vwologin("abhilash", "learning");   //Note: This is hidden data
    //Username:abhilash and Password:learning

        //Note: Since we have defined the lowercase method which should be equivalent to this.username equals to username and this.password equals to password function

    boolean check= login.isLoggedin("abhilash","learning");
    System.out.println(check);      //It will be loggedIn successfully
        login.setUsername("learneraccount");
        String username= login.getUsername();
        System.out.println(username);         //Able to retrieve the new username
        String password=login.getPassword();
        System.out.println(password);        //Able to retrieve password

    //Though we are  aware about instance,  cannot  manipulate the username and password. "BECAUSE  USERNAME AND PASSWORD IS DEFINED AS PRIVATE" "
    //login.username="vicky";    //It will throw an error
    //login.password="drowsy";   //It will throw an error

}


    }

class vwologin{

    //Generate the Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;


    //Generate the Getter for password
    public String getPassword() {
        return password;
    }

    private String password;

    //Generate the parameterize constructor
    public vwologin(String username, String password) {
        this.username = username;
        this.password = password;
    }


    //Creating the function

    boolean isLoggedin(String username, String password){
        if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {

            System.out.println("LoggedIn Successfully");
            return  true;
        }
        else
        {
            System.out.println("Incorrect credentials");
            return  false;
        }
    }









}







