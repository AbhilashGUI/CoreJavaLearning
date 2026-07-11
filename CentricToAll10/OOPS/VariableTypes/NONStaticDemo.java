package CentricToAll10.OOPS.VariableTypes;

public class NONStaticDemo
{

    public String fruit="Banana";

    public int dozen=12;

    public void printfruit()
    {
       System.out.println("Regular available fruit is :"+fruit);


    }

    public void printdozen()
    {
        //System.out.println("Which is sold in dozen count :"+dozen);
    }


    public static void main(String[] args)
    {

        NONStaticDemo nonStaticDemo= new NONStaticDemo();
        nonStaticDemo.printfruit();
        nonStaticDemo.printdozen();
        nonStaticDemo.dozen=24;
        nonStaticDemo.fruit="Most of the fruits are available across the seasons";
        nonStaticDemo.printfruit();
        nonStaticDemo.printdozen();
    }
}
