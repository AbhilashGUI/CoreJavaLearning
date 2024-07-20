package CentricToAll10.OOPS.Encapsulation;

public class Encapsulation1 {

 public static void main(String[] args)
 {

     //Vwologin vwologin=new Vwologin("abhilash","learning");
     Vwologin vwologin=new Vwologin("ABHILASH","LEARNING");


     //Note: Since we have defined the lowercase method and giving the credentials in uppercase, it should print else statement
     //boolean check= vwologin.isloggedin("abhilash","learning");


     boolean check= vwologin.isloggedin("ABHILASH","LEARNING");
     System.out.println(check);

     //Passing the incorrect credentials based on the logic of method used
     //boolean check1=vwologin.isloggedin("Abhilash","Learning");
     //System.out.println(check1);

     vwologin.username="shirish";   //Able to manipulate username
     vwologin.password="shreyansh"; //Able to manipulate password

     boolean check2= vwologin.isloggedin("ABHILASH","LEARNING");
     System.out.println(check2);  //This should be false
 }
}

class Vwologin{
    public String username;
    public String password;

    public Vwologin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Creating the function

    boolean isloggedin(String username,String password)
    {
        //if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        if(this.username.toUpperCase().equals(username) && this.password.toUpperCase().equals(password))
        {
            System.out.println("Logged In Successfully");
            return true;
        }
        else
        {
            System.out.println("Incorrect credentials");
            return false;
        }
    }
}