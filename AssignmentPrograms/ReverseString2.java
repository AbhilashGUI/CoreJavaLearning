package AssignmentPrograms;

public class ReverseString2 {

    public static void main(String[] args)
    {
        ////Reverse the String
        String name="Abhilash";
        String y="";
        for (int i= name.length()-1; i >=0 ; i--)
        {
            y=y+name.charAt(i);  //To return the character at a specific index in a string.
        }
        System.out.println(y);
    }
}

