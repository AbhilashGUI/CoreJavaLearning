package CentricToAll10.OOPS.Block;

import CentricToAll10.OOPS.Block.BlockClass;

public class Lab158 {
    public static void main(String[] args) {
        //RUNNER OF BLOCKCLASS//

        //Note: If we don't create an object,no block will be executed and no default constructor will be called.
        BlockClass blockClass = new BlockClass();

        new BlockClass();
        new BlockClass();

        BlockClass bc= new BlockClass();
        BlockClass b1=null;   //Since, we have declared null no object will be created against it.

        new BlockClass();
        BlockClass b2=new BlockClass();
        //Note: Though we are invoking n number of objects.Static initialization block will be called first

    }


}



