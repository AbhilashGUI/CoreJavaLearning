package CentricToAll6;

public class Lab116 {
    public static void main(String[] args) {
        int[][] arr2 = new int[5][3];
        //First array[5] represents 5 rows
        //second array[3] represents 3 columns


        //Declaring the values for the 1stArray/row
        arr2[0][0] = 3;
        arr2[0][1] = 6;
        arr2[0][2] = 9;


        //Declaring the values for the 2ndArray/2nd row
        arr2[1][0] = 4;
        arr2[1][1] = 8;
        arr2[1][2] = 12;


        //Declaring the values for the 3rd Array/3rd row
        arr2[2][0] = 5;
        arr2[2][1] = 10;
        arr2[2][2] = 15;


        //Declaring the values for the 4rth Array/4rth row
        arr2[3][0] = 6;
        arr2[3][1] = 12;
        arr2[3][2] = 18;


        //Declaring the values for the 5th Array/5th row
        arr2[4][0] = 7;
        arr2[4][1] = 14;
        arr2[4][2] = 21;


        for (int i = 0; i <= arr2.length - 1; i++) {
            for (int j = 0; j <= arr2[i].length - 1; j++) {
                System.out.print(arr2[i][j] + "\t");
            }

            System.out.println();
        }
    }

}
