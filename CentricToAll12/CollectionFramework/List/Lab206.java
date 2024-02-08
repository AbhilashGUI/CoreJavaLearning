package CentricToAll12.CollectionFramework.List;

import java.util.List;

public class Lab206
{
    public static void main(String[] args)
    {

      List mylist= null;
      mylist.add(mylist);
      System.out.println(mylist);   //Hence, it throws nullpointexception error.

      //Note: Null can't have any values. Null cannot be added




    }
}
