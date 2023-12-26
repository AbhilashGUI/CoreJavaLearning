package CentricToAll2;

public class Lab010
{
    public static void main(String[] args)
    {
        // 14 represents minor, no right to vote
        int age=14;
        age=21;
        //21 represents major, right to vote
        //System.out.print("I am Eligible to caste my vote, since my age is  " + age);

        //We are using printf statement, here we are not concatenating just adding %d in the end. So that the value get assigned to %d and prints as output.

        System.out.printf("I am Eligible to caste my vote, since my age is %d", age);
    }
}
