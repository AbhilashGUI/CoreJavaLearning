package CentricToAll10.OOPS.Abstraction.Interface.RealtimeExample;

public class Requiredtoknow
{

    public static void main(String args[])
    {



    }
}
interface I1{}       //Incomplete interface class is Allowed
interface I2{}       //Incomplete interface class is Allowed

class A{}          //Incomplete class is Allowed
class B{}           //Incomplete class is Allowed
abstract class C{}     //Incomplete abstract class is Allowed
abstract class D{}     //Incomplete abstract class is Allowed

class Test1 extends A{ }      //Allowed
//class Test2 extends A,B{ }  //Multiple classes not Allowed
class Test3 implements I1{ }  //Allowed one interface
class Test4 implements I1,I2{ } //Allowed implementing 2 interfaces
class Test5 extends A implements I1,I2{ }  //Allowed extending from one class and implementing 2 interfaces
//class Test6 implements I1 extends A{ }   //Not Allowed, implements should be the last ome

//interface I3 extends A{}   //interface cannot extend class
//interface I4 implements A{} //interface cannot implement class
//interface I5 extends A,B{}
interface I6 extends I1,I2{ }  //Interface can extends another interfaces

