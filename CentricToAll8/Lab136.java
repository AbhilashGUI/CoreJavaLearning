package CentricToAll8;

public class Lab136
{
    public static void main(String[] args)
    {

        //Note: Strings are immutable in nature. Refer the below code, to get understanding.

        String name="Vemula Abhilash";  //Since the strings are immutable in nature.
        // Initial string will be created and saved permanently in the SCP
        String name2= new String ("Vemula Abhilash");  //It creates a new string in a heap area.

        name="Sharma";
        System.out.println(name);
        System.out.println(name2);

        //Concatenation

       String str1="Vemula";
       String str2=str1.concat(" Abhilash");
       String str3="Sharma";
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str3);

       //NOTE: IPV
        String str4="Hello ";  //Firstly we have assigned string, which will be permanently created in scp
        str4=str4.concat("Abhilash");//Then re-assigning the string with a concatenation,now the string 4 is combination word.
        System.out.println(str4);
        String str5="Hello";       //However string5 and string6 are referring to the string4 which is created in scp, whose values were similar.
        String str6="Hello";

        String str7="Hello";
        str7.concat("Vemula");  //Since it is newly created method, which is not re-assigned yet, it will be created in  a heap area
        System.out.println(str7);   //Output will be Hello.



    }

}
