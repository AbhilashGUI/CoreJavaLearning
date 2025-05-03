package AssignmentPrograms;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse the String
        String name = "Abhilash";
        char[] charaarray = name.toCharArray();  //Converting the string to character array using a method
        System.out.println(charaarray.length);   //Length of the String and characters are 8

        int left = 0; //Since index starts from 0 to 7
        int right = charaarray.length - 1; //Length=Index-1


        while (left < right) {  //Left characters count as an index 0 to 7 where as length of it is 8
            char temp = charaarray[left];
            charaarray[left] = charaarray[right];
            charaarray[right] = temp;

            left++;
            right--;
        }
            String reverse_number=new String(charaarray);
            System.out.println(reverse_number);

        }
    }
