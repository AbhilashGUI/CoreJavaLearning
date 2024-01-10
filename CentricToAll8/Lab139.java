package CentricToAll8;

public class Lab139
{
    public static void main(String[] args)
    {
        //Let's understand the difference b/w string and stringbuilder&stringbuffer


        //Strings are immutable in nature(Unchangeable)
        String s1="Vemula ";
        s1=s1.concat("Abhilash ");
        s1=s1.concat("Sharma");
        System.out.println(s1);   //New value is created in SCP and old value is just present without reference

        String s2=new String("Vemula Abhilash Sharma");  //A new string is created in object area
        System.out.println(s2);




      //String buffer & String builder are mutable in nature(Able to change /Manipulate as per need)

        StringBuilder sb= new StringBuilder("Vemula");   //It creates new string in object area
        sb.append(" Abhilash");  //Post appending new string. It deletes the old string in object area. The appended string will be appeared
        System.out.println(sb);

        StringBuffer sbf= new StringBuffer("Vicky");   //It creates new string in object area
        sbf.append(" Dharam");  //Post appending new string. It deletes the old string in object area. The appended string will be appeared
        System.out.println(sbf);











    }



}
