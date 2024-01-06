package AssignmentPrograms;

public class Program14
{
    public static void main(String[] args)
    {

        //Reverse the String
        String name="Abhilash";  //Name
        char[] chararray=name.toCharArray();  //Converting the string to character array using a method
        System.out.println(chararray.length);  //Length of the String and characters are 8

        int left=0;  //Since index starts from 0 to 7 (Abhilash)
        int right= chararray.length-1;  //Length=Index-1

        while(left<right)    //Left characters count as an index 0 to 7 where as length of it is 8
        {
            char temp = chararray[left];
            chararray[left] = chararray[right];
            chararray[right] = temp;

            left++;
            right--;

        }
        String Reverse_number=new String(chararray);
        System.out.println(Reverse_number);

        }



    }

