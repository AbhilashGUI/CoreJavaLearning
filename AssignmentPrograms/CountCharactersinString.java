package AssignmentPrograms;

import java.util.Scanner;

public class CountCharactersinString {


    public static void main(String[] args)
    {
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        int count=input.length();
        System.out.println("Total number of characters are: "+count);

        int index_count=input.length()-1;
        System.out.println("Total number of indexes are: "+index_count);

        sc.close();
    }
}