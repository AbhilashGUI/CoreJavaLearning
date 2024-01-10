package CentricToAll8;

public class Lab141
{
    public static void main(String[] args)
    {
        String s1="Vemula ";
        s1=s1.concat("Abhilash ");
        s1=s1.concat("Sharma");
        //String s2="Vemula"; //Though it is present in SCP, it is not referring
        String s2="Vemula Abhilash Sharma";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
