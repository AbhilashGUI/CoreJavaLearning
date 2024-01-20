package CentricToAll10.OOPS.VariableTypes;

public class Lab163
{
 public static void main(String[] args)
 {
     //System.out.println(StaticDemo.college_name);
     //StaticDemo.printName();


     //Calling the variables of non-static method

     StaticDemo s1= new StaticDemo();
     //s1.version=2;      //It prints the declared version with a  college name
     s1.printVersion();   //It prints default version with college name


     StaticDemo s2=new StaticDemo();
     //s2.version=4;         //It prints the declared version with a  college name
     s2.printVersion();      //It prints default version with college name


       StaticDemo.college_name="TTA";
       StaticDemo.printName();






 }






}
