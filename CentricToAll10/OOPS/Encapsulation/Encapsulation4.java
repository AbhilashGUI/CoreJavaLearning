package CentricToAll10.OOPS.Encapsulation;

public class Encapsulation4
{

    public static void main(String[] args)
    {




      flipkart login=new flipkart("vemulaabhilash03","ABHI@364");  //Hidden data

      //Post removing the lowecase() method,  which should be equivalent to this.username equals to username and this.password equals to password function
     boolean check=login.isLoggedin("vemulaabhilash03","ABHI@364");
     System.out.println(check);

   login.setUsername("vemulaabhilash3");
   String Username=login.getUsername();
   System.out.println(Username);
   String Password= login.getPassword();
   System.out.println(Password);


    }

}
class flipkart{

   //Generate the Getter and Setter for username
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    private  String Username;

    //Generate the Getter for password
    public String getPassword() {
        return Password;
    }

    private String Password;

    public flipkart(String username, String password) {
         this.Username = username;
         this.Password = password;
    }

    boolean isLoggedin(String username, String password){
        if(this.Username.equals(username) && this.Password.equals(password))
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




