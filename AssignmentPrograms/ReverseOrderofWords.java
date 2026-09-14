package AssignmentPrograms;

public class ReverseOrderofWords {

    public static void main(String[] args)
    {

        String name= "I am Learning Java";

        // Split the String into words
        String[] word=name.split(" ");

        // Print words in reverse order
        for (int i= word.length-1;i>=0;i--)
        {
            System.out.print(word[i]+" ");
        }


    }
}