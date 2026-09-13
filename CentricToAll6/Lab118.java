package CentricToAll6;

public class Lab118 {
    public static void main(String[] args) {

        //6 rows and 3 columns
        int[][] array={{10,20,30},{40,50,60},{70,80,90},{100,110,120},{130,140,150},{160,170,180}};

        for (int i=0;i< array.length;i++)
        {
            for (int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+ "\t");
            }
            System.out.print("\n");
        }


    }
}


