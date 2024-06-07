package CentricToAll2;

public class Lab010
{
    public static void main(String[] args)
    {

        //Eligible for voting 18+
        int age=14; //14 represents minor, no right to vote
        age=21;
        //21 represents major, right to vote
        System.out.println("I am Eligible to caste my vote, since my age is  " + age);

        //We are using printf statement, for concatenating just adding %d in the end.
        // So that the value get assigned to %d and prints  output.

        System.out.printf("I am Eligible to caste my vote, since my age is %d", age);
    }
}
