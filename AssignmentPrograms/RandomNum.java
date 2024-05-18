package AssignmentPrograms;

public class RandomNum
{
    public static void main(String[] args)
    {
        //In Java programming, we often required to generate random numbers while we develop applications.
        // Many applications have the feature to generate numbers randomly, such as to verify the user many applications use the OTP.
        // The best example of random numbers is dice. Because when we throw it, we get a random number between 1 to 6.


       int min=200;
       int max=400;

        System.out.println("Generate the random number of double type :"+ min + " to " + max );
        double d=Math.random()*(max-min+1)+min;
        System.out.println(d);
        System.out.println("Generate the random number of int type : "+ min + " to " + max );
        int i=(int) (Math.random()*(max-min+1)+min);
        System.out.println(i);



       }



    }

