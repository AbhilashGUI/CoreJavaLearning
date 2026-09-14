package AssignmentPrograms;

public class CountWordsofaString {

    public static void main(String[] args)
    {

        String name="Pain is a Price of Progress";

        // Remove leading/trailing spaces and split by one or more spaces

        String[] words=name.trim().split("\\s+");

        int count= words.length;

        System.out.println("Input String: "+name);
        System.out.println("Number of Words: "+count);


    }
}