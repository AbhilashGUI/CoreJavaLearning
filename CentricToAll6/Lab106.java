package CentricToAll6;

public class Lab106 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(arr1.length);  //It prints length of an array
        System.out.println(arr1); //It prints the memory location/reference location

        //Printing the index of an array using for loop
        //for (int i = 0; i <arr1.length; i++) {
           //System.out.println(arr1[i]);


            //OR

            //Printing the index of an array using for loop
            //Index=length-1
          for (int i=0; i<=arr1.length-1;i++)
          {
              System.out.println(arr1[i]);
          }
        }
    }







