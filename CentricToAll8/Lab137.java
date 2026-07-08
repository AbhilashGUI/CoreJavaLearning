package CentricToAll8;

public class Lab137
{
    public static void main(String[] args)
    {
        //String inbuilt functions
        String str="Vemula";
        System.out.println(str.concat("Abhilash"));
        //It works in the same way
        System.out.println(str +" Abhilash Sharma");
        System.out.println(str.contains("e"));
        System.out.println(str.contains("n"));

        String Resetpassword="Testcheck@123";
        String confirmpassword="testcheck@123";
        if(Resetpassword.equalsIgnoreCase(confirmpassword))
        {
            System.out.println("Password updated successfully");
        }
        else
        {
            System.out.println("Password Mismatch");
        }




    }
}
