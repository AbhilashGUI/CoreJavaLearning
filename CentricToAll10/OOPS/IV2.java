package CentricToAll10.OOPS;

public class IV2 {

public static void main(String[] args)
{
    Student s1=new Student();
    Student s2=new Student();
    Student s3=null;
    s1.learn();
    s2.learn();
    s3.learn();  //It throws a null pointer exception


}
}
class Student{

    int a;
    void learn()
    {
        System.out.println("Students are future leaders of a country");
    }
}
