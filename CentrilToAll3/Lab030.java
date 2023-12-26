package CentrilToAll3;

public class Lab030
{
    public static void main(String[] args)
    {
        String name="Vemula Abhilash Sharma"; //String is created in stringconstantpool
        String name1="Vemula Abhilash Sharma";//Since it is a similar string it will be referring to it
        String name2="Abhilash"; //It creates a another string in stringconstantpool
        String name3= new String("Vemula Abhilash sharma"); //It will create a new string in the heap area

        System.out.println(name==name1); //
        System.out.println(name.equals(name1));//equals() method check for values
        System.out.println(name==name3); //== operator checks for references
        //System.out.println(name.equals(name3));
        System.out.println(name.equalsIgnoreCase(name3));
        // Since we are changing the content to make it equivalent,we are  using ignore method.
    }
}
