package CentricToAll12.CollectionFramework.List;

public class Lab190
{
    public static void main(String[] args)
    {

      Person Amit=new Person("Amit",28);
      Person Abhilash=new Person("Abhilash",29);
      Person Vimal=new Person("Vimal",30);

        Person[] objs = new Person[3];
        objs[0] = Amit;
        objs[1] = Abhilash;
        objs[2] = Vimal;


        //Note:In generic, if we store them we will fetch the data using the name or a age. In-order to overcome this collection framework is come into picture.

    }
}
