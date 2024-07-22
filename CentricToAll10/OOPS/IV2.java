package CentricToAll10.OOPS;

public class IV2 {

public static void main(String[] args)
{
    Student s1=new Student();
    Student s2=new Student();
    Student s3=null;
    s1.learn();
    s2.learn();
    //s3.learn();  //It must throw an exception, since no object is declared for student s3 in this case.


}
}
class Student{

    int a;
    void learn()
    {
        System.out.println("Students are future leaders of a country");
    }
}
