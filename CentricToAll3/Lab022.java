package CentricToAll3;

public class Lab022
{
    public static void main(String[] args)
    {
        //String Concatenation :Read from left to right
        //below are some of the examples
         int i=54;
         int j=66;
         System.out.println(i+j);

         //Concatenate String and integer
        String name="Abhilash";
        System.out.println(name+i);
        System.out.println(i+name);
        name="Vishnu";  //Replacing
        System.out.println(name+i+j);  //Int will concatenate


        //Concatenate String and integers
        String name1="Vicky";
        String name2="Micky";
        int k= Integer.parseInt("74");
        System.out.println(name1+i+j+k); //In this case integers are getting concatenate
        System.out.println(i+j+k+name1); //In this case integers are added
        System.out.println(name1+i+name2+j);
        System.out.println(name1+name2+i+j);//In this case int are getting concatenate
        System.out.println(name1+name2+(i+j));//BODMAS rule: In this case integers are added





    }

}
