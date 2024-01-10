package CentricToAll8;

public class Lab142
{
    public static void main(String[] args)
    {
        //The direction or path that is taken while a program is being executed
        //Threads allows a program to operate more efficiently by doing multiple things at the same time.
        //Threads can be used to perform complicated tasks in the background without interrupting the main program.



        //Lets understand the difference between StringBuffer and StringBuilder
        //StringBuffer: Is a thread safety. It is only recommended as safer to use in multi-threaded environments
        //StringBuilder: Is not a thread safety. It is faster and more efficient in single threaded environments

        StringBuilder sb=new StringBuilder("Abhilash");
        sb.reverse();
        System.out.println(sb);


       StringBuffer sbf=new StringBuffer("Anatomy");
       sbf.reverse();
       System.out.println(sbf);








    }




}
