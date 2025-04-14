package CentricToAll6;

public class Lab114 {
    public static void main(String[] args) {
        //2D array
        int[][] arr = new int[3][3];
        //First array[3] represents 3 rows
        //second array[3] represents 3 columns

        //Declaring the values for the 1stArray/row

        arr[0][0] = 25;
        arr[0][1] = 50;
        arr[0][2] = 75;

        //Declaring the values for the 2ndArray/2nd row

        arr[1][0] = 100;
        arr[1][1] = 125;
        arr[1][2] = 150;

        //Declaring the values for the 3rdArray/3rd row

        arr[2][0] = 175;
        arr[2][1] = 200;
        arr[2][2] = 225;

        //Nested for loop to validate rows and columns

        for (int i = 0; i <= arr.length-1; i++)
        {
            for(int j=0;j<=arr[i].length-1;j++)
            {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
            }

        }
    }

