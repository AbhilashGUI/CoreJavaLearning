package CentricToAll4;
import java.util.Scanner;
public class Lab041 {
    public static void main(String[] args) {
        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade for a given
        // numerical score (e.g., A, B, C, D,E, F) based on the following
        // grading scale:

        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //E: 35-59
        //F: 0-34


        // 1. Input from user
        // Score/Marks obtained (Data type) -> int  -> Grade ( char or String)
        // DAA- Ask for the confirmation of the doubts


        // 2. Basic logic or Brute force Logic
        // write basic rough code
        // 3. Write the real code

        //Taking the inputs from the keyboard/user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks secured :");
        int marks= sc.nextInt();

        if(marks>90 && marks<100)
        {
            System.out.println("Grade A :"+ marks);
        }
        else if (marks>80 && marks<89)
        {
            System.out.println("Grade B :"+marks);
        }
        else if (marks>70 && marks<79)
        {
            System.out.println("Grade C :"+ marks);
        }
        else if (marks>60 && marks<69)
        {
            System.out.println("Grade D :"+marks);
        }
        else if (marks>35 && marks<59)
        {
            System.out.println("Grade E :" +marks);
        }
        else
        {
            System.out.println("Failed :"+marks);
        }
    }

}






































        // 4. Debug the code
        // We are debug and checking the code. ->
        // Other than int -> code fails - we will fix
        // Exceptions - in future.
        // tHIS PROGRAM DOES not run again and again.






























