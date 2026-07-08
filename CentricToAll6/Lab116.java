package CentricToAll6;

public class Lab116 {
    public static void main(String[] args) {
        int[][] arr2 = new int[5][3];
        //First array[5] represents 5 rows
        //second array[3] represents 3 columns

        //First row and columns

        arr2[0][0]=17;
        arr2[0][1]=34;
        arr2[0][2]=51;

        //Second row and columns

        arr2[1][0]=18;
        arr2[1][1]=36;
        arr2[1][2]=54;

        //Third row and columns

        arr2[2][0]=19;
        arr2[2][1]=38;
        arr2[2][2]=57;

        //Fourth row and columns

        arr2[3][0]=20;
        arr2[3][1]=40;
        arr2[3][2]=60;

        //Fifth row and columns

        arr2[4][0]=21;
        arr2[4][1]=42;
        arr2[4][2]=63;

        for (int i=0;i<arr2.length;i++)
        {
            for (int j=0;j<arr2[i].length;j++)
            {

                System.out.print(arr2[i][j] + "\t");   //It creates space between numbers
            }
            System.out.println();

        }



    }
}
