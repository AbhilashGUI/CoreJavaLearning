package AssignmentPrograms;

import java.util.Scanner;

public class CharacterFrequencyCount {

    public static void main(String[] args)
    {

        System.out.println("Enter the String:");
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();

        for (int i=0;i<input.length();i++)
        {
            char currentchar=input.charAt(i);
            int count=0;

            for (int j=0;j<input.length();j++) {
                if (currentchar == input.charAt(j)) {
                    count++;
                }
            }
                System.out.println(currentchar + "= " +count);
            }
            sc.close();
        }


    }
