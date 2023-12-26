package CentricToAll4;
import java.util.Scanner;
public class Lab041 {
    public static void main(String[] args) {
        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D, or F) based on the following
        // grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59


        // 1. Input from user
        // Score/Marks obtained (Data type) -> int  -> Grade ( char or String)
        // DAA- Ask for the confirmation of the doubts


        // 2. Basic logic or Brute force Logic
        // write basic rough code
        // 3. Write the real code

        //Taking the inputs from the keyboard/user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks obtained : ");
        int Marks = sc.nextInt();


        if (Marks >= 90 && Marks <=100)
        {
            System.out.println("Your grade is A");
        }
          else if (Marks >= 80 && Marks <=89)
        {
            System.out.println("Your grade is B");
        }
        else if (Marks >= 70 && Marks <=79)
        {
            System.out.println("Your grade is C");
        }
        else if (Marks >= 60 && Marks <=69)
        {
            System.out.println("Your grade is D");
        }
        else if (Marks >= 0 && Marks <=59)
        {
            System.out.println("Your grade is F");
        }


    }

}






































        // 4. Debug the code
        // We are debug and checking the code. ->
        // Other than int -> code fails - we will fix
        // Exceptions - in future.
        // tHIS PROGRAM DOES not run again and again.






























