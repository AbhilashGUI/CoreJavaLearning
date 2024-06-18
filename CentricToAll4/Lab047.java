package CentricToAll4;
import java.util.Scanner;
public class Lab047 {
    public static void main(String[] args) {
        //Which browser code to be executed

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the browser : ");
        String browser = sc.nextLine();

        switch (browser) {
            case "Chrome":
                System.out.println("Execute the chrome code");
                break;
            case "Firefox":
                System.out.println("Execute the firefox code");
                break;
            case "Edge":
                System.out.println("Execute the edge code");
                break;
            case "Opera":
                System.out.println("Execute the opera code");
                break;
            case "Safari":
                System.out.println("Execute the safari code");
            default:
                System.out.println("Out of web");
        }

    }
}








