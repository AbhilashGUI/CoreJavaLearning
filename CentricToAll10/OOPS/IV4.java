package CentricToAll10.OOPS;

public class IV4
{
    public static void main(String[] args)
    {

         //System.out.println(disciple.a);  //Cannot print the instance variable without creating an objects
         //System.out.println(disciple.follower);  //Cannot print the function without creating an objects

        System.out.println(disciple.b);  //Static instance variable can be invoked without creating an objects
        disciple.follower();            //Static function can be invoked without creating an objects


    }

}

class disciple{
    int a;    //Instance variable

    static int b;  //Static variable

    /*void follower()   //function
    {
        System.out.println("Disciple=Discipline");
    }*/

    static  void follower()   //static function
    {
        System.out.println("Disciple=Discipline");
    }
}
