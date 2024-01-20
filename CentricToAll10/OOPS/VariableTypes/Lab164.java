package CentricToAll10.OOPS.VariableTypes;

public class Lab164
{
public static void main(String[] args)
{
     C1 c1=new C1();    //
     C1 c2=new C1();



    c1.m1();   //Printing the non-static variables
    C1.m2();   //Calling the variables declared in static method in the class


    C1 c3=null;    //No object is created
   // c3.m1();      //When we invoking the null object reference with non-static function. It will throw an "nullpointerexception"
    c3.m2();       //When we are invoking the null object reference with static function. It will return variables declared the static function


}


}

class C1{

    static {
        System.out.println("SIB");   //It works on number of  classes
    }
    {
        //Instance
        System.out.println("IIB");  //It works  on number of objects declared in main method

    }

    int a=10;  //non=static
   static int b =10;

   void m1()
   {
       System.out.println("m1");
       System.out.println(a);   //instance variable
       System.out.println(b);   //Static variable
   }

  static void m2(){
       //Static functions are loaded, when classed are loaded

    //System.out.println(a);   //Instance variable, cannot be assign to static function
    System.out.println(b);

  }


    }

