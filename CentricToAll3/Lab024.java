package CentricToAll3;

public class Lab024
{
    public static void main(String[] args)
    {
        //Relational operator using char

        System.out.println('A'==65);
        System.out.println('z'==122);
        System.out.println('0'!=50);
        System.out.println('#'==35);

        //If assigning byte value as char

        //Note: Relational operator compare the references
        byte b=65;
        System.out.println('A'==b);
        byte b1=122;
        System.out.println('z'==b1);

        System.out.println('A'==65.0); //This is a property of java
        System.out.println('z'==122.0f);

        System.out.println('A'==65.02);
        boolean Gender_Male=true;   //
        boolean Gender_Female=false;
        System.out.println(Gender_Male!=Gender_Female);



    }
}
