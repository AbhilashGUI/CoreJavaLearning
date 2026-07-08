package CentricToAll6;

public class Lab118 {
    public static void main(String[] args) {

        //6 rows and 3 columns
        int[][] arr = {{24, 25, 26}, {34, 35, 36}, {44, 45, 46}, {54, 55, 56}, {64, 65, 66},{74,75,76}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");   //It creates space between numbers
            }

            System.out.print("\n");  //moves to next line

        }

    }
}


