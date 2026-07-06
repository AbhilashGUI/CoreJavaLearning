package CentricToAll4;
import java.util.Scanner;
public class Lab047 {
    public static void main(String[] args) {
        //Which browser code to be executed

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the browser, I will let you know the code is executed or not ");
        String browser=sc.nextLine();

        switch (browser)
        {
            case "Chrome":
                System.out.println("Yeah, it is compatible");
                break;
            case "Edge":
                System.out.println("Yeah, it is compatible");
                break;
            case "Firefox":
                System.out.println("Yeah, it is compatible");
                break;
            case "Safari":
                System.out.println("Yeah, it is compatible");
                break;
            default:
                System.out.println("Out of web");

        }
        System.out.println("End of  program");
    }
}







