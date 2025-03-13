package CentricToAll4;
import java.util.Scanner;
public class Lab049
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the char, will help you with output:");
        char user_input=sc.next().toCharArray()[0]; //Is used to convert string to CharArray

        switch (user_input) {
            case 'a':
                System.out.println("Entered char/letter is a vowel");
                break;
            case 'e':
                System.out.println("Entered char/letter is a vowel");
                break;
            case 'i':
                System.out.println("Entered char/letter is a vowel");
                break;
            case 'o':
                System.out.println("Entered char/letter is a vowel");
                break;
            case 'u':
                System.out.println("Entered char/letter is a vowel");
                break;
            default:
                System.out.println("Entered char/letter is a consonant");
        }


    }
}
