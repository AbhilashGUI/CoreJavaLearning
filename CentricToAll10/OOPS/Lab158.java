package CentricToAll10.OOPS;

public class Lab158
{
    public static void main(String[] args)
    {
        //RUNNER OF BLOCKCLASS//

        //Note: If we don't create an object,no block will be executed and no default constructor will be called.
       //BlockClass blockClass=new BlockClass();

        /*new BlockClass();
        new BlockClass();
        BlockClass b=new BlockClass();
        BlockClass b1=null;*/   //Since, we have declared null no object will be created against it.

        new BlockClass();
        BlockClass b=new BlockClass(); //Note: Though we are invoking two objects.Static initialization block called only once.

    }


}
