package CentricToAll8;

public class Lab136
{
    public static void main(String[] args)
    {

        //Note: Strings are immutable in nature. Refer the below code, to get understanding on it.

        String name="Vemula Abhilash";  //Since the strings are immutable in nature. The initial string will be created and saved permanently in the SCP
        String name2= new String ("Vemula Abhilash");  //It creates in a heap area.

        name="Sharma";
        System.out.println(name);
        System.out.println(name2);

        //Concatenation

      /*String str1="Vemula";
       String str2=str1.concat(" Abhilash");
       String str3="Sharma";
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str3);*/

       //NOTE: IPV
        /*String str1="Hello ";  //Firstly we have assigned string, which will be permanently created in scp
        str1=str1.concat("Abhilash");//Then re-assigning the string with a concatenation, now the string 1 is combination word.
        System.out.println(str1);
        String str2="Hello";       //However string2 and string3 are referring to the string which is created in scp, since the values are similar.
        String str3="Hello";*/

        String str1="Hello";
        str1.concat("Vemula");  //Since it is newly created method, which is not re-assigned yet, it will be created in  a heap area
        System.out.println(str1);   //Output will be Hello.







    }




}
