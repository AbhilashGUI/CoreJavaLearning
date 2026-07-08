package CentricToAll6;

public class Lab115 {
    public static void main(String[] args) {


        int[][] arr1 = new int[3][5];

        //First array[3] represents 3 rows
        //second array[5] represents 5 columns

        //First row and columns
        arr1[0][0] = 12;
        arr1[0][1] = 24;
        arr1[0][2] = 36;
        arr1[0][3] = 48;
        arr1[0][4] = 60;

        //Second row and columns
        arr1[1][0] = 14;
        arr1[1][1] = 28;
        arr1[1][2] = 42;
        arr1[1][3] = 56;
        arr1[1][4] = 70;

        //Third row and columns
        arr1[2][0] = 16;
        arr1[2][1] = 32;
        arr1[2][2] = 48;
        arr1[2][3] = 64;
        arr1[2][4] = 80;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");  //It creates space between numbers
            }
            System.out.println();
        }


    }
}
