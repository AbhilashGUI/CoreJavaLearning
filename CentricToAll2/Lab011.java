package CentricToAll2;

public class Lab011
{
    public static void main(String[] args)
    {
        int i=10;
        int num=20;
        System.out.printf("%d*1=%d*2=%d*3",i,num,30);
        //values get assigned to %d at every instance in the above print statement.
        //printf stands for formatting
        System.out.println();
        //Usage of strings
        //String is bunch of characters
        String name="Abhilash";
        name="Vicky";
        //Concatenating
        System.out.println("My pet name is " + name);
        //For printing string using printf statement we are adding %s instead of %d
        System.out.printf("My pet name is %s",name);
        System.out.println();

        //Printing datatype variables using printf statement


        float pie=3.14f;
        System.out.println("Value of pie " + pie);
        pie=15.70f;
        //Note: While using printf statement here we are concatenating, just adding %f(FLOAT) in the end.
        // So that the value get assigned to %f and prints  output.
        System.out.printf("Value of pie --->%f",pie);

    }


}
