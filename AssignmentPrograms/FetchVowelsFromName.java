package AssignmentPrograms;

public class FetchVowelsFromName {

    public static void main(String[] args)
    {

        String Name="Abhilash";
        System.out.println("Vowels in the name: ");

        for (int i=0;i<Name.length();i++)
        {
            char character=Character.toLowerCase(Name.charAt(i));

            if (character=='a' || character=='e' | character=='i' || character=='o' || character=='u')
            {
                System.out.println(character);
            }

        }

    }
}