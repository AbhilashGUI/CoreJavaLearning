package CentricToAll4;
import java.util.Scanner;
public class Lab049 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char/string, will let you know which type it is");
        char user_input = sc.next().toCharArray()[0];
        //Is used to convert the String to charArray

        switch (user_input) {
            case 'a':
                System.out.println("Entered char is a vowel");
                break;
            case 'e':
                System.out.println("Entered char is a vowel");
                break;
            case 'i':
                System.out.println("Entered char is a vowel");
                break;
            case 'o':
                System.out.println("Entered char is a vowel");
                break;
            case 'u':
                System.out.println("Entered char is a vowel");
                break;
            default:
                System.out.println("Entered char is a consonant");

        }
    }


}

