package CentricToAll10.OOPS.VariableTypes;

public class NSDRC {

    public static void main(String[] args)
    {
        NONStaticDemo nsd= new NONStaticDemo();
        nsd.printfruit();
        nsd.printdozen();

        //Since they are non static , we can able to manipulate variables
        nsd.fruit="Ice Apple";
        nsd.dozen= 12+2;


        nsd.printfruit();
        nsd.printdozen();



    }
}
