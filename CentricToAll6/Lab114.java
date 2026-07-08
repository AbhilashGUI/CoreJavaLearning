package CentricToAll6;

public class Lab114 {

    public static void main(String[] args)
    {
        //2D array
        int[][] arr = new int[4][4];
        //First array[4] represents 4 rows
        //second array[4] represents 4 columns


        //First row and columns
        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[0][3]=40;

        //Second row and columns
        arr[1][0]=50;
        arr[1][1]=60;
        arr[1][2]=70;
        arr[1][3]=80;

        //Third row and columns
        arr[2][0]=90;
        arr[2][1]=100;
        arr[2][2]=110;
        arr[2][3]=120;

        //Fourth row and columns
        arr[3][0]=130;
        arr[3][1]=140;
        arr[3][2]=150;
        arr[3][3]=160;


        //i=Rows/Outerloop  and j=Columns/Innerloop

        for (int i=0;i< arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)   //arr[i]= No. of columns in a row (i)
            {
                System.out.print(arr[i][j] + "\t");   //It creates space between numbers
            }
            System.out.println();
        }


    }
}
