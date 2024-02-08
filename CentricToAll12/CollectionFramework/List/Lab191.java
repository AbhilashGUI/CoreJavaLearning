package CentricToAll12.CollectionFramework.List;

import java.util.List;

public class Lab191 {
    public static void main(String[] args) {

        //Collection framework:Focuses on main business logic
        //List: Contains the collection of elements and index based methods to insert,update delete and search. It can have duplicate elements too.

        List Fruits = List.of("Apple", "Orange", "Banana", "Grapes", "Orange");  //Note:List allows duplicate elements
        List Groceries=List.of("Rice","Wheat","Grains","Soaps","Detergent");



        System.out.println(Fruits.get(0));   //Index-based search like an array
        System.out.println(Groceries.size()); //Size() function returns total count of the elements contained in this collection.
        System.out.println(Groceries);     //It returns the list elements
        System.out.println(Fruits.indexOf("Banana"));
        System.out.println(Fruits.isEmpty());   //It returns boolean value
    }
}
