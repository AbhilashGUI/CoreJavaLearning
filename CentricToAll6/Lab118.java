package CentricToAll6;

public class Lab118 {
    public static void main(String[] args) {
        int[][] arr = {{24, 25, 26}, {34, 35, 36}, {44, 45, 46}, {54, 55, 56}, {64, 65, 66}};
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++)
            {
                System.out.print(arr[i][j] + "\t");   //It creates space between numbers
            }

            System.out.print("\n");

        }

    }
}


