package CentricToAll6;

public class Lab114 {
    public static void main(String[] args) {
        //2D array
        int[][] arr = new int[3][3];
        //First array[3] represents 3 rows
        //second array[3] represents 3 columns

        //Declaring the values for the 1stArray/row
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;


        //Declaring the values for the 2ndArray/2nd row
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;

        //Declaring the values for the 3rdArray/3rd row
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;
   //Nested forloop to validate rows and columns
        for (int i = 0; i < arr.length; i++) {       //i denotes columns
            for (int j = 0; j < arr[i].length; j++) {  //j denotes rows

                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();

        }
    }
}
