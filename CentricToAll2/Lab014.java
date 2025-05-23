package CentricToAll2;

public class Lab014 {
    public static void main(String[] args) {
        //ASCII values
        //A-Z---->65-90
        //a-z---->97-122
        //0-9---->48-57
        //Special characters--->34--47

        char a = 65;
        System.out.println(a);  //It prints the character value against the declared code


        //Note that a single character like letter cannot be declared as string
        //char a1="B";
        //System.out.println(a1);

        String a2="1";  //It comes under Non-primitive data type
        System.out.println(a2);

        char b = '\n';    //To provide a space b/w first and second characters
        System.out.println(b);

        char c = 54;
        System.out.println(c);

       //Note: Emoticon is the keyword to search for unicodes

        char c2 = '\u1F60';     // Emoji's like smiles and sad -> :) :(  -> they created with unicode characters
        System.out.println(c2);

        char c3='\u1F61';
        System.out.println(c3);


        char c4='\u0021';//Basic latin-->special characters also be created with unicode characters
        System.out.println(c4);

        char c5='\u0024';
        System.out.println(c5);




    }
}

