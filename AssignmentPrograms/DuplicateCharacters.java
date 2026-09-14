package AssignmentPrograms;

import java.util.Scanner;

public class DuplicateCharacters {

    public static void main(String[] args)
    {
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println("Duplicate Characters");

        for (int i=0;i<input.length();i++)
        {
            char currentchar=input.charAt(i);
            int count=0;

            for (int j=0;j<input.length();j++)
            {
                if (currentchar==input.charAt(j))
                {
                    count++;
                }
            }

            if (count>1 && input.indexOf(currentchar)==i)
            {
                System.out.println(currentchar+ "="+count);
            }
            sc.close();
        }

    }
}