package AssignmentPrograms;

public class ReverseString {

    public static void main(String[] args)
    {

        String name="Abhilash";
        char[] charArray=name.toCharArray();  //Converting the string to character array using a method
        System.out.println(charArray.length);  //Length of the String

        int left=0;  //Since index starts from 0 to 7
        int right=charArray.length-1; //Length=Index-1

        while (left<right) //Left characters count as an index 0 to 7 whereas length of it is 8
        {
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;

            left++;
            right--;
        }

        String reversedstring=new String(charArray);
        System.out.println(reversedstring);


    }
}