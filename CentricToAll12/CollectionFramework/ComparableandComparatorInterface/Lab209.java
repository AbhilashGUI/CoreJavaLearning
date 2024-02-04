package CentricToAll12.CollectionFramework.ComparableandComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab209
{
    public static void main(String[] args)
    {

        Students student=new Students(1,"Abhilash");
        Students student2=new Students(12,"Amit");
        Students student3=new Students(8,"Amrith");


        //Adding the objects in the arraylist

        List<Students> students=new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        Collections.sort(students,new SortbyStudentsAsc());
        System.out.println(students);
        Collections.sort(students,new SortbyStudentsDsc());
        System.out.println(students);
        Collections.sort(students,new SortbyStudentsName());
        System.out.println(students);
        Collections.sort(students,new SortbyStudentNameDesc());
        System.out.println(students);





    }
}
