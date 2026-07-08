package CentricToAll8;

public class Lab136 {
    public static void main(String[] args) {

        //Note: Strings are immutable in nature. Refer the below code, to get understanding.

        String Name="Abhilash"; //Since the strings are immutable in nature.
        // Initial string will be created and saved permanently in the SCP
        String Name2=new String("Vemula"); //It creates a new string in a heap area
        System.out.println(Name);
        System.out.println(Name2);

        //Concatenation
        String str1="Vemula";  //It remains unchanged
        String str2= str1.concat(" Abhilash");  // It creates a new string after concatenation
        String str3=" Sharma";
        String str4=str2.concat(str3);


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);



        //NOTE: IPV
        String str5="Hello ";  //Firstly we have assigned string, which will be permanently created in scp
        str5=str5.concat("Abhilash");//Then re-assigning the string with a concatenation,now the string 4 is combination word.
        System.out.println(str5);
        String str6="Hello";       //However string6 and string7 are referring to the string5 which is created in scp, whose values were similar.
        String str7="Hello";

        String str8="Hello";
        str7.concat("Vemula");  //Since it is newly created method, which is not re-assigned yet, it will be created in  a heap area
        System.out.println(str8);
        System.out.println(str7);
        System.out.println(str6);
        String str9=str7.concat(" Vemula");
        System.out.println(str9);















    }
}
