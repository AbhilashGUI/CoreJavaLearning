package CentricToAll12.CollectionFramework.List;

import java.util.Stack;

public class Lab208
{
    public static void main(String[] args)
    {
        //Note: Stack follows the LIFO approach lastinfirstout.

        Stack stack=new Stack();
        stack.push("A");    //Push() function is used to add the items
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack);
        stack.pop();              //pop() function is used to remove the items
        System.out.println(stack);
            //peek() function is used to display the top element without deleting it.
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.push("E");
        System.out.println(stack);



    }
}
