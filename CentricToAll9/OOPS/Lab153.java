package CentricToAll9.OOPS;

public class Lab153
{
    public static void main(String[] args)
    {

        //RUNNER OF GRANDFATHERCLASS//

     /*GrandFather gf=new GrandFather();
        gf.properties();           //Grandfather is holding 6 properties


        Father f=new Father();
        f.properties();             //Father is holding 3 properties


        Grandson gs=new Grandson();
        gs.properties();   */       //Grandson is holding only 1 property


        //Multi-level inheritance concept like 1st gen,2nd gen, 3rd gen

        GrandFather g=new Grandson();
        g.properties();

        Father f=new Grandson();
        f.properties();

        Grandson gs=new Grandson();
        gs.properties();




        //Grandson gs1= new GrandFather();  //Parent object cannot be allowed to child reference object
        //gs1.properties();
        //Grandson gs2= new Father();       //Same logic
        //gs2.properties();




         //Note: However Grandson is the legal heir of  GrandFather and Father properties

        //Note: Father is legal heir of GrandFather property









































}
}