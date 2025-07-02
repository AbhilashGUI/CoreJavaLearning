package CentricToAll10.OOPS.Inheritance.Hierarchial;

public class Python extends PROGRAMMINGLANG
{

   String feature1;
   String feature2;


    Python(String feature1,String feature2)
    {
        this.feature1=feature1;
        this.feature2=feature2;
    }

   void printdetails()
   {
       System.out.println("Syntax -> "+this.feature1 );
       System.out.println("Performance -> " +this.feature2);
   }


    }







