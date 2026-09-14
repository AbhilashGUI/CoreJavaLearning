package AssignmentPrograms;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args)
    {

        String str1="listen";
        String str2="silent";

        //convert the strings to character

        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();

        //sort both the character arrays

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1,charArray2))
        {
            System.out.println("Given Strings are Anagram");

        }
        else
        {
            System.out.println("Given Strings are not Anagrams");
        }



    }
}