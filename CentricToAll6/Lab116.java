package CentricToAll6;

public class Lab116 {
    public static void main(String[] args) {
        int[][] arr2 = new int[5][3];
        //First array[5] represents 5 rows
        //second array[3] represents 3 columns


        //Declaring the values for the 1stArray/row
        arr2[0][0] = 18;
        arr2[0][1] = 19;
        arr2[0][2] = 20;


        //Declaring the values for the 2ndArray/2nd row
        arr2[1][0] = 28;
        arr2[1][1] = 29;
        arr2[1][2] = 30;


        //Declaring the values for the 3rd Array/3rd row
        arr2[2][0] = 38;
        arr2[2][1] = 39;
        arr2[2][2] = 40;


        //Declaring the values for the 4rth Array/4rth row
        arr2[3][0] = 48;
        arr2[3][1] = 49;
        arr2[3][2] = 50;


        //Declaring the values for the 5th Array/5th row
        arr2[4][0] = 58;
        arr2[4][1] = 59;
        arr2[4][2] = 60;

        for (int i = 0; i < arr2.length; i++) {         // i denotes columns
            for (int j = 0; j < arr2[i].length; j++) {  // j denotes rows

                System.out.print(arr2[i][j]+ "\t");

            }

            System.out.println();

        }
    }
}

