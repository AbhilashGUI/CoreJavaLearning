package CentricToAll10.OOPS;

public class IV1
{
 public static void main(String[] args)
 {

      person p= new person();
      person p1=new person(10);
      person p2=new person(15,true);
      System.out.println(p.a);
      System.out.println(p1.a);
      System.out.println(p2.a);
      System.out.println(p2.b);


 }
}

class person{
    int a;
    boolean b;

    //Default constructor
    person()
    {
        this.a=10;
    }

    //Parameterized constructor

    person(int b)
    {
        this.a=b;
    }

    //Parameterized constructor
    person(int b,boolean a)
    {
        this.a=b;
        this.b=a;
    }


}
