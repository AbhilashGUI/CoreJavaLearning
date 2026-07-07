package CentricToAll6;

public class Lab107 {

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println("Length of an array " + arr1.length);
        System.out.println("Reference location " + arr1);

        //Fetching the indexes in an array
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.println("Indexes defined in an array " + arr1[i]);

        }

        System.out.println("Retrieving the specified elements from an array using index");
        System.out.println(arr1[3]);


    }
}



