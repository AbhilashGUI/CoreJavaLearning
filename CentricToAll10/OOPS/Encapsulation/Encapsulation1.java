package CentricToAll10.OOPS;

public class Encapsulation1
{
   public static void main(String[] args)
    {
        //Error producing example of encapsulation




        vwologin login = new vwologin("abhilash", "learning");
        //Username:abhilash and Password:learning


        //Note: Since we have defined the lowercase method which should be equivalent to this.username equals to username and this.password equals to password function
        //boolean check= login.isLoggedin("abhilash","learning");
        //System.out.println(check);      //It will be loggedIn successfully

        //Passing the incorrect credentials
        boolean check1= login.isLoggedin("abhilash","lazy");
        System.out.println(check1);

        //Since, we are aware about instance, hence we can manipulate the username and password. "BECAUSE STILL THE USERNAME AND PASSWORD IS DEFINED AS PUBLIC"
        boolean check2= login.isLoggedin("abhilash","lazy");
        login.username="vicky";
        login.password="drowsy";
        System.out.println(check2);    //Passing the incorrect values, won't be loggedin


    }


    }

class vwologin{
        public String username;
        public String password;

    //Generate the parameterize constructor, just by selecting the
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





