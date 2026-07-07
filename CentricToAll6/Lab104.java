package CentricToAll6;

public class Lab104
{
    //Understanding the difference between == operator and equals() method.

    public static void main(String[] args)
    {

        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4};
        System.out.println(arr1==arr2);
       //It checks for the memory location which are not the same

        System.out.println(arr1.equals(arr2));
        //For arrays in integers, we don't compare the values, will compare the references which are not equal.

        int[] arr3=arr1;
        System.out.println(arr3 == arr1);
        //Since, array1 is assigned to array3 the value remains same.array3 is referring to array1

        int[] arr4=arr2;
        System.out.println(arr4!=arr2);

        //Tricky question
        arr3[1]=153;
        System.out.println(arr3[1]);
        System.out.println(arr1[1]);
        arr1[2]=13;
        System.out.println(arr1[2]);
        System.out.println(arr3[2]);

        //Any changes made to indexes of array3 it reflects to array1 as well, viceversa.

    }

}
