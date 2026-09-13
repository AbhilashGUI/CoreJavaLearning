package AssignmentPrograms;

public class ReverseString2 {

    public static void main(String[] args)
    {

        String name="This is most frequently asked question";
        char[] charArray=name.toCharArray();
        System.out.println(charArray.length);

        int left=0;
        int right=charArray.length-1;

        while (left<right)
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