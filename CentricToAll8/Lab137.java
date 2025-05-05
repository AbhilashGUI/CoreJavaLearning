package CentricToAll8;

public class Lab137
{
    public static void main(String[] args)
    {
        String str1="Vemula";
        System.out.println(str1.concat("Abhilash"));
        System.out.println(str1+ "Abhilash");
        System.out.println(str1.contains("n"));
        //Used to check if a certain sequence of characters is present within a string


        String password1="Vemula@123";
        String confirmpassword1="vemula@123";
        if(password1.equalsIgnoreCase(confirmpassword1))
                // compares two strings, ignoring lower case and upper case differences.
        {
            System.out.println("True");
        }
        else{
            System.out.print("False");
        }







    }
}
