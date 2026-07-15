package CentricToAll12.CollectionFramework.ComparableandComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab209 {

    public static void main(String[] args)
    {
        Students students1=new Students(1,"Ranchod");
        Students students2=new Students(9,"Madhav");
        Students students3=new Students(33,"Krishna");
        Students students4=new Students(51,"Govardhan");


        List<Students> students=new ArrayList<>();
        students.add(students1);
        students.add(students2);
        students.add(students3);
        students.add(students4);
        System.out.println(students);

        Collections.sort(students);

    }
}
