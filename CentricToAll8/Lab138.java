package CentricToAll8;

public class Lab138
{
    public static void main(String[] args)
    {
        String s1="Vemula";
        String s2=new String("vemula");
        String s3=new String("Vemula");
        //s1="Abhilash";

        //Now lets compare the string using == operator and equals method
        //NOTE:IPV


        System.out.println(s1==s3);  //It checks for the reference location. However the locations of string1 !=string 2. Thus resulting as false;
        System.out.println(s1==s2); //Same as above
        System.out.println(s1.equals(s2)); //It checks the values, since these are not equal.Thus resulting as false
        System.out.println(s1.equalsIgnoreCase(s2)); //It ignoring the difference and resulting as true.
        System.out.println(s1.equals(s3)) ; //It checks the values, since these are similar and resulting as true





    }
}
