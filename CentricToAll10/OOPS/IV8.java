package CentricToAll10.OOPS;

public class IV8 {
    public static void main(String[] args) {


        parent p = new parent();   //Parent reference with parent objects
        child c = new child();     //Child reference with child objects
        parent p1 = new child();  //Parent reference with child objects
        p1 = c;   //Parent reference with child reference
        //child c = new parent();   //Not Allowed

        Father F1= new Son();      //Upcasting concept
        Father F2=new Son();      //Upcasting concept
        Son s= (Son)F1;     //Downcasting concept > Assigning the Fatherreference with Son object to son
        Son s1= (Son)F2;    //Downcasting concept > Assigning the Fatherreference with Son object to son



    }
}



class Father{}
class Son extends Father{}


class parent{ }
class child extends parent{}           //Allowed child class can extend parent class
