package CentricToAll10.OOPS.Encapsulation;

public class Encapsulation3 {
    public static void main(String[] args) {

        //Enabling the Getter and Setter condition for username and password

        Flipkart fp = new Flipkart("Abh345@gmail.com", "Waitamoment");

        boolean crosscheck = fp.isLoggedin("abh345@gmail.com", "waitamoment");
        System.out.println(crosscheck);

        //Here we are manipulating the username and password details , which is not a concept of data hiding/encapsulation
        fp.setUsername("abhilash@gmail.com");
        String username = fp.getUsername();
        System.out.println(username);

        fp.setPassword("letsnotwait");
        String password = fp.getPassword();
        System.out.println(password);

        boolean crosscheck2 = fp.isLoggedin("abhilash@gmail.com", "letsnotwait");
        System.out.println(crosscheck2);

    }

}
class Flipkart{
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

    public Flipkart( String username,String password) {

        this.username = username;
        this.password = password;
    }

    boolean isLoggedin(String username,String password)
    {
       //Neither using the lowercase method and uppercase method
        if (username.toLowerCase().equals(username) && password.toLowerCase().equals(password))
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

