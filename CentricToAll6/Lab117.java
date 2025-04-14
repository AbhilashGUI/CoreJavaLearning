package CentricToAll6;

public class Lab117 {
    public static void main(String[] args) {
        int[][] arr = {{24, 25, 26}, {34, 35, 36}, {44, 45, 46}};  //We have single row and 3 columns
        for (int i = 0; i <= arr.length - 1; i++) {  //Here it is displaying the length of each column
            for(int j=0;j<=arr.length-1;j++)
            {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.print("\n");   //It moves to next line

        }

    }
}




