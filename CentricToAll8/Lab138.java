package CentricToAll8;

public class Lab138
{
   public static void main(String[] args)
   {

       String s1="Abhilash";
       String s2=new String("abhilash");
       String s3=new String("Abhilash");

       System.out.println(s1==s3);//It checks for the reference location. However the locations of string1 !=string 2.
       System.out.println(s2==s3);
       System.out.println(s1.equals(s2)); //It checks the values, since these are not equal
       System.out.println(s1.equals(s3));
       System.out.println(s2.equalsIgnoreCase(s3));




    }
}
