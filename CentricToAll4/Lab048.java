package CentricToAll4;
import java.util.Scanner;
public class Lab048 {
    public static void main(String[] args) {
        //Capital of the state

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Capital city, will reveal the respective state : ");
        String capital = sc.nextLine();

        switch (capital) {
            case "Hyderabad":
                System.out.println("Is the capital of Telangana");
                break;
            case "Amaravathi":
                System.out.println("Is the capital of AndhraPradesh");
                break;
            case "Banglore":
                System.out.println("Is the capital of Karnataka");
                break;
            case "Thiruvananthapuram":
                System.out.println("Is the capital of Kerala");
                break;
            case "Chennai":
                System.out.println("Is the capital of TamilNadu");
                break;                                      // First five belongs to southern part of india
            case "Lucknow":
                System.out.println("Is the capital of UttarPPradesh");
                break;
            case "Dehradun":
                System.out.println("Is the capital of Uttarakhand");
                break;
            case "Leh&Kargil":
                System.out.println("Is the capital of Ladakh(UT)");
                break;
            case "Shimla&Dharmshala":
                System.out.println("Is the capital of HimachalPradesh");
                break;
            case "Chandigarh(UT)":
                System.out.println("Is the capital of Punjab");
                break;
            case "Chandigarh(UT1)":
                System.out.println("Is the capital of Haryana");
                break;
            case "NewDelhi":
                System.out.println("Is the capital of Delhi(UT)");
                break;
            case "Chandigarh":
                System.out.println("Is the capital of Chandigarh(UT)");
                break;
            case "Srinagar&Jammu":
                System.out.println("Is the capital of Jammu&Kashmir(UT)");
                break;                         // Second nine belongs to Northern part of india
            case "Jaipur":
                System.out.println("Is the capital of Rajasthan");
                break;
            case "Mumbai":
                System.out.println("Is the capital of Maharashtra");
                break;
            case "Gandhinagar":
                System.out.println("Is the capital of Gujarat");
                break;
            case "Daman":
                System.out.println("Is the capital of Dadra&NagarHaveli&Dama&Diu(UT)");
                break;                           // Third 4 belongs to western part of india
            case "Bhubaneswar":
                System.out.println("Is the capital of Odisha");
                break;
            case "Patna":
                System.out.println("Is the capital of Bihar");
                break;
            case "Kolkata":
                System.out.println("Is the capital of WestBengal");
                break;
            case "Ranchi":
                System.out.println("Is the capital of Jharkhand");
                break;                           // Fourth 4 belongs to eastern part of india
            case "Bhopal":
                System.out.println("Is the capital of Madhyaradesh");
                break;
            case "Raipur":
                System.out.println("Is the capital of Chhattisgarh");
                break;                          // Fifth 2 belongs to Central part of india
            case "Itanagar":
                System.out.println("Is the capital of ArunachalPradesh");
                break;
            case "Dispur":
                System.out.println("Is the capital of Assam");
                break;
            case "Shillong":
                System.out.println("Is the capital of Meghalaya");
                break;
            case "Imphal":
                System.out.println("Is the capital of Manipur");
                break;
            case "Aizawl":
                System.out.println("Is the capital of Mizoram");
                break;
            case "Kohima":
                System.out.println("Is the capital of Nagaland");
                break;
            case "Agartala":
                System.out.println("Is the capital of Tripura");
                break;
            case "Gangtok":
                System.out.println("Is the capital of Sikkim");
                break;    //Sixth 8 belongs to northeastern part of india
            case "Panaji":
                System.out.println("Is the capital of Goa");
                break;  //Seventh 1 belongs to southwestern part of india
            case "Portblair":
                System.out.println("Is the capital of Andaman and nicobar Island");
                break;
            case "Pondicherry":
                System.out.println("Is the capital of Puducherry(UT)");
                break;
            case "Kavarathi":
                System.out.println("Is the capital of Lakshadweep(UT)");
                break;
            default:
                System.out.println("Not a part of india");
        }

    }
}




























