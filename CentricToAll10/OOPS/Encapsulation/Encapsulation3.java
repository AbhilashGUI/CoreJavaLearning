package CentricToAll10.OOPS.Encapsulation;

public class Encapsulation3
{

    public static void main(String[] args)
    {
        //Enabling the Getter and setter condition for username

        vwologin1 login= new vwologin1("abhilash","cool");   //Note: This is hidden data

       boolean check= login.isLoggedin("abhilash","cool");
       System.out.println(check);
       //String username1=login.getUsername1();
       //System.out.println(username1);
        login.setUsername1("vicky");
        String username1=login.getUsername1();
        System.out.println(username1);




    }
}


class vwologin1{


    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }


    private String username1;
    private String password1;

    public vwologin1(String username1, String password1) {
        this.username1 = username1;
        this.password1 = password1;


    }

    boolean isLoggedin(String username, String password){
        if(this.username1.toLowerCase().equals(username) && this.password1.toLowerCase().equals(password))
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

























