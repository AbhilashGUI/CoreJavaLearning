package CentricToAll6;

public class Lab104
{
    //Understanding the difference between == operator and equals() method.
    public static void main(String[] args)
    {

    int[] arr1={1,2,3,4,5};
    int[] arr2={1,2,3,4,5};
    System.out.println(arr1==arr2);
    //O/P is false, because the memory location of array1 and array 2 are different
        int[] arr3=arr1;
        System.out.println(arr3==arr1);
        //Since, array1 is assigned to array3 the value remains same.array3 is referring to array1


       System.out.println(arr1.equals(arr2));
       //For arrays in integers, we don't compare the values, will compare the references which are not equal.
        //However the array3 is referring to array1

    //Tricky question
        arr3[0]=133;  //Since, we have assigned arr3=arr1.
        // If the value of any element changes in array3 it reflects array1 as well
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);





    }

}
