package CentricToAll8;

public class Lab141
{
    public static void main(String[] args)
    {
        String s1="Vemula";
        String s2="Vemula"; //
        String s3="Vemula Abhilash Sharma";
        s1=s1.concat("Abhilash");
        s1=s1.concat("Sharma");
        //System.out.println(s1==s2);
        //System.out.println(s1.equals(s2));
        System.out.println(s1==s3);  //Since string 1 gets concatenated it creates a new entity at every instance
        System.out.println(s1.equals(s3));  //However the value remains same if no differences
        System.out.println(s1);
        System.out.println(s3);

    }
}
