package CentricToAll12.CollectionFramework.ComparableandComparatorInterface;

import java.util.Comparator;


//Note: We use comparator interface to fetch both string and integer values  using implements keyword for sorting mechanism
class SortbyStudentsAsc implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class SortbyStudentsDsc implements Comparator<Students>
{

    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}
class SortbyStudentsName implements Comparator<Students>
{

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortbyStudentNameDesc implements Comparator<Students>
{

    @Override
    public int compare(Students o1, Students o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
public class Students implements Comparable<Students> {


    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    int id;
    String name;

    //Post  implementing the tostring method, able to execute the code.
    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }





    //By implementing the comparable method, we can override/use the compareTo function. So that we compare the integer/String with other one.

    //return Integer.compare(this.id, student.id);

   // @Override
    //public int compareTo(Students student) {
        //return Integer.compare(this.id, student.id);

    @Override
    public int compareTo(Students student)
    {
        return CharSequence.compare(this.name,student.name);
    }

    //Note: Here, we are using Char-sequence.compare() function to fetch the data using string. Well the string are also displayed in the natural ordering format.

}

    //





