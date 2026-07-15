package CentricToAll12.CollectionFramework.ComparableandComparatorInterface;

public class Students implements Comparable<Students> {


    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
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

    public String toString() {
        return "{id = " + id + " , name = " + name + "}";
    }

    //@Override
    //public int compareTo(Students o) {
    //return Integer.compare(this.id, o.id);


    @Override
    public int compareTo(Students o) {
        return CharSequence.compare(this.name, o.name);

    }
}