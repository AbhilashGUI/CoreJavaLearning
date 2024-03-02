package AssignmentPrograms;

public class Array2D
{
    public static void main(String[] args)
    {

        //Diagonal elements 2d array
        int[][] array2d=new int [3][3];
        //3 represents rows
        //3 represents columns


        //Defining the 3 arrays/rows with 3 columns
        array2d[0][0]=1;
        array2d[0][1]=2;
        array2d[0][2]=3;
        array2d[1][0]=4;
        array2d[1][1]=5;
        array2d[1][2]=6;
        array2d[2][0]=7;
        array2d[2][1]=8;
        array2d[2][2]=9;


        for (int i = 0; i < array2d.length ; i++) {
            for (int j = 0; j < array2d.length; j++) {
                if (i == j) {
                    System.out.println(""+ array2d[i][j]);
                }
                else {
                    array2d[i][j]=0;
                    System.out.println(""+ array2d[i][j]);

                }

            }


        }

            }
        }
        









