package CentricToAll10.OOPS.Wrapperclasses;

public class Lab171
{
    public static void main(String[] args)
    {

        int i=258;
        //String number=258;              Not possible to assign integer to string
        //String number=String(i)         Not possible to downcast integer to string

        String number= i + " is my luckynumber";           //Concatenation is possible
        System.out.println(number);

       String number2= String.valueOf(i);         //Using  inbuilt function is possible
       System.out.println(number2);
    }
}
