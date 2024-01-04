package CentricToAll6;

public class Lab115
{
    public static void main(String[] args)
    {
        int[][] arr1=new int[3][4];
        //First array[3] represents 3 rows
        //second array[4] represents 4 columns


        //Declaring the values for the 1stArray/row
        arr1[0][0] = 12;
        arr1[0][1] = 14;
        arr1[0][2] = 16;
        arr1[0][3] = 18;

        //Declaring the values for the 2ndArray/2nd row
        arr1[1][0] = 22;
        arr1[1][1] = 24;
        arr1[1][2] = 26;
        arr1[1][3] = 28;


        //Declaring the values for the 3rdArray/3rd row
        arr1[2][0] = 32;
        arr1[2][1] = 34;
        arr1[2][2] = 36;
        arr1[2][3] = 38;


        for (int i = 0; i < arr1.length; i++)   //i denotes columns
        {
            for (int j = 0; j < arr1[i].length; j++)   //j denotes rows

            {
                System.out.print(arr1[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
