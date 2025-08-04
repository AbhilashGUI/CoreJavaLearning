package CentricToAll12.CollectionFramework.ComparableandComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab210
{
    public static void main(String[] args)
    {


        Subjects subject=new Subjects(23,"Maths");
        Subjects subject2=new Subjects(30,"Science");
        Subjects subject3=new Subjects(12,"Social");



        List<Subjects> subjects= new ArrayList<>();
        subjects.add(subject);
        subjects.add(subject2);
        subjects.add(subject3);
        System.out.println(subjects);


        //Comparable fetchings
        Collections.sort(subjects);
        System.out.println(subjects);


        //Comparator fetchings
        Collections.sort(subjects,new SortbySubjectsAsc());
        System.out.println(subjects);
        Collections.sort(subjects,new SortbySubjectsDsc());
        System.out.println(subjects);
        Collections.sort(subjects,new SortbySubjectsName());
        System.out.println(subjects);
        Collections.sort(subjects,new SortbySubjectNameDesc());
        System.out.println(subjects);
    }
}
