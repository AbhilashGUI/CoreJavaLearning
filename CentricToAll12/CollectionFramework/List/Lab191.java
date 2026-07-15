package CentricToAll12.CollectionFramework.List;

import java.util.List;

public class Lab191 {
    public static void main(String[] args) {

        //Collection framework:Focuses on main business logic
        //List: Contains the collection of elements and index based methods to insert,update delete and search.
        //It can have duplicate elements too.

        //Note:List allows duplicate elements

       List Fruitnames=List.of("Apple","Banana","CustardApple","IceApple","Apple");
       List Softdrinks=List.of("Maaza","Coke","Pepsi","Thumsup","Sprite");



             System.out.println(Fruitnames.get(0));//Index-based search like an array
             System.out.println(Fruitnames.size());//Size() function returns total count of the elements contained in this collection.
             System.out.println(Softdrinks);//It returns the list elements
             System.out.println(Softdrinks.indexOf("Sprite"));//It returns the index
             System.out.println(Softdrinks.isEmpty());//It returns boolean value
             System.out.println(Fruitnames.get(4));
    }
}
