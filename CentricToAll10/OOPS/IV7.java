package CentricToAll10.OOPS;

public class IV7
{





}

abstract  class Grandfather{

    abstract void v1();  //Incomplete function will always have abstract keyword
    abstract void v2();

    void GEP()
    {
        System.out.println("Earned single property");
    }

abstract class Father extends Grandfather {

    abstract void v3();  //incomplete function

    abstract void v4();


}
 class Son extends Father{


     @Override
     void v1() {

     }

     @Override
     void v2() {

     }

     @Override
     void v3() {

     }

     @Override
     void v4() {

     }
 }






}




