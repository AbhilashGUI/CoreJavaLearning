package AssignmentPrograms;

public class Array2D2
{
    public static void main(String[] args)
    {
        int[][]  array2d=new int[4][5];
        //4 represents rows
        //5 represents columns


        //Defining the 4 arrays/rows with 5 columns
        array2d[0][0]=1;
        array2d[0][1]=2;
        array2d[0][2]=3;
        array2d[0][3]=4;
        array2d[0][4]=5;
        array2d[1][0]=6;
        array2d[1][1]=7;
        array2d[1][2]=8;
        array2d[1][3]=9;
        array2d[1][4]=10;
        array2d[2][0]=11;
        array2d[2][1]=12;
        array2d[2][2]=13;
        array2d[2][3]=14;
        array2d[2][4]=15;
        array2d[3][0]=16;
        array2d[3][1]=17;
        array2d[3][2]=18;
        array2d[3][3]=19;
        array2d[3][4]=20;

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if(i==j)
                {
                    System.out.println(array2d[i][j]);
                }
            }

        }
























    }
}
