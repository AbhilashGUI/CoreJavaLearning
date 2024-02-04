package CentricToAll12.CollectionFramework.ComparableandComparatorInterface;


import java.util.Comparator;


//Note: We use comparator interface to fetch both string and integer values  using implements keyword for sorting mechanism
class SortbySubjectsAsc implements Comparator<Subjects>
{


    @Override
    public int compare(Subjects o1, Subjects o2) {
        return Integer.compare(o1.getMarks(),o2.getMarks());
    }
}


class SortbySubjectsDsc implements Comparator<Subjects>
{

    @Override
    public int compare(Subjects o1, Subjects o2) {
        return Integer.compare(o2.getMarks(),o1.getMarks());
    }
}

class  SortbySubjectsName implements Comparator<Subjects>
{

    @Override
    public int compare(Subjects o1, Subjects o2) {
        return o1.getSubjects().compareTo(o2.getSubjects());
    }
}

class SortbySubjectNameDesc implements Comparator<Subjects>
{


    @Override
    public int compare(Subjects o1, Subjects o2) {
        return o2.getSubjects().compareTo(o1.getSubjects());
    }
}
public class Subjects implements Comparable<Subjects> {

    public Subjects(int marks, String subjects) {
        this.marks = marks;
        this.subjects = subjects;
    }

    int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    String subjects;

    @Override
    public String toString() {
        return "Subjects{" +
                "marks=" + marks +
                ", subjects='" + subjects + '\'' +
                '}';
    }

    //return Integer.compare(this.id, student.id);

    //@Override
    //public int compareTo(Subjects subjects) {
      //  return Integer.compare(this.marks, subjects.marks);


    //Note: Here, we are using Char-sequence.compare() function to fetch the data using string. Well the string are also displayed in the natural ordering format.
        @Override
        public int compareTo (Subjects subjects){
            return CharSequence.compare(this.subjects,subjects.subjects);

        }
    }


