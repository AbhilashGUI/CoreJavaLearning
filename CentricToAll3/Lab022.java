package CentricToAll3;

public class Lab022 {


     public static void main(String[] args)
     {

         int i=16;
         int j=27;
         System.out.println(i+j);

         //String Concatenation :Reads from left to right
         //below are some of the examples

         //Concatenate String and integer
         String name="Abhilash";
         System.out.println(name+i);
         System.out.println(i+name);
         name="karthik";
         System.out.println(name+i+j);
         System.out.println(i+j+name);  //clear


         //More examples
         String name1="Micky";
         String name2="Mouse";
         int k= Integer.parseInt("34");
         System.out.println(name1+name2+k);
         System.out.println(k+name1+name2);
         System.out.println(i+j+k+name1+name2);
         System.out.println(name1+name2+i+j+k);
         System.out.println(name1+i+name2+j);
         System.out.println(i+name1+j+name2+k);
         System.out.println(name1+name2+(i+j+k));//BODMAS rule: In this case integers are added









     }
}

