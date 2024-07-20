package CentricToAll10.OOPS.Encapsulation;

public class Encapsulation3
{
    public static void main(String[] args)
    {

    //Enabling the Getter and Setter condition for username and password

    flipkart fp=new flipkart("Abh345@gmail.com","Waitamoment");

    boolean check= fp.isLoggedin("Abh345@gmail.com","Waitamoment");
    System.out.println(check);

    //Here we are manipulating the username and password details , which is not a concept of data hiding/encapsulation
    fp.setUsername("abhilash@gmail.com");
    String username= fp.getUsername();
    System.out.println(username);

    fp.setPassword("letsnowait");
    String password=fp.getPassword();
    System.out.println(password);
}

}
class flipkart{
    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private String password;

    public flipkart(String password, String username) {
        this.password = password;
        this.username = username;
    }

    boolean isLoggedin(String username,String password)
    {
       //Neither using the lowercase method and uppercase method
        if (this.username.equals(username) && this.username.equals(password))
        {
            System.out.println("Logged in succesfully");
            return true;
        }
        else
        {
            System.out.println("Invalid credentials");
            return  false;
        }

    }

}

