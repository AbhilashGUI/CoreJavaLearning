package CentricToAll3;

public class Lab030
{
    public static void main(String[] args)
    {
        String name="Vemula Abhilash"; //String is created in stringconstantpool
        String name1="Vemula Abhilash";//Since it is a similar string it is referring to the same
        String name2="Abhilash"; //It creates a another string in stringconstantpool
        String name3= new String("Vemula Abhilash Sharma"); //It will create a new string in the heap/object area
        String name4="vemula abhilash sharma";

        System.out.println(name==name1);
        System.out.println(name.equals(name1));//equals() method check for values
        System.out.println(name==name3); //== operator checks for references
        System.out.println(name.equals(name3));
        System.out.println(name4.equalsIgnoreCase(name3));
        // Since we are changing the content to make it equivalent,we are  using ignore method.
    }
}
