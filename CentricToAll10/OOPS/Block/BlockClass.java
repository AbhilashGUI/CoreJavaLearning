package CentricToAll10.OOPS.Block;

public class BlockClass {

    //Though if you define the static initialization block in the beginning/end SIB will be invoked first
    static
    {
        System.out.println("SIB");
    }
     //IIB : Instance initialization block
{

    System.out.println("IIB");
}
    BlockClass() //Default constructor
    {
        System.out.println("DC");
    }
    //SIB: Static initialization block
    /***static {

        System.out.println("SIB");
    }***/


}
