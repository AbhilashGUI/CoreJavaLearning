package CentricToAll4;
import java.util.Scanner;
public class Lab053
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the branch code: ");
        int branchcode=sc.nextInt();

        switch (branchcode)
        {
            //Note:We are not using break statement,hence it is an enhancement which works as break
            // just by adding arrow symbol before the print statement. This is allowed from jdk 13
            case 01 ->System.out.println("Belongs to ECE branch");
            case 02 ->System.out.println("Belongs to EEE branch");
            case 03 ->System.out.println("Belongs to CSE branch");
            case 04 ->System.out.println("Belongs to IT branch");
            case 05 ->System.out.println("Belongs to MECH branch");
            case 06 ->System.out.println("Belongs to CIV branch");
            default -> System.out.println("It doesn't exist");
        }
    }
}
