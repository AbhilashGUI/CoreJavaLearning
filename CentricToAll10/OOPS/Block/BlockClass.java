package CentricToAll10.OOPS.Block;

public class BlockClass {

     //IIB : Instance initialization block
{

    System.out.println("IIB");
}
    BlockClass() //Default constructor
    {
        System.out.println("DC");
    }
    //SIB: Static initialization block
    static {

        System.out.println("SIB");
    }


}
