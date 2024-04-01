package AssignmentPrograms;

public class Count2
{
    public static void main(String[] args)
    {
// //Develop a program that counts the number of characters, vowels and consonants in a given string using loops and conditions.
        String longestword="pneumonoultramicroscopicsilicovolcanoconiosis";
        int Vcount=0;
        int Ccount=0;




        //Finding the count of  vowels
        for (int i = 0; i <longestword.length() ; i++)
        {

        if(longestword.charAt(i)=='a'||longestword.charAt(i)=='e'||longestword.charAt(i)=='i'||longestword.charAt(i)=='o'||longestword.charAt(i)=='u')
        {
            Vcount++;
        }

        if(longestword.charAt(i) > 'a' && longestword.charAt(i)<'z')
            {
                Ccount++;
            }


    }

        System.out.println("Total number of vowels in a given string are : " + Vcount);
        System.out.println("Total number of vowels in a given string are : " + Ccount);


    }
}
