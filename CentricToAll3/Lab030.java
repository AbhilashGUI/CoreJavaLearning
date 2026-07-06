package CentricToAll3;

public class Lab030
{
    public static void main(String[] args)
    {
        String name="Vemula Abhilash"; //String is created in stringconstantpool
        String name2="Vemula Abhilash"; //Since it referring to the same String
        String name3="Abhilash Sharma"; //It creates a string in SCP
        String name4= new String("Abhilash sharma");

        System.out.println(name==name2); //== operator checks for references
        System.out.println(name2==name3);
        System.out.println(name3==name4);
        System.out.println(name2.equals(name4)); //equals() method check for values
        System.out.println(name4.equalsIgnoreCase(name3));

        // Since we are changing the content to make it equivalent,we are  using ignore method.
    }
}
