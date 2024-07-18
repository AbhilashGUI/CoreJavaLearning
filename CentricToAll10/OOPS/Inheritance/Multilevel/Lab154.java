package CentricToAll10.OOPS.Inheritance.Multilevel;

public class Lab154
{
    public static void main(String[] args)
    {

        //RUNNER OF FOUNDERCLASS//



        Founder f= new Founder();
        f.built();   //Established business

        Runner r=new Runner();
        r.built();    // Ran business

        Gamechanger g=new Gamechanger();
        g.built();    //Tech implementation




        Founder f1=new Gamechanger();
        f1.built();    //Founder is happy with a Gamechanger

        Runner r1= new Gamechanger();
        r1.built();   //Runner is too happy to continuing the legacy of his father by his son


        Gamechanger g1=new Gamechanger();
        g1.built();   //Gamechanger is thankful to the founder and runner for establishment of the business


    }
}
