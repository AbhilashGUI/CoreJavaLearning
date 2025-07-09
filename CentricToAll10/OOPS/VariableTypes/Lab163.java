package CentricToAll10.OOPS.VariableTypes;

public class Lab163
{
 public static void main(String[] args)
 {
     System.out.println(StaticDemo.Institute_name);
     StaticDemo.printname();


     //Calling the variables of non-static method

     StaticDemo s1= new StaticDemo();
     s1.printyear();//It prints default  enrolledyear with college name
     s1.enrolledyear=2025;  //Re-enrolled
     s1.printyear();
     //It prints new enrolled year with college name



     StaticDemo s2=new StaticDemo();
     s2.printyear();
     s2.printcompletionyear();

     //It prints default enrolledyear,with college name and completionyear









 }






}
