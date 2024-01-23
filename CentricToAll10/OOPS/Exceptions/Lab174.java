package CentricToAll10.OOPS.Exceptions;

public class Lab174
{
    public static void main(String[]args)
    {
     String str=args[0];   //Passing the CLA from IDE and running the code.Which results the expected output

     //Note: When we are passing no element in an CLA array it throws >>ArrayIndexOutOfBoundsException
     //Note: When we are passing string element(Name) and converting then to Int in CLA, it throws >>NumberFormatException
     //Note: When we are passing 0 in CLA ,it throws >>Arithmetic exception
        int x=Integer.parseInt(str);
        int a=10/x;

     System.out.println(x);
     System.out.println(a);








    }
}

//Note: Understanding the flow of the program
/* JvM will be initialized
Creates and starts the main thread(Main method)
Note:Main thread will do the following tasks
1.Collects the command line argument
2.Creates the String array with CLA
3.Now control will be transferred from Main thread to main method


Issue:Control will comeback to main method, in 2 ways
1.When problem comes in main--JVM
2.Creates the object of Identified exception class(Exceptions)
like>> Exception a= new Exception()

 */