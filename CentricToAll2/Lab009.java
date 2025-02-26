package CentricToAll2;

public class Lab009
{
    public static void main(String[] args)
    {
        //Using multiple data type variables in the below code to understand the difference

        //Ensure to use single quotation marks, when assigning value for char variable
        char c=97;
        System.out.println('A'+c);  //appending characters
        //Ensure for Integers no quotations are used
        byte b=10;
        b=117+10;  //appending b value
        System.out.println(b);
        short s=15896;
        System.out.println(s+562);  //appending value
        int d=452856321;
        System.out.println(d);

        //Ensure to use l at the end of the longdatatype variable value
        long mobilenumber=8977507845l;
        mobilenumber=7095363018l;  //Replaced
        System.out.println(mobilenumber);

        //Ensure to use f at the end of the floatdatatype variable value
        float taxexemption=464644.25f;
        taxexemption=555564654.f;
        System.out.println(taxexemption);

        double contribution=215665.45;
        contribution=564654564.166d+6.451d;
        System.out.println(contribution);





    }
}
