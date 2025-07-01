package CentricToAll10.OOPS.Inheritance.Multilevel;

public class Lab153
{
    public static void main(String[] args)
    {

        //RUNNER OF GRANDFATHERCLASS//

     GrandFather gf=new GrandFather();
        gf.properties();           //Grandfather is holding 4 properties


        Father f=new Father();
        f.properties();             //Father is holding 3 properties


        Grandson gs=new Grandson();
        gs.properties();       //Grandson is holding only 2 property


        //Multi-level inheritance concept like 1st gen,2nd gen, 3rd gen

        GrandFather g1=new Grandson();
        g1.properties();

        Father f1=new Grandson();
        f1.properties();

        Grandson gs1=new Grandson();
        gs1.properties();




        //Grandson gs1= new GrandFather();  //Parent object cannot be allowed to child reference object
        //gs1.properties();
        //Grandson gs2= new Father();       //Same logic
        //gs2.properties();




         //Note: However Grandson is the legal heir of  GrandFather and Father properties

        //Note: Father is legal heir of GrandFather property









































}
}