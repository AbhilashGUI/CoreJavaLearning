package AssignmentPrograms;

public class ReversingString {

    public static void main(String[] args)
    {

        String name="Vemula";
        char[] chararray=name.toCharArray();
        System.out.println(chararray.length-1);

        int left=0;
        int right=chararray.length-1;

        while (left<right) {
            char temp = chararray[left];
            chararray[left] = chararray[right];
            chararray[right] = temp;

            left++;
            right--;
        }

        String reversenum=new String(chararray);
        System.out.println(reversenum);




    }
}
