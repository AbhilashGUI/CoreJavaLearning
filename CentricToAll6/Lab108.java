package CentricToAll6;

public class Lab108
{
    public static void main(String[] args)
    {
        String[] continents={"Asia","Africa","Europe","NorthAmerica","SouthAmerica","Australia","Antarctica"};


        System.out.println("Elements of an array are listed below");
        for (int i=0; i<=continents.length-1; i++)
        {
            System.out.println(continents[i]);
        }


        System.out.println("Length of an array is : " + continents.length );

        System.out.println("I belong to " + continents[0]+ " Continent");

    }
}
