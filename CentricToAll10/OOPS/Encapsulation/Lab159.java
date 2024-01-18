package CentricToAll10.OOPS.Encapsulation;

import CentricToAll10.OOPS.Encapsulation.Person;
import CentricToAll10.OOPS.Encapsulation.Student;

public class Lab159
{
    public static void main(String[] args)
    {
        //Encapsulation concept: It helps to promote the principle of data hiding.
        //That can be achieved by declaring the object's data fields as private and providing Getter and setter methods to access and modify the data

         //RUNNER OF STUDENTCLASS//


        Student s=new Student();
        s.name="Abhilash";    //Data is not hidden, hence it can be manipulated
        s.name="Vicky";

        //It should be condition based: Getter and Setter. They should be properly hidden.


        //RUNNER OF PERSONCLASS//

        Person p1=new Person();
        p1.id=27;
        p1.id=79;           //Data is not hidden, hence it can be manipulated
        p1.bal=97000;









    }


}
